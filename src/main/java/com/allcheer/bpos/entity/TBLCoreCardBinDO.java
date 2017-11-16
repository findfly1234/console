package com.allcheer.bpos.entity;

public class TBLCoreCardBinDO extends TBLCoreCardBinDOKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BPOS.TBL_CORE_CARD_BIN.CARD_NO_LEN
     *
     * @mbggenerated
     */
    private Integer cardNoLen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BPOS.TBL_CORE_CARD_BIN.BIN_LEN
     *
     * @mbggenerated
     */
    private Integer binLen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BPOS.TBL_CORE_CARD_BIN.DEBIT_CREDIT
     *
     * @mbggenerated
     */
    private String debitCredit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BPOS.TBL_CORE_CARD_BIN.CUP_LOG_FLAG
     *
     * @mbggenerated
     */
    private String cupLogFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BPOS.TBL_CORE_CARD_BIN.BIN_DESC
     *
     * @mbggenerated
     */
    private String binDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BPOS.TBL_CORE_CARD_BIN.CARD_NO_LEN
     *
     * @return the value of BPOS.TBL_CORE_CARD_BIN.CARD_NO_LEN
     *
     * @mbggenerated
     */
    public Integer getCardNoLen() {
        return cardNoLen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BPOS.TBL_CORE_CARD_BIN.CARD_NO_LEN
     *
     * @param cardNoLen the value for BPOS.TBL_CORE_CARD_BIN.CARD_NO_LEN
     *
     * @mbggenerated
     */
    public void setCardNoLen(Integer cardNoLen) {
        this.cardNoLen = cardNoLen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BPOS.TBL_CORE_CARD_BIN.BIN_LEN
     *
     * @return the value of BPOS.TBL_CORE_CARD_BIN.BIN_LEN
     *
     * @mbggenerated
     */
    public Integer getBinLen() {
        return binLen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BPOS.TBL_CORE_CARD_BIN.BIN_LEN
     *
     * @param binLen the value for BPOS.TBL_CORE_CARD_BIN.BIN_LEN
     *
     * @mbggenerated
     */
    public void setBinLen(Integer binLen) {
        this.binLen = binLen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BPOS.TBL_CORE_CARD_BIN.DEBIT_CREDIT
     *
     * @return the value of BPOS.TBL_CORE_CARD_BIN.DEBIT_CREDIT
     *
     * @mbggenerated
     */
    public String getDebitCredit() {
        return debitCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BPOS.TBL_CORE_CARD_BIN.DEBIT_CREDIT
     *
     * @param debitCredit the value for BPOS.TBL_CORE_CARD_BIN.DEBIT_CREDIT
     *
     * @mbggenerated
     */
    public void setDebitCredit(String debitCredit) {
        this.debitCredit = debitCredit == null ? null : debitCredit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BPOS.TBL_CORE_CARD_BIN.CUP_LOG_FLAG
     *
     * @return the value of BPOS.TBL_CORE_CARD_BIN.CUP_LOG_FLAG
     *
     * @mbggenerated
     */
    public String getCupLogFlag() {
        return cupLogFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BPOS.TBL_CORE_CARD_BIN.CUP_LOG_FLAG
     *
     * @param cupLogFlag the value for BPOS.TBL_CORE_CARD_BIN.CUP_LOG_FLAG
     *
     * @mbggenerated
     */
    public void setCupLogFlag(String cupLogFlag) {
        this.cupLogFlag = cupLogFlag == null ? null : cupLogFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BPOS.TBL_CORE_CARD_BIN.BIN_DESC
     *
     * @return the value of BPOS.TBL_CORE_CARD_BIN.BIN_DESC
     *
     * @mbggenerated
     */
    public String getBinDesc() {
        return binDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BPOS.TBL_CORE_CARD_BIN.BIN_DESC
     *
     * @param binDesc the value for BPOS.TBL_CORE_CARD_BIN.BIN_DESC
     *
     * @mbggenerated
     */
    public void setBinDesc(String binDesc) {
        this.binDesc = binDesc == null ? null : binDesc.trim();
    }
}