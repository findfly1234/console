package com.allcheer.bpos.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TblT0CheckFileResponseDoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
     *
     * @mbggenerated
     */
    public TblT0CheckFileResponseDoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
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
     * This method corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
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
     * This method corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
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
     * This class corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
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

        public Criteria andCooperatorIsNull() {
            addCriterion("COOPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andCooperatorIsNotNull() {
            addCriterion("COOPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCooperatorEqualTo(String value) {
            addCriterion("COOPERATOR =", value, "cooperator");
            return (Criteria) this;
        }

        public Criteria andCooperatorNotEqualTo(String value) {
            addCriterion("COOPERATOR <>", value, "cooperator");
            return (Criteria) this;
        }

        public Criteria andCooperatorGreaterThan(String value) {
            addCriterion("COOPERATOR >", value, "cooperator");
            return (Criteria) this;
        }

        public Criteria andCooperatorGreaterThanOrEqualTo(String value) {
            addCriterion("COOPERATOR >=", value, "cooperator");
            return (Criteria) this;
        }

        public Criteria andCooperatorLessThan(String value) {
            addCriterion("COOPERATOR <", value, "cooperator");
            return (Criteria) this;
        }

        public Criteria andCooperatorLessThanOrEqualTo(String value) {
            addCriterion("COOPERATOR <=", value, "cooperator");
            return (Criteria) this;
        }

        public Criteria andCooperatorLike(String value) {
            addCriterion("COOPERATOR like", value, "cooperator");
            return (Criteria) this;
        }

        public Criteria andCooperatorNotLike(String value) {
            addCriterion("COOPERATOR not like", value, "cooperator");
            return (Criteria) this;
        }

        public Criteria andCooperatorIn(List<String> values) {
            addCriterion("COOPERATOR in", values, "cooperator");
            return (Criteria) this;
        }

        public Criteria andCooperatorNotIn(List<String> values) {
            addCriterion("COOPERATOR not in", values, "cooperator");
            return (Criteria) this;
        }

        public Criteria andCooperatorBetween(String value1, String value2) {
            addCriterion("COOPERATOR between", value1, value2, "cooperator");
            return (Criteria) this;
        }

        public Criteria andCooperatorNotBetween(String value1, String value2) {
            addCriterion("COOPERATOR not between", value1, value2, "cooperator");
            return (Criteria) this;
        }

        public Criteria andMerchantcodeIsNull() {
            addCriterion("MERCHANTCODE is null");
            return (Criteria) this;
        }

        public Criteria andMerchantcodeIsNotNull() {
            addCriterion("MERCHANTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantcodeEqualTo(String value) {
            addCriterion("MERCHANTCODE =", value, "merchantcode");
            return (Criteria) this;
        }

        public Criteria andMerchantcodeNotEqualTo(String value) {
            addCriterion("MERCHANTCODE <>", value, "merchantcode");
            return (Criteria) this;
        }

        public Criteria andMerchantcodeGreaterThan(String value) {
            addCriterion("MERCHANTCODE >", value, "merchantcode");
            return (Criteria) this;
        }

        public Criteria andMerchantcodeGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANTCODE >=", value, "merchantcode");
            return (Criteria) this;
        }

        public Criteria andMerchantcodeLessThan(String value) {
            addCriterion("MERCHANTCODE <", value, "merchantcode");
            return (Criteria) this;
        }

        public Criteria andMerchantcodeLessThanOrEqualTo(String value) {
            addCriterion("MERCHANTCODE <=", value, "merchantcode");
            return (Criteria) this;
        }

        public Criteria andMerchantcodeLike(String value) {
            addCriterion("MERCHANTCODE like", value, "merchantcode");
            return (Criteria) this;
        }

        public Criteria andMerchantcodeNotLike(String value) {
            addCriterion("MERCHANTCODE not like", value, "merchantcode");
            return (Criteria) this;
        }

        public Criteria andMerchantcodeIn(List<String> values) {
            addCriterion("MERCHANTCODE in", values, "merchantcode");
            return (Criteria) this;
        }

        public Criteria andMerchantcodeNotIn(List<String> values) {
            addCriterion("MERCHANTCODE not in", values, "merchantcode");
            return (Criteria) this;
        }

        public Criteria andMerchantcodeBetween(String value1, String value2) {
            addCriterion("MERCHANTCODE between", value1, value2, "merchantcode");
            return (Criteria) this;
        }

        public Criteria andMerchantcodeNotBetween(String value1, String value2) {
            addCriterion("MERCHANTCODE not between", value1, value2, "merchantcode");
            return (Criteria) this;
        }

        public Criteria andSmzfmsgidIsNull() {
            addCriterion("SMZFMSGID is null");
            return (Criteria) this;
        }

        public Criteria andSmzfmsgidIsNotNull() {
            addCriterion("SMZFMSGID is not null");
            return (Criteria) this;
        }

        public Criteria andSmzfmsgidEqualTo(String value) {
            addCriterion("SMZFMSGID =", value, "smzfmsgid");
            return (Criteria) this;
        }

        public Criteria andSmzfmsgidNotEqualTo(String value) {
            addCriterion("SMZFMSGID <>", value, "smzfmsgid");
            return (Criteria) this;
        }

        public Criteria andSmzfmsgidGreaterThan(String value) {
            addCriterion("SMZFMSGID >", value, "smzfmsgid");
            return (Criteria) this;
        }

        public Criteria andSmzfmsgidGreaterThanOrEqualTo(String value) {
            addCriterion("SMZFMSGID >=", value, "smzfmsgid");
            return (Criteria) this;
        }

        public Criteria andSmzfmsgidLessThan(String value) {
            addCriterion("SMZFMSGID <", value, "smzfmsgid");
            return (Criteria) this;
        }

        public Criteria andSmzfmsgidLessThanOrEqualTo(String value) {
            addCriterion("SMZFMSGID <=", value, "smzfmsgid");
            return (Criteria) this;
        }

        public Criteria andSmzfmsgidLike(String value) {
            addCriterion("SMZFMSGID like", value, "smzfmsgid");
            return (Criteria) this;
        }

        public Criteria andSmzfmsgidNotLike(String value) {
            addCriterion("SMZFMSGID not like", value, "smzfmsgid");
            return (Criteria) this;
        }

        public Criteria andSmzfmsgidIn(List<String> values) {
            addCriterion("SMZFMSGID in", values, "smzfmsgid");
            return (Criteria) this;
        }

        public Criteria andSmzfmsgidNotIn(List<String> values) {
            addCriterion("SMZFMSGID not in", values, "smzfmsgid");
            return (Criteria) this;
        }

        public Criteria andSmzfmsgidBetween(String value1, String value2) {
            addCriterion("SMZFMSGID between", value1, value2, "smzfmsgid");
            return (Criteria) this;
        }

        public Criteria andSmzfmsgidNotBetween(String value1, String value2) {
            addCriterion("SMZFMSGID not between", value1, value2, "smzfmsgid");
            return (Criteria) this;
        }

        public Criteria andReqmsgidIsNull() {
            addCriterion("REQMSGID is null");
            return (Criteria) this;
        }

        public Criteria andReqmsgidIsNotNull() {
            addCriterion("REQMSGID is not null");
            return (Criteria) this;
        }

        public Criteria andReqmsgidEqualTo(String value) {
            addCriterion("REQMSGID =", value, "reqmsgid");
            return (Criteria) this;
        }

        public Criteria andReqmsgidNotEqualTo(String value) {
            addCriterion("REQMSGID <>", value, "reqmsgid");
            return (Criteria) this;
        }

        public Criteria andReqmsgidGreaterThan(String value) {
            addCriterion("REQMSGID >", value, "reqmsgid");
            return (Criteria) this;
        }

        public Criteria andReqmsgidGreaterThanOrEqualTo(String value) {
            addCriterion("REQMSGID >=", value, "reqmsgid");
            return (Criteria) this;
        }

        public Criteria andReqmsgidLessThan(String value) {
            addCriterion("REQMSGID <", value, "reqmsgid");
            return (Criteria) this;
        }

        public Criteria andReqmsgidLessThanOrEqualTo(String value) {
            addCriterion("REQMSGID <=", value, "reqmsgid");
            return (Criteria) this;
        }

        public Criteria andReqmsgidLike(String value) {
            addCriterion("REQMSGID like", value, "reqmsgid");
            return (Criteria) this;
        }

        public Criteria andReqmsgidNotLike(String value) {
            addCriterion("REQMSGID not like", value, "reqmsgid");
            return (Criteria) this;
        }

        public Criteria andReqmsgidIn(List<String> values) {
            addCriterion("REQMSGID in", values, "reqmsgid");
            return (Criteria) this;
        }

        public Criteria andReqmsgidNotIn(List<String> values) {
            addCriterion("REQMSGID not in", values, "reqmsgid");
            return (Criteria) this;
        }

        public Criteria andReqmsgidBetween(String value1, String value2) {
            addCriterion("REQMSGID between", value1, value2, "reqmsgid");
            return (Criteria) this;
        }

        public Criteria andReqmsgidNotBetween(String value1, String value2) {
            addCriterion("REQMSGID not between", value1, value2, "reqmsgid");
            return (Criteria) this;
        }

        public Criteria andAccnoIsNull() {
            addCriterion("ACCNO is null");
            return (Criteria) this;
        }

        public Criteria andAccnoIsNotNull() {
            addCriterion("ACCNO is not null");
            return (Criteria) this;
        }

        public Criteria andAccnoEqualTo(String value) {
            addCriterion("ACCNO =", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotEqualTo(String value) {
            addCriterion("ACCNO <>", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoGreaterThan(String value) {
            addCriterion("ACCNO >", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCNO >=", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLessThan(String value) {
            addCriterion("ACCNO <", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLessThanOrEqualTo(String value) {
            addCriterion("ACCNO <=", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLike(String value) {
            addCriterion("ACCNO like", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotLike(String value) {
            addCriterion("ACCNO not like", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoIn(List<String> values) {
            addCriterion("ACCNO in", values, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotIn(List<String> values) {
            addCriterion("ACCNO not in", values, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoBetween(String value1, String value2) {
            addCriterion("ACCNO between", value1, value2, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotBetween(String value1, String value2) {
            addCriterion("ACCNO not between", value1, value2, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnameIsNull() {
            addCriterion("ACCNAME is null");
            return (Criteria) this;
        }

        public Criteria andAccnameIsNotNull() {
            addCriterion("ACCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccnameEqualTo(String value) {
            addCriterion("ACCNAME =", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotEqualTo(String value) {
            addCriterion("ACCNAME <>", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameGreaterThan(String value) {
            addCriterion("ACCNAME >", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCNAME >=", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLessThan(String value) {
            addCriterion("ACCNAME <", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLessThanOrEqualTo(String value) {
            addCriterion("ACCNAME <=", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLike(String value) {
            addCriterion("ACCNAME like", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotLike(String value) {
            addCriterion("ACCNAME not like", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameIn(List<String> values) {
            addCriterion("ACCNAME in", values, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotIn(List<String> values) {
            addCriterion("ACCNAME not in", values, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameBetween(String value1, String value2) {
            addCriterion("ACCNAME between", value1, value2, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotBetween(String value1, String value2) {
            addCriterion("ACCNAME not between", value1, value2, "accname");
            return (Criteria) this;
        }

        public Criteria andDrawamountIsNull() {
            addCriterion("DRAWAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDrawamountIsNotNull() {
            addCriterion("DRAWAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDrawamountEqualTo(BigDecimal value) {
            addCriterion("DRAWAMOUNT =", value, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountNotEqualTo(BigDecimal value) {
            addCriterion("DRAWAMOUNT <>", value, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountGreaterThan(BigDecimal value) {
            addCriterion("DRAWAMOUNT >", value, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DRAWAMOUNT >=", value, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountLessThan(BigDecimal value) {
            addCriterion("DRAWAMOUNT <", value, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DRAWAMOUNT <=", value, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountIn(List<BigDecimal> values) {
            addCriterion("DRAWAMOUNT in", values, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountNotIn(List<BigDecimal> values) {
            addCriterion("DRAWAMOUNT not in", values, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRAWAMOUNT between", value1, value2, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRAWAMOUNT not between", value1, value2, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawfeeIsNull() {
            addCriterion("DRAWFEE is null");
            return (Criteria) this;
        }

        public Criteria andDrawfeeIsNotNull() {
            addCriterion("DRAWFEE is not null");
            return (Criteria) this;
        }

        public Criteria andDrawfeeEqualTo(BigDecimal value) {
            addCriterion("DRAWFEE =", value, "drawfee");
            return (Criteria) this;
        }

        public Criteria andDrawfeeNotEqualTo(BigDecimal value) {
            addCriterion("DRAWFEE <>", value, "drawfee");
            return (Criteria) this;
        }

        public Criteria andDrawfeeGreaterThan(BigDecimal value) {
            addCriterion("DRAWFEE >", value, "drawfee");
            return (Criteria) this;
        }

        public Criteria andDrawfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DRAWFEE >=", value, "drawfee");
            return (Criteria) this;
        }

        public Criteria andDrawfeeLessThan(BigDecimal value) {
            addCriterion("DRAWFEE <", value, "drawfee");
            return (Criteria) this;
        }

        public Criteria andDrawfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DRAWFEE <=", value, "drawfee");
            return (Criteria) this;
        }

        public Criteria andDrawfeeIn(List<BigDecimal> values) {
            addCriterion("DRAWFEE in", values, "drawfee");
            return (Criteria) this;
        }

        public Criteria andDrawfeeNotIn(List<BigDecimal> values) {
            addCriterion("DRAWFEE not in", values, "drawfee");
            return (Criteria) this;
        }

        public Criteria andDrawfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRAWFEE between", value1, value2, "drawfee");
            return (Criteria) this;
        }

        public Criteria andDrawfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRAWFEE not between", value1, value2, "drawfee");
            return (Criteria) this;
        }

        public Criteria andTradefeeIsNull() {
            addCriterion("TRADEFEE is null");
            return (Criteria) this;
        }

        public Criteria andTradefeeIsNotNull() {
            addCriterion("TRADEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andTradefeeEqualTo(BigDecimal value) {
            addCriterion("TRADEFEE =", value, "tradefee");
            return (Criteria) this;
        }

        public Criteria andTradefeeNotEqualTo(BigDecimal value) {
            addCriterion("TRADEFEE <>", value, "tradefee");
            return (Criteria) this;
        }

        public Criteria andTradefeeGreaterThan(BigDecimal value) {
            addCriterion("TRADEFEE >", value, "tradefee");
            return (Criteria) this;
        }

        public Criteria andTradefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADEFEE >=", value, "tradefee");
            return (Criteria) this;
        }

        public Criteria andTradefeeLessThan(BigDecimal value) {
            addCriterion("TRADEFEE <", value, "tradefee");
            return (Criteria) this;
        }

        public Criteria andTradefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADEFEE <=", value, "tradefee");
            return (Criteria) this;
        }

        public Criteria andTradefeeIn(List<BigDecimal> values) {
            addCriterion("TRADEFEE in", values, "tradefee");
            return (Criteria) this;
        }

        public Criteria andTradefeeNotIn(List<BigDecimal> values) {
            addCriterion("TRADEFEE not in", values, "tradefee");
            return (Criteria) this;
        }

        public Criteria andTradefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADEFEE between", value1, value2, "tradefee");
            return (Criteria) this;
        }

        public Criteria andTradefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADEFEE not between", value1, value2, "tradefee");
            return (Criteria) this;
        }

        public Criteria andSettledateIsNull() {
            addCriterion("SETTLEDATE is null");
            return (Criteria) this;
        }

        public Criteria andSettledateIsNotNull() {
            addCriterion("SETTLEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSettledateEqualTo(String value) {
            addCriterion("SETTLEDATE =", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateNotEqualTo(String value) {
            addCriterion("SETTLEDATE <>", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateGreaterThan(String value) {
            addCriterion("SETTLEDATE >", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEDATE >=", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateLessThan(String value) {
            addCriterion("SETTLEDATE <", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateLessThanOrEqualTo(String value) {
            addCriterion("SETTLEDATE <=", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateLike(String value) {
            addCriterion("SETTLEDATE like", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateNotLike(String value) {
            addCriterion("SETTLEDATE not like", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateIn(List<String> values) {
            addCriterion("SETTLEDATE in", values, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateNotIn(List<String> values) {
            addCriterion("SETTLEDATE not in", values, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateBetween(String value1, String value2) {
            addCriterion("SETTLEDATE between", value1, value2, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateNotBetween(String value1, String value2) {
            addCriterion("SETTLEDATE not between", value1, value2, "settledate");
            return (Criteria) this;
        }

        public Criteria andResptypeIsNull() {
            addCriterion("RESPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andResptypeIsNotNull() {
            addCriterion("RESPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andResptypeEqualTo(String value) {
            addCriterion("RESPTYPE =", value, "resptype");
            return (Criteria) this;
        }

        public Criteria andResptypeNotEqualTo(String value) {
            addCriterion("RESPTYPE <>", value, "resptype");
            return (Criteria) this;
        }

        public Criteria andResptypeGreaterThan(String value) {
            addCriterion("RESPTYPE >", value, "resptype");
            return (Criteria) this;
        }

        public Criteria andResptypeGreaterThanOrEqualTo(String value) {
            addCriterion("RESPTYPE >=", value, "resptype");
            return (Criteria) this;
        }

        public Criteria andResptypeLessThan(String value) {
            addCriterion("RESPTYPE <", value, "resptype");
            return (Criteria) this;
        }

        public Criteria andResptypeLessThanOrEqualTo(String value) {
            addCriterion("RESPTYPE <=", value, "resptype");
            return (Criteria) this;
        }

        public Criteria andResptypeLike(String value) {
            addCriterion("RESPTYPE like", value, "resptype");
            return (Criteria) this;
        }

        public Criteria andResptypeNotLike(String value) {
            addCriterion("RESPTYPE not like", value, "resptype");
            return (Criteria) this;
        }

        public Criteria andResptypeIn(List<String> values) {
            addCriterion("RESPTYPE in", values, "resptype");
            return (Criteria) this;
        }

        public Criteria andResptypeNotIn(List<String> values) {
            addCriterion("RESPTYPE not in", values, "resptype");
            return (Criteria) this;
        }

        public Criteria andResptypeBetween(String value1, String value2) {
            addCriterion("RESPTYPE between", value1, value2, "resptype");
            return (Criteria) this;
        }

        public Criteria andResptypeNotBetween(String value1, String value2) {
            addCriterion("RESPTYPE not between", value1, value2, "resptype");
            return (Criteria) this;
        }

        public Criteria andRespcodeIsNull() {
            addCriterion("RESPCODE is null");
            return (Criteria) this;
        }

        public Criteria andRespcodeIsNotNull() {
            addCriterion("RESPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRespcodeEqualTo(String value) {
            addCriterion("RESPCODE =", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotEqualTo(String value) {
            addCriterion("RESPCODE <>", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeGreaterThan(String value) {
            addCriterion("RESPCODE >", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESPCODE >=", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLessThan(String value) {
            addCriterion("RESPCODE <", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLessThanOrEqualTo(String value) {
            addCriterion("RESPCODE <=", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLike(String value) {
            addCriterion("RESPCODE like", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotLike(String value) {
            addCriterion("RESPCODE not like", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeIn(List<String> values) {
            addCriterion("RESPCODE in", values, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotIn(List<String> values) {
            addCriterion("RESPCODE not in", values, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeBetween(String value1, String value2) {
            addCriterion("RESPCODE between", value1, value2, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotBetween(String value1, String value2) {
            addCriterion("RESPCODE not between", value1, value2, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespmsgIsNull() {
            addCriterion("RESPMSG is null");
            return (Criteria) this;
        }

        public Criteria andRespmsgIsNotNull() {
            addCriterion("RESPMSG is not null");
            return (Criteria) this;
        }

        public Criteria andRespmsgEqualTo(String value) {
            addCriterion("RESPMSG =", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotEqualTo(String value) {
            addCriterion("RESPMSG <>", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgGreaterThan(String value) {
            addCriterion("RESPMSG >", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgGreaterThanOrEqualTo(String value) {
            addCriterion("RESPMSG >=", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgLessThan(String value) {
            addCriterion("RESPMSG <", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgLessThanOrEqualTo(String value) {
            addCriterion("RESPMSG <=", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgLike(String value) {
            addCriterion("RESPMSG like", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotLike(String value) {
            addCriterion("RESPMSG not like", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgIn(List<String> values) {
            addCriterion("RESPMSG in", values, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotIn(List<String> values) {
            addCriterion("RESPMSG not in", values, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgBetween(String value1, String value2) {
            addCriterion("RESPMSG between", value1, value2, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotBetween(String value1, String value2) {
            addCriterion("RESPMSG not between", value1, value2, "respmsg");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
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
     * This class corresponds to the database table TBL_T0_CHECK_FILE_RESPONSE
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