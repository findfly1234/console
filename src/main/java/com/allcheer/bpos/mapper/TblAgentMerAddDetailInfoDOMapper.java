package com.allcheer.bpos.mapper;

import com.allcheer.bpos.entity.TblAgentMerAddDetailInfoDO;
import com.allcheer.bpos.entity.TblAgentMerAddDetailInfoDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblAgentMerAddDetailInfoDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_MER_ADD_DETAIL_INFO
     *
     * @mbggenerated
     */
    int countByExample(TblAgentMerAddDetailInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_MER_ADD_DETAIL_INFO
     *
     * @mbggenerated
     */
    int deleteByExample(TblAgentMerAddDetailInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_MER_ADD_DETAIL_INFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String batchNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_MER_ADD_DETAIL_INFO
     *
     * @mbggenerated
     */
    int insert(TblAgentMerAddDetailInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_MER_ADD_DETAIL_INFO
     *
     * @mbggenerated
     */
    int insertSelective(TblAgentMerAddDetailInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_MER_ADD_DETAIL_INFO
     *
     * @mbggenerated
     */
    List<TblAgentMerAddDetailInfoDO> selectByExample(TblAgentMerAddDetailInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_MER_ADD_DETAIL_INFO
     *
     * @mbggenerated
     */
    TblAgentMerAddDetailInfoDO selectByPrimaryKey(String batchNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_MER_ADD_DETAIL_INFO
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TblAgentMerAddDetailInfoDO record, @Param("example") TblAgentMerAddDetailInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_MER_ADD_DETAIL_INFO
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TblAgentMerAddDetailInfoDO record, @Param("example") TblAgentMerAddDetailInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_MER_ADD_DETAIL_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TblAgentMerAddDetailInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_AGENT_MER_ADD_DETAIL_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TblAgentMerAddDetailInfoDO record);
}