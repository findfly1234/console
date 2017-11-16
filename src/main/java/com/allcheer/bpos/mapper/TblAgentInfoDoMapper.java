package com.allcheer.bpos.mapper;

import com.allcheer.bpos.entity.TblAgentInfoDo;
import com.allcheer.bpos.entity.TblAgentInfoDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TblAgentInfoDoMapper {


    int countByCondition(Map<String,String> condition);

    List<TblAgentInfoDo> selectByCondition(Map<String,String> condition);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_INFO
     *
     * @mbggenerated
     */
    int countByExample(TblAgentInfoDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_INFO
     *
     * @mbggenerated
     */
    int deleteByExample(TblAgentInfoDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_INFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String memberId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_INFO
     *
     * @mbggenerated
     */
    int insert(TblAgentInfoDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_INFO
     *
     * @mbggenerated
     */
    int insertSelective(TblAgentInfoDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_INFO
     *
     * @mbggenerated
     */
    List<TblAgentInfoDo> selectByExample(TblAgentInfoDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_INFO
     *
     * @mbggenerated
     */
    TblAgentInfoDo selectByPrimaryKey(String memberId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_INFO
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TblAgentInfoDo record, @Param("example") TblAgentInfoDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_INFO
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TblAgentInfoDo record, @Param("example") TblAgentInfoDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TblAgentInfoDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TblAgentInfoDo record);
}