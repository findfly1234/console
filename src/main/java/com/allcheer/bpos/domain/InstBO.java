package com.allcheer.bpos.domain;

/**
 * Created by fireWorks on 2016/2/27.
 */
public class InstBO extends BaseBO{
    private String instId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_BTS_INST.INST_CODE
     *
     * @mbggenerated
     */
    private String instCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_BTS_INST.INST_TYPE
     *
     * @mbggenerated
     */
    private String instType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_BTS_INST.BTS_MER_ID
     *
     * @mbggenerated
     */
    private String btsMerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_BTS_INST.INST_NAME
     *
     * @mbggenerated
     */
    private String instName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_BTS_INST.CREATE_TIME
     *
     * @mbggenerated
     */
    private String createTime;

    private String usrCreateBy;
    private String instEmail;

    private String instTelphome;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_BTS_INST.UPDATE_TIME
     *
     * @mbggenerated
     */
    private String updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_BTS_INST.INST_ID
     *
     * @return the value of TBL_BTS_INST.INST_ID
     *
     * @mbggenerated
     */
    public String getInstId() {
        return instId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_BTS_INST.INST_ID
     *
     * @param instId the value for TBL_BTS_INST.INST_ID
     *
     * @mbggenerated
     */
    public void setInstId(String instId) {
        this.instId = instId == null ? null : instId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_BTS_INST.INST_CODE
     *
     * @return the value of TBL_BTS_INST.INST_CODE
     *
     * @mbggenerated
     */
    public String getInstCode() {
        return instCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_BTS_INST.INST_CODE
     *
     * @param instCode the value for TBL_BTS_INST.INST_CODE
     *
     * @mbggenerated
     */
    public void setInstCode(String instCode) {
        this.instCode = instCode == null ? null : instCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_BTS_INST.INST_TYPE
     *
     * @return the value of TBL_BTS_INST.INST_TYPE
     *
     * @mbggenerated
     */
    public String getInstType() {
        return instType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_BTS_INST.INST_TYPE
     *
     * @param instType the value for TBL_BTS_INST.INST_TYPE
     *
     * @mbggenerated
     */
    public void setInstType(String instType) {
        this.instType = instType == null ? null : instType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_BTS_INST.BTS_MER_ID
     *
     * @return the value of TBL_BTS_INST.BTS_MER_ID
     *
     * @mbggenerated
     */
    public String getBtsMerId() {
        return btsMerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_BTS_INST.BTS_MER_ID
     *
     * @param btsMerId the value for TBL_BTS_INST.BTS_MER_ID
     *
     * @mbggenerated
     */
    public void setBtsMerId(String btsMerId) {
        this.btsMerId = btsMerId == null ? null : btsMerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_BTS_INST.INST_NAME
     *
     * @return the value of TBL_BTS_INST.INST_NAME
     *
     * @mbggenerated
     */
    public String getInstName() {
        return instName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_BTS_INST.INST_NAME
     *
     * @param instName the value for TBL_BTS_INST.INST_NAME
     *
     * @mbggenerated
     */
    public void setInstName(String instName) {
        this.instName = instName == null ? null : instName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_BTS_INST.CREATE_TIME
     *
     * @return the value of TBL_BTS_INST.CREATE_TIME
     *
     * @mbggenerated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_BTS_INST.CREATE_TIME
     *
     * @param createTime the value for TBL_BTS_INST.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }


    public String getUsrCreateBy() {
        return usrCreateBy;
    }

    public void setUsrCreateBy(String usrCreateBy) {
        this.usrCreateBy = usrCreateBy;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_BTS_INST.UPDATE_TIME
     *
     * @return the value of TBL_BTS_INST.UPDATE_TIME
     *
     * @mbggenerated
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_BTS_INST.UPDATE_TIME
     *
     * @param updateTime the value for TBL_BTS_INST.UPDATE_TIME
     *
     * @mbggenerated
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

	public String getInstEmail() {
		return instEmail;
	}

	public void setInstEmail(String instEmail) {
		this.instEmail = instEmail;
	}

	public String getInstTelphome() {
		return instTelphome;
	}

	public void setInstTelphome(String instTelphome) {
		this.instTelphome = instTelphome;
	}
}
