package com.allcheer.bpos.mapper;

import com.allcheer.bpos.entity.TblChannelMerKeyInfoDO;
import com.allcheer.bpos.entity.TblChannelMerKeyInfoDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblChannelMerKeyInfoDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    int countByExample(TblChannelMerKeyInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    int deleteByExample(TblChannelMerKeyInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    int insert(TblChannelMerKeyInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    int insertSelective(TblChannelMerKeyInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    List<TblChannelMerKeyInfoDO> selectByExample(TblChannelMerKeyInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TblChannelMerKeyInfoDO record, @Param("example") TblChannelMerKeyInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TblChannelMerKeyInfoDO record, @Param("example") TblChannelMerKeyInfoDOExample example);
}