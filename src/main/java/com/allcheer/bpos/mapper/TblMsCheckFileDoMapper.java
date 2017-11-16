package com.allcheer.bpos.mapper;

import com.allcheer.bpos.entity.TblMsCheckFileDo;
import com.allcheer.bpos.entity.TblMsCheckFileDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblMsCheckFileDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MS_CHECK_FILE
     *
     * @mbggenerated
     */
    int countByExample(TblMsCheckFileDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MS_CHECK_FILE
     *
     * @mbggenerated
     */
    int deleteByExample(TblMsCheckFileDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MS_CHECK_FILE
     *
     * @mbggenerated
     */
    int insert(TblMsCheckFileDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MS_CHECK_FILE
     *
     * @mbggenerated
     */
    int insertSelective(TblMsCheckFileDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MS_CHECK_FILE
     *
     * @mbggenerated
     */
    List<TblMsCheckFileDo> selectByExample(TblMsCheckFileDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MS_CHECK_FILE
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TblMsCheckFileDo record, @Param("example") TblMsCheckFileDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MS_CHECK_FILE
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TblMsCheckFileDo record, @Param("example") TblMsCheckFileDoExample example);
}