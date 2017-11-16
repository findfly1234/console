package com.allcheer.bpos.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblBTSSysUsrDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    public TblBTSSysUsrDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
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
     * This method corresponds to the database table TBL_BTS_SYS_USR
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
     * This method corresponds to the database table TBL_BTS_SYS_USR
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BTS_SYS_USR
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
     * This class corresponds to the database table TBL_BTS_SYS_USR
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

        public Criteria andUsrIdIsNull() {
            addCriterion("USR_ID is null");
            return (Criteria) this;
        }

        public Criteria andUsrIdIsNotNull() {
            addCriterion("USR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUsrIdEqualTo(String value) {
            addCriterion("USR_ID =", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotEqualTo(String value) {
            addCriterion("USR_ID <>", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThan(String value) {
            addCriterion("USR_ID >", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThanOrEqualTo(String value) {
            addCriterion("USR_ID >=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThan(String value) {
            addCriterion("USR_ID <", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThanOrEqualTo(String value) {
            addCriterion("USR_ID <=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLike(String value) {
            addCriterion("USR_ID like", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotLike(String value) {
            addCriterion("USR_ID not like", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdIn(List<String> values) {
            addCriterion("USR_ID in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotIn(List<String> values) {
            addCriterion("USR_ID not in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdBetween(String value1, String value2) {
            addCriterion("USR_ID between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotBetween(String value1, String value2) {
            addCriterion("USR_ID not between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNull() {
            addCriterion("USR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNotNull() {
            addCriterion("USR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNameEqualTo(String value) {
            addCriterion("USR_NAME =", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotEqualTo(String value) {
            addCriterion("USR_NAME <>", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThan(String value) {
            addCriterion("USR_NAME >", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThanOrEqualTo(String value) {
            addCriterion("USR_NAME >=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThan(String value) {
            addCriterion("USR_NAME <", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThanOrEqualTo(String value) {
            addCriterion("USR_NAME <=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLike(String value) {
            addCriterion("USR_NAME like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotLike(String value) {
            addCriterion("USR_NAME not like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameIn(List<String> values) {
            addCriterion("USR_NAME in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotIn(List<String> values) {
            addCriterion("USR_NAME not in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameBetween(String value1, String value2) {
            addCriterion("USR_NAME between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotBetween(String value1, String value2) {
            addCriterion("USR_NAME not between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIsNull() {
            addCriterion("USR_PWD is null");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIsNotNull() {
            addCriterion("USR_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andUsrPwdEqualTo(String value) {
            addCriterion("USR_PWD =", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdNotEqualTo(String value) {
            addCriterion("USR_PWD <>", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdGreaterThan(String value) {
            addCriterion("USR_PWD >", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdGreaterThanOrEqualTo(String value) {
            addCriterion("USR_PWD >=", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdLessThan(String value) {
            addCriterion("USR_PWD <", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdLessThanOrEqualTo(String value) {
            addCriterion("USR_PWD <=", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdLike(String value) {
            addCriterion("USR_PWD like", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdNotLike(String value) {
            addCriterion("USR_PWD not like", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIn(List<String> values) {
            addCriterion("USR_PWD in", values, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdNotIn(List<String> values) {
            addCriterion("USR_PWD not in", values, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdBetween(String value1, String value2) {
            addCriterion("USR_PWD between", value1, value2, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdNotBetween(String value1, String value2) {
            addCriterion("USR_PWD not between", value1, value2, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrRemarkIsNull() {
            addCriterion("USR_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andUsrRemarkIsNotNull() {
            addCriterion("USR_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRemarkEqualTo(String value) {
            addCriterion("USR_REMARK =", value, "usrRemark");
            return (Criteria) this;
        }

        public Criteria andUsrRemarkNotEqualTo(String value) {
            addCriterion("USR_REMARK <>", value, "usrRemark");
            return (Criteria) this;
        }

        public Criteria andUsrRemarkGreaterThan(String value) {
            addCriterion("USR_REMARK >", value, "usrRemark");
            return (Criteria) this;
        }

        public Criteria andUsrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("USR_REMARK >=", value, "usrRemark");
            return (Criteria) this;
        }

        public Criteria andUsrRemarkLessThan(String value) {
            addCriterion("USR_REMARK <", value, "usrRemark");
            return (Criteria) this;
        }

        public Criteria andUsrRemarkLessThanOrEqualTo(String value) {
            addCriterion("USR_REMARK <=", value, "usrRemark");
            return (Criteria) this;
        }

        public Criteria andUsrRemarkLike(String value) {
            addCriterion("USR_REMARK like", value, "usrRemark");
            return (Criteria) this;
        }

        public Criteria andUsrRemarkNotLike(String value) {
            addCriterion("USR_REMARK not like", value, "usrRemark");
            return (Criteria) this;
        }

        public Criteria andUsrRemarkIn(List<String> values) {
            addCriterion("USR_REMARK in", values, "usrRemark");
            return (Criteria) this;
        }

        public Criteria andUsrRemarkNotIn(List<String> values) {
            addCriterion("USR_REMARK not in", values, "usrRemark");
            return (Criteria) this;
        }

        public Criteria andUsrRemarkBetween(String value1, String value2) {
            addCriterion("USR_REMARK between", value1, value2, "usrRemark");
            return (Criteria) this;
        }

        public Criteria andUsrRemarkNotBetween(String value1, String value2) {
            addCriterion("USR_REMARK not between", value1, value2, "usrRemark");
            return (Criteria) this;
        }

        public Criteria andUsrDisableTagIsNull() {
            addCriterion("USR_DISABLE_TAG is null");
            return (Criteria) this;
        }

        public Criteria andUsrDisableTagIsNotNull() {
            addCriterion("USR_DISABLE_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andUsrDisableTagEqualTo(String value) {
            addCriterion("USR_DISABLE_TAG =", value, "usrDisableTag");
            return (Criteria) this;
        }

        public Criteria andUsrDisableTagNotEqualTo(String value) {
            addCriterion("USR_DISABLE_TAG <>", value, "usrDisableTag");
            return (Criteria) this;
        }

        public Criteria andUsrDisableTagGreaterThan(String value) {
            addCriterion("USR_DISABLE_TAG >", value, "usrDisableTag");
            return (Criteria) this;
        }

        public Criteria andUsrDisableTagGreaterThanOrEqualTo(String value) {
            addCriterion("USR_DISABLE_TAG >=", value, "usrDisableTag");
            return (Criteria) this;
        }

        public Criteria andUsrDisableTagLessThan(String value) {
            addCriterion("USR_DISABLE_TAG <", value, "usrDisableTag");
            return (Criteria) this;
        }

        public Criteria andUsrDisableTagLessThanOrEqualTo(String value) {
            addCriterion("USR_DISABLE_TAG <=", value, "usrDisableTag");
            return (Criteria) this;
        }

        public Criteria andUsrDisableTagLike(String value) {
            addCriterion("USR_DISABLE_TAG like", value, "usrDisableTag");
            return (Criteria) this;
        }

        public Criteria andUsrDisableTagNotLike(String value) {
            addCriterion("USR_DISABLE_TAG not like", value, "usrDisableTag");
            return (Criteria) this;
        }

        public Criteria andUsrDisableTagIn(List<String> values) {
            addCriterion("USR_DISABLE_TAG in", values, "usrDisableTag");
            return (Criteria) this;
        }

        public Criteria andUsrDisableTagNotIn(List<String> values) {
            addCriterion("USR_DISABLE_TAG not in", values, "usrDisableTag");
            return (Criteria) this;
        }

        public Criteria andUsrDisableTagBetween(String value1, String value2) {
            addCriterion("USR_DISABLE_TAG between", value1, value2, "usrDisableTag");
            return (Criteria) this;
        }

        public Criteria andUsrDisableTagNotBetween(String value1, String value2) {
            addCriterion("USR_DISABLE_TAG not between", value1, value2, "usrDisableTag");
            return (Criteria) this;
        }

        public Criteria andUsrEmailIsNull() {
            addCriterion("USR_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUsrEmailIsNotNull() {
            addCriterion("USR_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUsrEmailEqualTo(String value) {
            addCriterion("USR_EMAIL =", value, "usrEmail");
            return (Criteria) this;
        }

        public Criteria andUsrEmailNotEqualTo(String value) {
            addCriterion("USR_EMAIL <>", value, "usrEmail");
            return (Criteria) this;
        }

        public Criteria andUsrEmailGreaterThan(String value) {
            addCriterion("USR_EMAIL >", value, "usrEmail");
            return (Criteria) this;
        }

        public Criteria andUsrEmailGreaterThanOrEqualTo(String value) {
            addCriterion("USR_EMAIL >=", value, "usrEmail");
            return (Criteria) this;
        }

        public Criteria andUsrEmailLessThan(String value) {
            addCriterion("USR_EMAIL <", value, "usrEmail");
            return (Criteria) this;
        }

        public Criteria andUsrEmailLessThanOrEqualTo(String value) {
            addCriterion("USR_EMAIL <=", value, "usrEmail");
            return (Criteria) this;
        }

        public Criteria andUsrEmailLike(String value) {
            addCriterion("USR_EMAIL like", value, "usrEmail");
            return (Criteria) this;
        }

        public Criteria andUsrEmailNotLike(String value) {
            addCriterion("USR_EMAIL not like", value, "usrEmail");
            return (Criteria) this;
        }

        public Criteria andUsrEmailIn(List<String> values) {
            addCriterion("USR_EMAIL in", values, "usrEmail");
            return (Criteria) this;
        }

        public Criteria andUsrEmailNotIn(List<String> values) {
            addCriterion("USR_EMAIL not in", values, "usrEmail");
            return (Criteria) this;
        }

        public Criteria andUsrEmailBetween(String value1, String value2) {
            addCriterion("USR_EMAIL between", value1, value2, "usrEmail");
            return (Criteria) this;
        }

        public Criteria andUsrEmailNotBetween(String value1, String value2) {
            addCriterion("USR_EMAIL not between", value1, value2, "usrEmail");
            return (Criteria) this;
        }

        public Criteria andUsrCreateByIsNull() {
            addCriterion("USR_CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andUsrCreateByIsNotNull() {
            addCriterion("USR_CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUsrCreateByEqualTo(String value) {
            addCriterion("USR_CREATE_BY =", value, "usrCreateBy");
            return (Criteria) this;
        }

        public Criteria andUsrCreateByNotEqualTo(String value) {
            addCriterion("USR_CREATE_BY <>", value, "usrCreateBy");
            return (Criteria) this;
        }

        public Criteria andUsrCreateByGreaterThan(String value) {
            addCriterion("USR_CREATE_BY >", value, "usrCreateBy");
            return (Criteria) this;
        }

        public Criteria andUsrCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("USR_CREATE_BY >=", value, "usrCreateBy");
            return (Criteria) this;
        }

        public Criteria andUsrCreateByLessThan(String value) {
            addCriterion("USR_CREATE_BY <", value, "usrCreateBy");
            return (Criteria) this;
        }

        public Criteria andUsrCreateByLessThanOrEqualTo(String value) {
            addCriterion("USR_CREATE_BY <=", value, "usrCreateBy");
            return (Criteria) this;
        }

        public Criteria andUsrCreateByLike(String value) {
            addCriterion("USR_CREATE_BY like", value, "usrCreateBy");
            return (Criteria) this;
        }

        public Criteria andUsrCreateByNotLike(String value) {
            addCriterion("USR_CREATE_BY not like", value, "usrCreateBy");
            return (Criteria) this;
        }

        public Criteria andUsrCreateByIn(List<String> values) {
            addCriterion("USR_CREATE_BY in", values, "usrCreateBy");
            return (Criteria) this;
        }

        public Criteria andUsrCreateByNotIn(List<String> values) {
            addCriterion("USR_CREATE_BY not in", values, "usrCreateBy");
            return (Criteria) this;
        }

        public Criteria andUsrCreateByBetween(String value1, String value2) {
            addCriterion("USR_CREATE_BY between", value1, value2, "usrCreateBy");
            return (Criteria) this;
        }

        public Criteria andUsrCreateByNotBetween(String value1, String value2) {
            addCriterion("USR_CREATE_BY not between", value1, value2, "usrCreateBy");
            return (Criteria) this;
        }

        public Criteria andUsrCreateDateIsNull() {
            addCriterion("USR_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUsrCreateDateIsNotNull() {
            addCriterion("USR_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUsrCreateDateEqualTo(Date value) {
            addCriterion("USR_CREATE_DATE =", value, "usrCreateDate");
            return (Criteria) this;
        }

        public Criteria andUsrCreateDateNotEqualTo(Date value) {
            addCriterion("USR_CREATE_DATE <>", value, "usrCreateDate");
            return (Criteria) this;
        }

        public Criteria andUsrCreateDateGreaterThan(Date value) {
            addCriterion("USR_CREATE_DATE >", value, "usrCreateDate");
            return (Criteria) this;
        }

        public Criteria andUsrCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("USR_CREATE_DATE >=", value, "usrCreateDate");
            return (Criteria) this;
        }

        public Criteria andUsrCreateDateLessThan(Date value) {
            addCriterion("USR_CREATE_DATE <", value, "usrCreateDate");
            return (Criteria) this;
        }

        public Criteria andUsrCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("USR_CREATE_DATE <=", value, "usrCreateDate");
            return (Criteria) this;
        }

        public Criteria andUsrCreateDateIn(List<Date> values) {
            addCriterion("USR_CREATE_DATE in", values, "usrCreateDate");
            return (Criteria) this;
        }

        public Criteria andUsrCreateDateNotIn(List<Date> values) {
            addCriterion("USR_CREATE_DATE not in", values, "usrCreateDate");
            return (Criteria) this;
        }

        public Criteria andUsrCreateDateBetween(Date value1, Date value2) {
            addCriterion("USR_CREATE_DATE between", value1, value2, "usrCreateDate");
            return (Criteria) this;
        }

        public Criteria andUsrCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("USR_CREATE_DATE not between", value1, value2, "usrCreateDate");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateByIsNull() {
            addCriterion("USR_UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateByIsNotNull() {
            addCriterion("USR_UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateByEqualTo(String value) {
            addCriterion("USR_UPDATE_BY =", value, "usrUpdateBy");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateByNotEqualTo(String value) {
            addCriterion("USR_UPDATE_BY <>", value, "usrUpdateBy");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateByGreaterThan(String value) {
            addCriterion("USR_UPDATE_BY >", value, "usrUpdateBy");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("USR_UPDATE_BY >=", value, "usrUpdateBy");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateByLessThan(String value) {
            addCriterion("USR_UPDATE_BY <", value, "usrUpdateBy");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateByLessThanOrEqualTo(String value) {
            addCriterion("USR_UPDATE_BY <=", value, "usrUpdateBy");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateByLike(String value) {
            addCriterion("USR_UPDATE_BY like", value, "usrUpdateBy");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateByNotLike(String value) {
            addCriterion("USR_UPDATE_BY not like", value, "usrUpdateBy");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateByIn(List<String> values) {
            addCriterion("USR_UPDATE_BY in", values, "usrUpdateBy");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateByNotIn(List<String> values) {
            addCriterion("USR_UPDATE_BY not in", values, "usrUpdateBy");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateByBetween(String value1, String value2) {
            addCriterion("USR_UPDATE_BY between", value1, value2, "usrUpdateBy");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateByNotBetween(String value1, String value2) {
            addCriterion("USR_UPDATE_BY not between", value1, value2, "usrUpdateBy");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateDateIsNull() {
            addCriterion("USR_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateDateIsNotNull() {
            addCriterion("USR_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateDateEqualTo(Date value) {
            addCriterion("USR_UPDATE_DATE =", value, "usrUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateDateNotEqualTo(Date value) {
            addCriterion("USR_UPDATE_DATE <>", value, "usrUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateDateGreaterThan(Date value) {
            addCriterion("USR_UPDATE_DATE >", value, "usrUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("USR_UPDATE_DATE >=", value, "usrUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateDateLessThan(Date value) {
            addCriterion("USR_UPDATE_DATE <", value, "usrUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("USR_UPDATE_DATE <=", value, "usrUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateDateIn(List<Date> values) {
            addCriterion("USR_UPDATE_DATE in", values, "usrUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateDateNotIn(List<Date> values) {
            addCriterion("USR_UPDATE_DATE not in", values, "usrUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateDateBetween(Date value1, Date value2) {
            addCriterion("USR_UPDATE_DATE between", value1, value2, "usrUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("USR_UPDATE_DATE not between", value1, value2, "usrUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUsrTypeIsNull() {
            addCriterion("USR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUsrTypeIsNotNull() {
            addCriterion("USR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUsrTypeEqualTo(String value) {
            addCriterion("USR_TYPE =", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeNotEqualTo(String value) {
            addCriterion("USR_TYPE <>", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeGreaterThan(String value) {
            addCriterion("USR_TYPE >", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USR_TYPE >=", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeLessThan(String value) {
            addCriterion("USR_TYPE <", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeLessThanOrEqualTo(String value) {
            addCriterion("USR_TYPE <=", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeLike(String value) {
            addCriterion("USR_TYPE like", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeNotLike(String value) {
            addCriterion("USR_TYPE not like", value, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeIn(List<String> values) {
            addCriterion("USR_TYPE in", values, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeNotIn(List<String> values) {
            addCriterion("USR_TYPE not in", values, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeBetween(String value1, String value2) {
            addCriterion("USR_TYPE between", value1, value2, "usrType");
            return (Criteria) this;
        }

        public Criteria andUsrTypeNotBetween(String value1, String value2) {
            addCriterion("USR_TYPE not between", value1, value2, "usrType");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_BTS_SYS_USR
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
     * This class corresponds to the database table TBL_BTS_SYS_USR
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