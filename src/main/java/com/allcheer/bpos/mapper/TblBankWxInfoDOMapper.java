package com.allcheer.bpos.mapper;

import com.allcheer.bpos.entity.TblBankWxInfoDO;
import com.allcheer.bpos.entity.TblBankWxInfoDOExample;
import com.allcheer.bpos.entity.TblBankWxInfoDOKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblBankWxInfoDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    int countByExample(TblBankWxInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    int deleteByExample(TblBankWxInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(TblBankWxInfoDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    int insert(TblBankWxInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    int insertSelective(TblBankWxInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    List<TblBankWxInfoDO> selectByExample(TblBankWxInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    TblBankWxInfoDO selectByPrimaryKey(TblBankWxInfoDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TblBankWxInfoDO record, @Param("example") TblBankWxInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TblBankWxInfoDO record, @Param("example") TblBankWxInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TblBankWxInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TblBankWxInfoDO record);
}