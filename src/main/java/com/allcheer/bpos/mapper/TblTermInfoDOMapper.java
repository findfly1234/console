package com.allcheer.bpos.mapper;

import com.allcheer.bpos.entity.TblTermInfoDO;
import com.allcheer.bpos.entity.TblTermInfoDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblTermInfoDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TERM_INFO
     *
     * @mbggenerated
     */
    int countByExample(TblTermInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TERM_INFO
     *
     * @mbggenerated
     */
    int deleteByExample(TblTermInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TERM_INFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String termId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TERM_INFO
     *
     * @mbggenerated
     */
    int insert(TblTermInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TERM_INFO
     *
     * @mbggenerated
     */
    int insertSelective(TblTermInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TERM_INFO
     *
     * @mbggenerated
     */
    List<TblTermInfoDO> selectByExample(TblTermInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TERM_INFO
     *
     * @mbggenerated
     */
    TblTermInfoDO selectByPrimaryKey(String termId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TERM_INFO
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TblTermInfoDO record, @Param("example") TblTermInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TERM_INFO
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TblTermInfoDO record, @Param("example") TblTermInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TERM_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TblTermInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TERM_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TblTermInfoDO record);
}