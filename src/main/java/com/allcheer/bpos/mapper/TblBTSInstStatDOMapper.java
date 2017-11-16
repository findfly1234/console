package com.allcheer.bpos.mapper;

import com.allcheer.bpos.entity.TblBTSInstStatDO;
import com.allcheer.bpos.entity.TblBTSInstStatDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblBTSInstStatDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_INST_STAT
     *
     * @mbggenerated
     */
    int countByExample(TblBTSInstStatDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_INST_STAT
     *
     * @mbggenerated
     */
    int deleteByExample(TblBTSInstStatDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_INST_STAT
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String instCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_INST_STAT
     *
     * @mbggenerated
     */
    int insert(TblBTSInstStatDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_INST_STAT
     *
     * @mbggenerated
     */
    int insertSelective(TblBTSInstStatDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_INST_STAT
     *
     * @mbggenerated
     */
    List<TblBTSInstStatDO> selectByExample(TblBTSInstStatDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_INST_STAT
     *
     * @mbggenerated
     */
    TblBTSInstStatDO selectByPrimaryKey(String instCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_INST_STAT
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TblBTSInstStatDO record, @Param("example") TblBTSInstStatDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_INST_STAT
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TblBTSInstStatDO record, @Param("example") TblBTSInstStatDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_INST_STAT
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TblBTSInstStatDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_INST_STAT
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TblBTSInstStatDO record);
}