package com.allcheer.bpos.mapper;

import com.allcheer.bpos.entity.TBLCoreCardBinDO;
import com.allcheer.bpos.entity.TBLCoreCardBinDOExample;
import com.allcheer.bpos.entity.TBLCoreCardBinDOKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBLCoreCardBinDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BPOS.TBL_CORE_CARD_BIN
     *
     * @mbggenerated
     */
    int countByExample(TBLCoreCardBinDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BPOS.TBL_CORE_CARD_BIN
     *
     * @mbggenerated
     */
    int deleteByExample(TBLCoreCardBinDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BPOS.TBL_CORE_CARD_BIN
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(TBLCoreCardBinDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BPOS.TBL_CORE_CARD_BIN
     *
     * @mbggenerated
     */
    int insert(TBLCoreCardBinDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BPOS.TBL_CORE_CARD_BIN
     *
     * @mbggenerated
     */
    int insertSelective(TBLCoreCardBinDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BPOS.TBL_CORE_CARD_BIN
     *
     * @mbggenerated
     */
    List<TBLCoreCardBinDO> selectByExample(TBLCoreCardBinDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BPOS.TBL_CORE_CARD_BIN
     *
     * @mbggenerated
     */
    TBLCoreCardBinDO selectByPrimaryKey(TBLCoreCardBinDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BPOS.TBL_CORE_CARD_BIN
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TBLCoreCardBinDO record, @Param("example") TBLCoreCardBinDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BPOS.TBL_CORE_CARD_BIN
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TBLCoreCardBinDO record, @Param("example") TBLCoreCardBinDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BPOS.TBL_CORE_CARD_BIN
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TBLCoreCardBinDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BPOS.TBL_CORE_CARD_BIN
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TBLCoreCardBinDO record);
}