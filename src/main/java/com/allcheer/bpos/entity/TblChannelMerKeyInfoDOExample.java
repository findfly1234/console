package com.allcheer.bpos.entity;

import java.util.ArrayList;
import java.util.List;

public class TblChannelMerKeyInfoDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    public TblChannelMerKeyInfoDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("CHANNEL_ID like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("CHANNEL_ID not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelMerIdIsNull() {
            addCriterion("CHANNEL_MER_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelMerIdIsNotNull() {
            addCriterion("CHANNEL_MER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelMerIdEqualTo(String value) {
            addCriterion("CHANNEL_MER_ID =", value, "channelMerId");
            return (Criteria) this;
        }

        public Criteria andChannelMerIdNotEqualTo(String value) {
            addCriterion("CHANNEL_MER_ID <>", value, "channelMerId");
            return (Criteria) this;
        }

        public Criteria andChannelMerIdGreaterThan(String value) {
            addCriterion("CHANNEL_MER_ID >", value, "channelMerId");
            return (Criteria) this;
        }

        public Criteria andChannelMerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_MER_ID >=", value, "channelMerId");
            return (Criteria) this;
        }

        public Criteria andChannelMerIdLessThan(String value) {
            addCriterion("CHANNEL_MER_ID <", value, "channelMerId");
            return (Criteria) this;
        }

        public Criteria andChannelMerIdLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_MER_ID <=", value, "channelMerId");
            return (Criteria) this;
        }

        public Criteria andChannelMerIdLike(String value) {
            addCriterion("CHANNEL_MER_ID like", value, "channelMerId");
            return (Criteria) this;
        }

        public Criteria andChannelMerIdNotLike(String value) {
            addCriterion("CHANNEL_MER_ID not like", value, "channelMerId");
            return (Criteria) this;
        }

        public Criteria andChannelMerIdIn(List<String> values) {
            addCriterion("CHANNEL_MER_ID in", values, "channelMerId");
            return (Criteria) this;
        }

        public Criteria andChannelMerIdNotIn(List<String> values) {
            addCriterion("CHANNEL_MER_ID not in", values, "channelMerId");
            return (Criteria) this;
        }

        public Criteria andChannelMerIdBetween(String value1, String value2) {
            addCriterion("CHANNEL_MER_ID between", value1, value2, "channelMerId");
            return (Criteria) this;
        }

        public Criteria andChannelMerIdNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_MER_ID not between", value1, value2, "channelMerId");
            return (Criteria) this;
        }

        public Criteria andChannelMerTermIdIsNull() {
            addCriterion("CHANNEL_MER_TERM_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelMerTermIdIsNotNull() {
            addCriterion("CHANNEL_MER_TERM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelMerTermIdEqualTo(String value) {
            addCriterion("CHANNEL_MER_TERM_ID =", value, "channelMerTermId");
            return (Criteria) this;
        }

        public Criteria andChannelMerTermIdNotEqualTo(String value) {
            addCriterion("CHANNEL_MER_TERM_ID <>", value, "channelMerTermId");
            return (Criteria) this;
        }

        public Criteria andChannelMerTermIdGreaterThan(String value) {
            addCriterion("CHANNEL_MER_TERM_ID >", value, "channelMerTermId");
            return (Criteria) this;
        }

        public Criteria andChannelMerTermIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_MER_TERM_ID >=", value, "channelMerTermId");
            return (Criteria) this;
        }

        public Criteria andChannelMerTermIdLessThan(String value) {
            addCriterion("CHANNEL_MER_TERM_ID <", value, "channelMerTermId");
            return (Criteria) this;
        }

        public Criteria andChannelMerTermIdLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_MER_TERM_ID <=", value, "channelMerTermId");
            return (Criteria) this;
        }

        public Criteria andChannelMerTermIdLike(String value) {
            addCriterion("CHANNEL_MER_TERM_ID like", value, "channelMerTermId");
            return (Criteria) this;
        }

        public Criteria andChannelMerTermIdNotLike(String value) {
            addCriterion("CHANNEL_MER_TERM_ID not like", value, "channelMerTermId");
            return (Criteria) this;
        }

        public Criteria andChannelMerTermIdIn(List<String> values) {
            addCriterion("CHANNEL_MER_TERM_ID in", values, "channelMerTermId");
            return (Criteria) this;
        }

        public Criteria andChannelMerTermIdNotIn(List<String> values) {
            addCriterion("CHANNEL_MER_TERM_ID not in", values, "channelMerTermId");
            return (Criteria) this;
        }

        public Criteria andChannelMerTermIdBetween(String value1, String value2) {
            addCriterion("CHANNEL_MER_TERM_ID between", value1, value2, "channelMerTermId");
            return (Criteria) this;
        }

        public Criteria andChannelMerTermIdNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_MER_TERM_ID not between", value1, value2, "channelMerTermId");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("CHANNEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("CHANNEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("CHANNEL_NAME =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("CHANNEL_NAME <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("CHANNEL_NAME >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("CHANNEL_NAME <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("CHANNEL_NAME like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("CHANNEL_NAME not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("CHANNEL_NAME in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("CHANNEL_NAME not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andPinKeyIsNull() {
            addCriterion("PIN_KEY is null");
            return (Criteria) this;
        }

        public Criteria andPinKeyIsNotNull() {
            addCriterion("PIN_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andPinKeyEqualTo(String value) {
            addCriterion("PIN_KEY =", value, "pinKey");
            return (Criteria) this;
        }

        public Criteria andPinKeyNotEqualTo(String value) {
            addCriterion("PIN_KEY <>", value, "pinKey");
            return (Criteria) this;
        }

        public Criteria andPinKeyGreaterThan(String value) {
            addCriterion("PIN_KEY >", value, "pinKey");
            return (Criteria) this;
        }

        public Criteria andPinKeyGreaterThanOrEqualTo(String value) {
            addCriterion("PIN_KEY >=", value, "pinKey");
            return (Criteria) this;
        }

        public Criteria andPinKeyLessThan(String value) {
            addCriterion("PIN_KEY <", value, "pinKey");
            return (Criteria) this;
        }

        public Criteria andPinKeyLessThanOrEqualTo(String value) {
            addCriterion("PIN_KEY <=", value, "pinKey");
            return (Criteria) this;
        }

        public Criteria andPinKeyLike(String value) {
            addCriterion("PIN_KEY like", value, "pinKey");
            return (Criteria) this;
        }

        public Criteria andPinKeyNotLike(String value) {
            addCriterion("PIN_KEY not like", value, "pinKey");
            return (Criteria) this;
        }

        public Criteria andPinKeyIn(List<String> values) {
            addCriterion("PIN_KEY in", values, "pinKey");
            return (Criteria) this;
        }

        public Criteria andPinKeyNotIn(List<String> values) {
            addCriterion("PIN_KEY not in", values, "pinKey");
            return (Criteria) this;
        }

        public Criteria andPinKeyBetween(String value1, String value2) {
            addCriterion("PIN_KEY between", value1, value2, "pinKey");
            return (Criteria) this;
        }

        public Criteria andPinKeyNotBetween(String value1, String value2) {
            addCriterion("PIN_KEY not between", value1, value2, "pinKey");
            return (Criteria) this;
        }

        public Criteria andMacKeyIsNull() {
            addCriterion("MAC_KEY is null");
            return (Criteria) this;
        }

        public Criteria andMacKeyIsNotNull() {
            addCriterion("MAC_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andMacKeyEqualTo(String value) {
            addCriterion("MAC_KEY =", value, "macKey");
            return (Criteria) this;
        }

        public Criteria andMacKeyNotEqualTo(String value) {
            addCriterion("MAC_KEY <>", value, "macKey");
            return (Criteria) this;
        }

        public Criteria andMacKeyGreaterThan(String value) {
            addCriterion("MAC_KEY >", value, "macKey");
            return (Criteria) this;
        }

        public Criteria andMacKeyGreaterThanOrEqualTo(String value) {
            addCriterion("MAC_KEY >=", value, "macKey");
            return (Criteria) this;
        }

        public Criteria andMacKeyLessThan(String value) {
            addCriterion("MAC_KEY <", value, "macKey");
            return (Criteria) this;
        }

        public Criteria andMacKeyLessThanOrEqualTo(String value) {
            addCriterion("MAC_KEY <=", value, "macKey");
            return (Criteria) this;
        }

        public Criteria andMacKeyLike(String value) {
            addCriterion("MAC_KEY like", value, "macKey");
            return (Criteria) this;
        }

        public Criteria andMacKeyNotLike(String value) {
            addCriterion("MAC_KEY not like", value, "macKey");
            return (Criteria) this;
        }

        public Criteria andMacKeyIn(List<String> values) {
            addCriterion("MAC_KEY in", values, "macKey");
            return (Criteria) this;
        }

        public Criteria andMacKeyNotIn(List<String> values) {
            addCriterion("MAC_KEY not in", values, "macKey");
            return (Criteria) this;
        }

        public Criteria andMacKeyBetween(String value1, String value2) {
            addCriterion("MAC_KEY between", value1, value2, "macKey");
            return (Criteria) this;
        }

        public Criteria andMacKeyNotBetween(String value1, String value2) {
            addCriterion("MAC_KEY not between", value1, value2, "macKey");
            return (Criteria) this;
        }

        public Criteria andTdKeyIsNull() {
            addCriterion("TD_KEY is null");
            return (Criteria) this;
        }

        public Criteria andTdKeyIsNotNull() {
            addCriterion("TD_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andTdKeyEqualTo(String value) {
            addCriterion("TD_KEY =", value, "tdKey");
            return (Criteria) this;
        }

        public Criteria andTdKeyNotEqualTo(String value) {
            addCriterion("TD_KEY <>", value, "tdKey");
            return (Criteria) this;
        }

        public Criteria andTdKeyGreaterThan(String value) {
            addCriterion("TD_KEY >", value, "tdKey");
            return (Criteria) this;
        }

        public Criteria andTdKeyGreaterThanOrEqualTo(String value) {
            addCriterion("TD_KEY >=", value, "tdKey");
            return (Criteria) this;
        }

        public Criteria andTdKeyLessThan(String value) {
            addCriterion("TD_KEY <", value, "tdKey");
            return (Criteria) this;
        }

        public Criteria andTdKeyLessThanOrEqualTo(String value) {
            addCriterion("TD_KEY <=", value, "tdKey");
            return (Criteria) this;
        }

        public Criteria andTdKeyLike(String value) {
            addCriterion("TD_KEY like", value, "tdKey");
            return (Criteria) this;
        }

        public Criteria andTdKeyNotLike(String value) {
            addCriterion("TD_KEY not like", value, "tdKey");
            return (Criteria) this;
        }

        public Criteria andTdKeyIn(List<String> values) {
            addCriterion("TD_KEY in", values, "tdKey");
            return (Criteria) this;
        }

        public Criteria andTdKeyNotIn(List<String> values) {
            addCriterion("TD_KEY not in", values, "tdKey");
            return (Criteria) this;
        }

        public Criteria andTdKeyBetween(String value1, String value2) {
            addCriterion("TD_KEY between", value1, value2, "tdKey");
            return (Criteria) this;
        }

        public Criteria andTdKeyNotBetween(String value1, String value2) {
            addCriterion("TD_KEY not between", value1, value2, "tdKey");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("CHECK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("CHECK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(String value) {
            addCriterion("CHECK_STATUS =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(String value) {
            addCriterion("CHECK_STATUS <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(String value) {
            addCriterion("CHECK_STATUS >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(String value) {
            addCriterion("CHECK_STATUS <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLike(String value) {
            addCriterion("CHECK_STATUS like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotLike(String value) {
            addCriterion("CHECK_STATUS not like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<String> values) {
            addCriterion("CHECK_STATUS in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<String> values) {
            addCriterion("CHECK_STATUS not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_CHANNEL_MER_KEY_INFO
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}