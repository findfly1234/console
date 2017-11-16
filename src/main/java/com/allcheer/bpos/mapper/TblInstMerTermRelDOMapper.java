package com.allcheer.bpos.mapper;

import com.allcheer.bpos.entity.TblInstMerTermRelDO;
import com.allcheer.bpos.entity.TblInstMerTermRelDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblInstMerTermRelDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_MER_TERM_REL
     *
     * @mbggenerated
     */
    int countByExample(TblInstMerTermRelDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_MER_TERM_REL
     *
     * @mbggenerated
     */
    int deleteByExample(TblInstMerTermRelDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_MER_TERM_REL
     *
     * @mbggenerated
     */
    int insert(TblInstMerTermRelDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_MER_TERM_REL
     *
     * @mbggenerated
     */
    int insertSelective(TblInstMerTermRelDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_MER_TERM_REL
     *
     * @mbggenerated
     */
    List<TblInstMerTermRelDO> selectByExample(TblInstMerTermRelDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_MER_TERM_REL
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TblInstMerTermRelDO record, @Param("example") TblInstMerTermRelDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_MER_TERM_REL
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TblInstMerTermRelDO record, @Param("example") TblInstMerTermRelDOExample example);
}