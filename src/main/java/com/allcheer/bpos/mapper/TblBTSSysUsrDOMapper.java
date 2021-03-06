package com.allcheer.bpos.mapper;

import com.allcheer.bpos.entity.TblBTSSysUsrDO;
import com.allcheer.bpos.entity.TblBTSSysUsrDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblBTSSysUsrDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    int countByExample(TblBTSSysUsrDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    int deleteByExample(TblBTSSysUsrDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String usrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    int insert(TblBTSSysUsrDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    int insertSelective(TblBTSSysUsrDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    List<TblBTSSysUsrDO> selectByExample(TblBTSSysUsrDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    TblBTSSysUsrDO selectByPrimaryKey(String usrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TblBTSSysUsrDO record, @Param("example") TblBTSSysUsrDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TblBTSSysUsrDO record, @Param("example") TblBTSSysUsrDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TblBTSSysUsrDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TblBTSSysUsrDO record);
}