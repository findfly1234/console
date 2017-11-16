package com.allcheer.bpos.controller;


import com.allcheer.bpos.domain.FuncBO;
import com.allcheer.bpos.domain.RoleBO;
import com.allcheer.bpos.form.RoleFuncForm;
import com.allcheer.bpos.form.RoleManagementForm;
import com.allcheer.bpos.mapper.SeqMapper;
import com.allcheer.bpos.service.FuncService;
import com.allcheer.bpos.service.RoleService;
import com.allcheer.bpos.util.Pagination;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fireWorks on 2016/2/2.
 */
@Controller
public class RoleManagementController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private FuncService funcService;


    @Autowired
    private SeqMapper seqMapper;


    private static final Logger logger = LoggerFactory.getLogger(RoleManagementController.class);

    @RequestMapping(value = "/roleManagement/addnewpage", method = RequestMethod.GET)
    public String goAddNewPage(@ModelAttribute("roleManagementForm") RoleManagementForm roleManagementForm) {

        return "addnewrole";
    }

    @ResponseBody
    @RequestMapping(value = "/roleManagement/addnew", method = RequestMethod.POST)
    public Map addNewRole(@ModelAttribute("roleManagementForm") RoleManagementForm roleManagementForm) {
        Map resultMap = new HashMap();
        String roleName = roleManagementForm.getRoleName();

        RoleBO roleBO = new RoleBO();
        roleBO.setRoleId(String.valueOf(seqMapper.getTblBTSSysRoleIdSeq()));
        roleBO.setRoleName(roleName);
        roleBO.setRoleDisableTag("1");
        roleBO.setRoleRemark(roleManagementForm.getRoleRemark());

        resultMap = roleService.addNewRole(roleBO);

        return resultMap;
    }

    @RequestMapping(value = "/roleManagement/query_all_role", method = RequestMethod.GET)
    public String queryAllRole(@ModelAttribute("roleManagementForm") RoleManagementForm roleManagementForm) {

        RoleBO roleBO = new RoleBO();
        String pageCurrent = roleManagementForm.getPageCurrent();
        String pageSize = roleManagementForm.getPageSize();

        roleBO.setPageCurrent(Integer.valueOf(pageCurrent));
        roleBO.setPageSize(Integer.valueOf(pageSize));

        Pagination<RoleBO> roleBOPagination = roleService.getAllRole(roleBO);
        roleManagementForm.setPagination(roleBOPagination);

        return "rolemanalist";

    }

    @RequestMapping(value = "/roleManagement/query_a_role", method = RequestMethod.POST)
    public String queryTheRole(@ModelAttribute("roleManagementForm") RoleManagementForm roleManagementForm) {

        RoleBO roleBO = new RoleBO();
        roleBO.setRoleName(roleManagementForm.getRoleName());//角色名
        roleBO.setRoleRemark(roleManagementForm.getRoleRemark());//组标识
        roleBO.setRoleDisableTag(roleManagementForm.getRoleDisableTag());//状态
        String pageCurrent = roleManagementForm.getPageCurrent();
        String pageSize = roleManagementForm.getPageSize();

        roleBO.setPageCurrent(Integer.valueOf(pageCurrent));
        roleBO.setPageSize(Integer.valueOf(pageSize));

        Pagination<RoleBO> roleBOPagination = roleService.getTheRole(roleBO);
        roleManagementForm.setPagination(roleBOPagination);

        return "rolemanalist";

    }

    @RequestMapping(value = "/roleManagement/edit", method = RequestMethod.GET)
    public String modifyRoleDetails2(HttpServletRequest request, RoleFuncForm roleFuncForm) {

        String rid = request.getParameter("rid");
        RoleBO roleBO = roleService.getById(rid);
        roleFuncForm.setRoleId(rid);
        roleFuncForm.setRoleName(roleBO.getRoleName());
        if (roleBO.getRoleDisableTag().trim().equals("1")) {
            roleFuncForm.setRoleDisableTag("启用");

        } else {
            roleFuncForm.setRoleDisableTag("禁用");
        }

        List<FuncBO> funcBOList = funcService.getAllFuncList(rid);
        String checkIds = "";
        if (funcBOList != null && funcBOList.size() > 0) {
            for (FuncBO funcBO : funcBOList) {
                if ("已授权".equals(funcBO.getChecked())) {
                    if (checkIds == "") {
                        checkIds += funcBO.getFuncId();
                    } else {
                        checkIds += "," + funcBO.getFuncId();
                    }
                }
            }
        }
        roleFuncForm.setOldRoleChecked(checkIds);
        roleFuncForm.setAllFuncBOList(funcBOList);

        return "modifyroleresource";
    }

    @ResponseBody
    @RequestMapping(value = "/roleManagement/update_rolefunc", method = RequestMethod.POST)
    public Map updateRoleFuncList(@ModelAttribute("roleFuncForm") RoleFuncForm roleFuncForm, HttpServletRequest request) {
        String checkIds = roleFuncForm.getRoleChecked();
        String oldCheckIds = roleFuncForm.getOldRoleChecked();
        String roleId = roleFuncForm.getRoleId();
        Map resultMap = new HashMap();
        if (checkIds == null || "".equals(checkIds)) {//提交的权限集为空，1、没有权限操作提交 2、有禁用权限操作
            if (oldCheckIds == null || "".equals(oldCheckIds)) {
                //第一种情况，无权限操作提交
                logger.error("未选择角色权限设置项");
                resultMap.put("statusCode", 300);
                resultMap.put("message", "操作失败!");
            } else {
                //第二种情况，有禁用权限操作，需更新权限状态
                try {
                    String[] checkIdlist = oldCheckIds.split("[,]");
                    for (int i = 0; i < checkIdlist.length; i++) {
                        resultMap = roleService.cancelRoleResouce(checkIdlist[i], roleId);
                    }
                } catch (Exception ex) {
                    logger.error(ex.getMessage());
                    resultMap.put("statusCode", 300);
                    resultMap.put("message", "操作失败!");

                }
            }
        } else {
            //有权限集提交，需与原有权限集交叉遍历，判断是否有需要更新的记录
            List<String> addCheckIdList = new ArrayList<>();
            List<String> cancelCheckIdList = new ArrayList<>();
            String[] checkIdsArray = checkIds.split("[,]");
            if (oldCheckIds == null || "".equals(oldCheckIds)) {
                //原权限集为空，则直接执行添加新权限集
                for (int i = 0; i < checkIdsArray.length; i++) {
                    addCheckIdList.add(checkIdsArray[i]);
                }
            } else {
                //原权限集不为空，需要遍历提取结果集
                List<String> checkIdList = java.util.Arrays.asList(checkIdsArray);
                List<String> oldCheckIdList = java.util.Arrays.asList(oldCheckIds.split("[,]"));
                for (int i = 0; i < checkIdList.size(); i++) {//新权限集
                    if (!oldCheckIdList.contains(checkIdList.get(i))) {
                        //原权限集中没有此权限，需【授权】该权限
                        addCheckIdList.add(checkIdList.get(i));
                    }
                }
                for (int j = 0; j < oldCheckIdList.size(); j++) {//原权限集
                    if (!checkIdList.contains(oldCheckIdList.get(j))) {
                        //新权限集中没有此权限，需 【禁用】该权限
                        cancelCheckIdList.add(oldCheckIdList.get(j));
                    }
                }
            }
            try {
                if (addCheckIdList.size() > 0) {//有新加权限
                    for (String id : addCheckIdList) {
                        resultMap = roleService.addRoleResouce(id, roleId);
                    }
                }
                if (cancelCheckIdList.size() > 0) {//有删除权限
                    for (String id : cancelCheckIdList) {
                        resultMap = roleService.cancelRoleResouce(id, roleId);
                    }
                }
            } catch (Exception ex) {
                logger.error(ex.getMessage());
                resultMap.put("statusCode", 300);
                resultMap.put("message", "操作失败!");

            }
            resultMap.put("statusCode", 200);
            resultMap.put("message", "修改成功!");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping(value = "/roleManagement/roleenable", method = RequestMethod.POST)
    public Map roleEnable(@ModelAttribute("roleManagementForm") RoleManagementForm roleManagementForm, HttpServletRequest request) {
        String id = request.getParameter("id");

        Map resultMap = new HashMap();
        try {
            resultMap = roleService.setRoleEnable(id);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            resultMap.put("statusCode", 300);
            resultMap.put("message", "操作失败!");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping(value = "/roleManagement/roledisable", method = RequestMethod.POST)
    public Map roleDisable(@ModelAttribute("roleManagementForm") RoleManagementForm roleManagementForm, HttpServletRequest request) {
        String id = request.getParameter("id");
        Map resultMap = new HashMap();
        try {
            resultMap = roleService.setRoleDisable(id);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            resultMap.put("statusCode", 300);
            resultMap.put("message", "操作失败!");

        }
        return resultMap;

    }

    @ResponseBody
    @RequestMapping(value = "/roleManagement/addauthority", method = RequestMethod.POST)
    public Map addAuthorityForRole(@ModelAttribute("roleManagementForm") RoleManagementForm roleManagementForm, HttpServletRequest request) {
        String sourceId = request.getParameter("sid");
        String roleId = request.getParameter("rid");
        Map resultMap = new HashMap();
        try {
            resultMap = roleService.addRoleResouce(sourceId, roleId);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            resultMap.put("statusCode", 300);
            resultMap.put("message", "操作失败!");

        }
        return resultMap;

    }

    @ResponseBody
    @RequestMapping(value = "/roleManagement/cancelauthority", method = RequestMethod.POST)
    public Map cancelAuthorityForRole(@ModelAttribute("roleManagementForm") RoleManagementForm roleManagementForm, HttpServletRequest request) {
        String sourceId = request.getParameter("sid");
        String roleId = request.getParameter("rid");
        Map resultMap = new HashMap();
        try {
            resultMap = roleService.cancelRoleResouce(sourceId, roleId);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            resultMap.put("statusCode", 300);
            resultMap.put("message", "操作失败!");

        }
        return resultMap;

    }
}
