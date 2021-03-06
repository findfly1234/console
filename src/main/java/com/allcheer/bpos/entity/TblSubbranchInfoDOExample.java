package com.allcheer.bpos.entity;

import java.util.ArrayList;
import java.util.List;

public class TblSubbranchInfoDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_SUBBRANCH_INFO
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_SUBBRANCH_INFO
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_SUBBRANCH_INFO
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SUBBRANCH_INFO
     *
     * @mbggenerated
     */
    public TblSubbranchInfoDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SUBBRANCH_INFO
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SUBBRANCH_INFO
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SUBBRANCH_INFO
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SUBBRANCH_INFO
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SUBBRANCH_INFO
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SUBBRANCH_INFO
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SUBBRANCH_INFO
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
     * This method corresponds to the database table TBL_SUBBRANCH_INFO
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
     * This method corresponds to the database table TBL_SUBBRANCH_INFO
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SUBBRANCH_INFO
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
     * This class corresponds to the database table TBL_SUBBRANCH_INFO
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

        public Criteria andSubbranchIdIsNull() {
            addCriterion("SUBBRANCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubbranchIdIsNotNull() {
            addCriterion("SUBBRANCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubbranchIdEqualTo(String value) {
            addCriterion("SUBBRANCH_ID =", value, "subbranchId");
            return (Criteria) this;
        }

        public Criteria andSubbranchIdNotEqualTo(String value) {
            addCriterion("SUBBRANCH_ID <>", value, "subbranchId");
            return (Criteria) this;
        }

        public Criteria andSubbranchIdGreaterThan(String value) {
            addCriterion("SUBBRANCH_ID >", value, "subbranchId");
            return (Criteria) this;
        }

        public Criteria andSubbranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUBBRANCH_ID >=", value, "subbranchId");
            return (Criteria) this;
        }

        public Criteria andSubbranchIdLessThan(String value) {
            addCriterion("SUBBRANCH_ID <", value, "subbranchId");
            return (Criteria) this;
        }

        public Criteria andSubbranchIdLessThanOrEqualTo(String value) {
            addCriterion("SUBBRANCH_ID <=", value, "subbranchId");
            return (Criteria) this;
        }

        public Criteria andSubbranchIdLike(String value) {
            addCriterion("SUBBRANCH_ID like", value, "subbranchId");
            return (Criteria) this;
        }

        public Criteria andSubbranchIdNotLike(String value) {
            addCriterion("SUBBRANCH_ID not like", value, "subbranchId");
            return (Criteria) this;
        }

        public Criteria andSubbranchIdIn(List<String> values) {
            addCriterion("SUBBRANCH_ID in", values, "subbranchId");
            return (Criteria) this;
        }

        public Criteria andSubbranchIdNotIn(List<String> values) {
            addCriterion("SUBBRANCH_ID not in", values, "subbranchId");
            return (Criteria) this;
        }

        public Criteria andSubbranchIdBetween(String value1, String value2) {
            addCriterion("SUBBRANCH_ID between", value1, value2, "subbranchId");
            return (Criteria) this;
        }

        public Criteria andSubbranchIdNotBetween(String value1, String value2) {
            addCriterion("SUBBRANCH_ID not between", value1, value2, "subbranchId");
            return (Criteria) this;
        }

        public Criteria andSubbranchNameIsNull() {
            addCriterion("SUBBRANCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSubbranchNameIsNotNull() {
            addCriterion("SUBBRANCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubbranchNameEqualTo(String value) {
            addCriterion("SUBBRANCH_NAME =", value, "subbranchName");
            return (Criteria) this;
        }

        public Criteria andSubbranchNameNotEqualTo(String value) {
            addCriterion("SUBBRANCH_NAME <>", value, "subbranchName");
            return (Criteria) this;
        }

        public Criteria andSubbranchNameGreaterThan(String value) {
            addCriterion("SUBBRANCH_NAME >", value, "subbranchName");
            return (Criteria) this;
        }

        public Criteria andSubbranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUBBRANCH_NAME >=", value, "subbranchName");
            return (Criteria) this;
        }

        public Criteria andSubbranchNameLessThan(String value) {
            addCriterion("SUBBRANCH_NAME <", value, "subbranchName");
            return (Criteria) this;
        }

        public Criteria andSubbranchNameLessThanOrEqualTo(String value) {
            addCriterion("SUBBRANCH_NAME <=", value, "subbranchName");
            return (Criteria) this;
        }

        public Criteria andSubbranchNameLike(String value) {
            addCriterion("SUBBRANCH_NAME like", value, "subbranchName");
            return (Criteria) this;
        }

        public Criteria andSubbranchNameNotLike(String value) {
            addCriterion("SUBBRANCH_NAME not like", value, "subbranchName");
            return (Criteria) this;
        }

        public Criteria andSubbranchNameIn(List<String> values) {
            addCriterion("SUBBRANCH_NAME in", values, "subbranchName");
            return (Criteria) this;
        }

        public Criteria andSubbranchNameNotIn(List<String> values) {
            addCriterion("SUBBRANCH_NAME not in", values, "subbranchName");
            return (Criteria) this;
        }

        public Criteria andSubbranchNameBetween(String value1, String value2) {
            addCriterion("SUBBRANCH_NAME between", value1, value2, "subbranchName");
            return (Criteria) this;
        }

        public Criteria andSubbranchNameNotBetween(String value1, String value2) {
            addCriterion("SUBBRANCH_NAME not between", value1, value2, "subbranchName");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_SUBBRANCH_INFO
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
     * This class corresponds to the database table TBL_SUBBRANCH_INFO
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