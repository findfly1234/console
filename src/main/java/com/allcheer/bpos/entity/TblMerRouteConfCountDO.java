package com.allcheer.bpos.entity;

public class TblMerRouteConfCountDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_MER_ROUTE_CONF_COUNT.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_MER_ROUTE_CONF_COUNT.MER_ID
     *
     * @mbggenerated
     */
    private String merId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_MER_ROUTE_CONF_COUNT.CURRENT_TRADE_COUNT
     *
     * @mbggenerated
     */
    private String currentTradeCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_MER_ROUTE_CONF_COUNT.REFS_BIG_MERS
     *
     * @mbggenerated
     */
    private String refsBigMers;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_MER_ROUTE_CONF_COUNT.ID
     *
     * @return the value of TBL_MER_ROUTE_CONF_COUNT.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_MER_ROUTE_CONF_COUNT.ID
     *
     * @param id the value for TBL_MER_ROUTE_CONF_COUNT.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_MER_ROUTE_CONF_COUNT.MER_ID
     *
     * @return the value of TBL_MER_ROUTE_CONF_COUNT.MER_ID
     *
     * @mbggenerated
     */
    public String getMerId() {
        return merId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_MER_ROUTE_CONF_COUNT.MER_ID
     *
     * @param merId the value for TBL_MER_ROUTE_CONF_COUNT.MER_ID
     *
     * @mbggenerated
     */
    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_MER_ROUTE_CONF_COUNT.CURRENT_TRADE_COUNT
     *
     * @return the value of TBL_MER_ROUTE_CONF_COUNT.CURRENT_TRADE_COUNT
     *
     * @mbggenerated
     */
    public String getCurrentTradeCount() {
        return currentTradeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_MER_ROUTE_CONF_COUNT.CURRENT_TRADE_COUNT
     *
     * @param currentTradeCount the value for TBL_MER_ROUTE_CONF_COUNT.CURRENT_TRADE_COUNT
     *
     * @mbggenerated
     */
    public void setCurrentTradeCount(String currentTradeCount) {
        this.currentTradeCount = currentTradeCount == null ? null : currentTradeCount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_MER_ROUTE_CONF_COUNT.REFS_BIG_MERS
     *
     * @return the value of TBL_MER_ROUTE_CONF_COUNT.REFS_BIG_MERS
     *
     * @mbggenerated
     */
    public String getRefsBigMers() {
        return refsBigMers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_MER_ROUTE_CONF_COUNT.REFS_BIG_MERS
     *
     * @param refsBigMers the value for TBL_MER_ROUTE_CONF_COUNT.REFS_BIG_MERS
     *
     * @mbggenerated
     */
    public void setRefsBigMers(String refsBigMers) {
        this.refsBigMers = refsBigMers == null ? null : refsBigMers.trim();
    }
}