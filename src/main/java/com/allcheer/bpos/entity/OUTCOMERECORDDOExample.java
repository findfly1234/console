package com.allcheer.bpos.entity;

import java.util.ArrayList;
import java.util.List;

public class OUTCOMERECORDDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OUTCOMERECORDDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNull() {
            addCriterion("MER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNotNull() {
            addCriterion("MER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerIdEqualTo(String value) {
            addCriterion("MER_ID =", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotEqualTo(String value) {
            addCriterion("MER_ID <>", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThan(String value) {
            addCriterion("MER_ID >", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThanOrEqualTo(String value) {
            addCriterion("MER_ID >=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThan(String value) {
            addCriterion("MER_ID <", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThanOrEqualTo(String value) {
            addCriterion("MER_ID <=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLike(String value) {
            addCriterion("MER_ID like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotLike(String value) {
            addCriterion("MER_ID not like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdIn(List<String> values) {
            addCriterion("MER_ID in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotIn(List<String> values) {
            addCriterion("MER_ID not in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdBetween(String value1, String value2) {
            addCriterion("MER_ID between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotBetween(String value1, String value2) {
            addCriterion("MER_ID not between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerDateIsNull() {
            addCriterion("MER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMerDateIsNotNull() {
            addCriterion("MER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMerDateEqualTo(String value) {
            addCriterion("MER_DATE =", value, "merDate");
            return (Criteria) this;
        }

        public Criteria andMerDateNotEqualTo(String value) {
            addCriterion("MER_DATE <>", value, "merDate");
            return (Criteria) this;
        }

        public Criteria andMerDateGreaterThan(String value) {
            addCriterion("MER_DATE >", value, "merDate");
            return (Criteria) this;
        }

        public Criteria andMerDateGreaterThanOrEqualTo(String value) {
            addCriterion("MER_DATE >=", value, "merDate");
            return (Criteria) this;
        }

        public Criteria andMerDateLessThan(String value) {
            addCriterion("MER_DATE <", value, "merDate");
            return (Criteria) this;
        }

        public Criteria andMerDateLessThanOrEqualTo(String value) {
            addCriterion("MER_DATE <=", value, "merDate");
            return (Criteria) this;
        }

        public Criteria andMerDateLike(String value) {
            addCriterion("MER_DATE like", value, "merDate");
            return (Criteria) this;
        }

        public Criteria andMerDateNotLike(String value) {
            addCriterion("MER_DATE not like", value, "merDate");
            return (Criteria) this;
        }

        public Criteria andMerDateIn(List<String> values) {
            addCriterion("MER_DATE in", values, "merDate");
            return (Criteria) this;
        }

        public Criteria andMerDateNotIn(List<String> values) {
            addCriterion("MER_DATE not in", values, "merDate");
            return (Criteria) this;
        }

        public Criteria andMerDateBetween(String value1, String value2) {
            addCriterion("MER_DATE between", value1, value2, "merDate");
            return (Criteria) this;
        }

        public Criteria andMerDateNotBetween(String value1, String value2) {
            addCriterion("MER_DATE not between", value1, value2, "merDate");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdIsNull() {
            addCriterion("MER_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdIsNotNull() {
            addCriterion("MER_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdEqualTo(String value) {
            addCriterion("MER_ORDER_ID =", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdNotEqualTo(String value) {
            addCriterion("MER_ORDER_ID <>", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdGreaterThan(String value) {
            addCriterion("MER_ORDER_ID >", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("MER_ORDER_ID >=", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdLessThan(String value) {
            addCriterion("MER_ORDER_ID <", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdLessThanOrEqualTo(String value) {
            addCriterion("MER_ORDER_ID <=", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdLike(String value) {
            addCriterion("MER_ORDER_ID like", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdNotLike(String value) {
            addCriterion("MER_ORDER_ID not like", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdIn(List<String> values) {
            addCriterion("MER_ORDER_ID in", values, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdNotIn(List<String> values) {
            addCriterion("MER_ORDER_ID not in", values, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdBetween(String value1, String value2) {
            addCriterion("MER_ORDER_ID between", value1, value2, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdNotBetween(String value1, String value2) {
            addCriterion("MER_ORDER_ID not between", value1, value2, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerBatchIdIsNull() {
            addCriterion("MER_BATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerBatchIdIsNotNull() {
            addCriterion("MER_BATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerBatchIdEqualTo(String value) {
            addCriterion("MER_BATCH_ID =", value, "merBatchId");
            return (Criteria) this;
        }

        public Criteria andMerBatchIdNotEqualTo(String value) {
            addCriterion("MER_BATCH_ID <>", value, "merBatchId");
            return (Criteria) this;
        }

        public Criteria andMerBatchIdGreaterThan(String value) {
            addCriterion("MER_BATCH_ID >", value, "merBatchId");
            return (Criteria) this;
        }

        public Criteria andMerBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("MER_BATCH_ID >=", value, "merBatchId");
            return (Criteria) this;
        }

        public Criteria andMerBatchIdLessThan(String value) {
            addCriterion("MER_BATCH_ID <", value, "merBatchId");
            return (Criteria) this;
        }

        public Criteria andMerBatchIdLessThanOrEqualTo(String value) {
            addCriterion("MER_BATCH_ID <=", value, "merBatchId");
            return (Criteria) this;
        }

        public Criteria andMerBatchIdLike(String value) {
            addCriterion("MER_BATCH_ID like", value, "merBatchId");
            return (Criteria) this;
        }

        public Criteria andMerBatchIdNotLike(String value) {
            addCriterion("MER_BATCH_ID not like", value, "merBatchId");
            return (Criteria) this;
        }

        public Criteria andMerBatchIdIn(List<String> values) {
            addCriterion("MER_BATCH_ID in", values, "merBatchId");
            return (Criteria) this;
        }

        public Criteria andMerBatchIdNotIn(List<String> values) {
            addCriterion("MER_BATCH_ID not in", values, "merBatchId");
            return (Criteria) this;
        }

        public Criteria andMerBatchIdBetween(String value1, String value2) {
            addCriterion("MER_BATCH_ID between", value1, value2, "merBatchId");
            return (Criteria) this;
        }

        public Criteria andMerBatchIdNotBetween(String value1, String value2) {
            addCriterion("MER_BATCH_ID not between", value1, value2, "merBatchId");
            return (Criteria) this;
        }

        public Criteria andMerTransIdIsNull() {
            addCriterion("MER_TRANS_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerTransIdIsNotNull() {
            addCriterion("MER_TRANS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerTransIdEqualTo(String value) {
            addCriterion("MER_TRANS_ID =", value, "merTransId");
            return (Criteria) this;
        }

        public Criteria andMerTransIdNotEqualTo(String value) {
            addCriterion("MER_TRANS_ID <>", value, "merTransId");
            return (Criteria) this;
        }

        public Criteria andMerTransIdGreaterThan(String value) {
            addCriterion("MER_TRANS_ID >", value, "merTransId");
            return (Criteria) this;
        }

        public Criteria andMerTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("MER_TRANS_ID >=", value, "merTransId");
            return (Criteria) this;
        }

        public Criteria andMerTransIdLessThan(String value) {
            addCriterion("MER_TRANS_ID <", value, "merTransId");
            return (Criteria) this;
        }

        public Criteria andMerTransIdLessThanOrEqualTo(String value) {
            addCriterion("MER_TRANS_ID <=", value, "merTransId");
            return (Criteria) this;
        }

        public Criteria andMerTransIdLike(String value) {
            addCriterion("MER_TRANS_ID like", value, "merTransId");
            return (Criteria) this;
        }

        public Criteria andMerTransIdNotLike(String value) {
            addCriterion("MER_TRANS_ID not like", value, "merTransId");
            return (Criteria) this;
        }

        public Criteria andMerTransIdIn(List<String> values) {
            addCriterion("MER_TRANS_ID in", values, "merTransId");
            return (Criteria) this;
        }

        public Criteria andMerTransIdNotIn(List<String> values) {
            addCriterion("MER_TRANS_ID not in", values, "merTransId");
            return (Criteria) this;
        }

        public Criteria andMerTransIdBetween(String value1, String value2) {
            addCriterion("MER_TRANS_ID between", value1, value2, "merTransId");
            return (Criteria) this;
        }

        public Criteria andMerTransIdNotBetween(String value1, String value2) {
            addCriterion("MER_TRANS_ID not between", value1, value2, "merTransId");
            return (Criteria) this;
        }

        public Criteria andRecvDateIsNull() {
            addCriterion("RECV_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRecvDateIsNotNull() {
            addCriterion("RECV_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRecvDateEqualTo(String value) {
            addCriterion("RECV_DATE =", value, "recvDate");
            return (Criteria) this;
        }

        public Criteria andRecvDateNotEqualTo(String value) {
            addCriterion("RECV_DATE <>", value, "recvDate");
            return (Criteria) this;
        }

        public Criteria andRecvDateGreaterThan(String value) {
            addCriterion("RECV_DATE >", value, "recvDate");
            return (Criteria) this;
        }

        public Criteria andRecvDateGreaterThanOrEqualTo(String value) {
            addCriterion("RECV_DATE >=", value, "recvDate");
            return (Criteria) this;
        }

        public Criteria andRecvDateLessThan(String value) {
            addCriterion("RECV_DATE <", value, "recvDate");
            return (Criteria) this;
        }

        public Criteria andRecvDateLessThanOrEqualTo(String value) {
            addCriterion("RECV_DATE <=", value, "recvDate");
            return (Criteria) this;
        }

        public Criteria andRecvDateLike(String value) {
            addCriterion("RECV_DATE like", value, "recvDate");
            return (Criteria) this;
        }

        public Criteria andRecvDateNotLike(String value) {
            addCriterion("RECV_DATE not like", value, "recvDate");
            return (Criteria) this;
        }

        public Criteria andRecvDateIn(List<String> values) {
            addCriterion("RECV_DATE in", values, "recvDate");
            return (Criteria) this;
        }

        public Criteria andRecvDateNotIn(List<String> values) {
            addCriterion("RECV_DATE not in", values, "recvDate");
            return (Criteria) this;
        }

        public Criteria andRecvDateBetween(String value1, String value2) {
            addCriterion("RECV_DATE between", value1, value2, "recvDate");
            return (Criteria) this;
        }

        public Criteria andRecvDateNotBetween(String value1, String value2) {
            addCriterion("RECV_DATE not between", value1, value2, "recvDate");
            return (Criteria) this;
        }

        public Criteria andRecvTimeIsNull() {
            addCriterion("RECV_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRecvTimeIsNotNull() {
            addCriterion("RECV_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecvTimeEqualTo(String value) {
            addCriterion("RECV_TIME =", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeNotEqualTo(String value) {
            addCriterion("RECV_TIME <>", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeGreaterThan(String value) {
            addCriterion("RECV_TIME >", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeGreaterThanOrEqualTo(String value) {
            addCriterion("RECV_TIME >=", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeLessThan(String value) {
            addCriterion("RECV_TIME <", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeLessThanOrEqualTo(String value) {
            addCriterion("RECV_TIME <=", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeLike(String value) {
            addCriterion("RECV_TIME like", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeNotLike(String value) {
            addCriterion("RECV_TIME not like", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeIn(List<String> values) {
            addCriterion("RECV_TIME in", values, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeNotIn(List<String> values) {
            addCriterion("RECV_TIME not in", values, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeBetween(String value1, String value2) {
            addCriterion("RECV_TIME between", value1, value2, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeNotBetween(String value1, String value2) {
            addCriterion("RECV_TIME not between", value1, value2, "recvTime");
            return (Criteria) this;
        }

        public Criteria andTransAmtIsNull() {
            addCriterion("TRANS_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTransAmtIsNotNull() {
            addCriterion("TRANS_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTransAmtEqualTo(String value) {
            addCriterion("TRANS_AMT =", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotEqualTo(String value) {
            addCriterion("TRANS_AMT <>", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtGreaterThan(String value) {
            addCriterion("TRANS_AMT >", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_AMT >=", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtLessThan(String value) {
            addCriterion("TRANS_AMT <", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtLessThanOrEqualTo(String value) {
            addCriterion("TRANS_AMT <=", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtLike(String value) {
            addCriterion("TRANS_AMT like", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotLike(String value) {
            addCriterion("TRANS_AMT not like", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtIn(List<String> values) {
            addCriterion("TRANS_AMT in", values, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotIn(List<String> values) {
            addCriterion("TRANS_AMT not in", values, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtBetween(String value1, String value2) {
            addCriterion("TRANS_AMT between", value1, value2, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotBetween(String value1, String value2) {
            addCriterion("TRANS_AMT not between", value1, value2, "transAmt");
            return (Criteria) this;
        }

        public Criteria andAcctIdIsNull() {
            addCriterion("ACCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAcctIdIsNotNull() {
            addCriterion("ACCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAcctIdEqualTo(String value) {
            addCriterion("ACCT_ID =", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotEqualTo(String value) {
            addCriterion("ACCT_ID <>", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdGreaterThan(String value) {
            addCriterion("ACCT_ID >", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_ID >=", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdLessThan(String value) {
            addCriterion("ACCT_ID <", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdLessThanOrEqualTo(String value) {
            addCriterion("ACCT_ID <=", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdLike(String value) {
            addCriterion("ACCT_ID like", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotLike(String value) {
            addCriterion("ACCT_ID not like", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdIn(List<String> values) {
            addCriterion("ACCT_ID in", values, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotIn(List<String> values) {
            addCriterion("ACCT_ID not in", values, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdBetween(String value1, String value2) {
            addCriterion("ACCT_ID between", value1, value2, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotBetween(String value1, String value2) {
            addCriterion("ACCT_ID not between", value1, value2, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctNameIsNull() {
            addCriterion("ACCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAcctNameIsNotNull() {
            addCriterion("ACCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAcctNameEqualTo(String value) {
            addCriterion("ACCT_NAME =", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotEqualTo(String value) {
            addCriterion("ACCT_NAME <>", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameGreaterThan(String value) {
            addCriterion("ACCT_NAME >", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_NAME >=", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameLessThan(String value) {
            addCriterion("ACCT_NAME <", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameLessThanOrEqualTo(String value) {
            addCriterion("ACCT_NAME <=", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameLike(String value) {
            addCriterion("ACCT_NAME like", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotLike(String value) {
            addCriterion("ACCT_NAME not like", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameIn(List<String> values) {
            addCriterion("ACCT_NAME in", values, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotIn(List<String> values) {
            addCriterion("ACCT_NAME not in", values, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameBetween(String value1, String value2) {
            addCriterion("ACCT_NAME between", value1, value2, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotBetween(String value1, String value2) {
            addCriterion("ACCT_NAME not between", value1, value2, "acctName");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNull() {
            addCriterion("SEND_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNotNull() {
            addCriterion("SEND_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSendDateEqualTo(String value) {
            addCriterion("SEND_DATE =", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotEqualTo(String value) {
            addCriterion("SEND_DATE <>", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThan(String value) {
            addCriterion("SEND_DATE >", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_DATE >=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThan(String value) {
            addCriterion("SEND_DATE <", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThanOrEqualTo(String value) {
            addCriterion("SEND_DATE <=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLike(String value) {
            addCriterion("SEND_DATE like", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotLike(String value) {
            addCriterion("SEND_DATE not like", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateIn(List<String> values) {
            addCriterion("SEND_DATE in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotIn(List<String> values) {
            addCriterion("SEND_DATE not in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateBetween(String value1, String value2) {
            addCriterion("SEND_DATE between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotBetween(String value1, String value2) {
            addCriterion("SEND_DATE not between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("SEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("SEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(String value) {
            addCriterion("SEND_TIME =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(String value) {
            addCriterion("SEND_TIME <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(String value) {
            addCriterion("SEND_TIME >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_TIME >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(String value) {
            addCriterion("SEND_TIME <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(String value) {
            addCriterion("SEND_TIME <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLike(String value) {
            addCriterion("SEND_TIME like", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotLike(String value) {
            addCriterion("SEND_TIME not like", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<String> values) {
            addCriterion("SEND_TIME in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<String> values) {
            addCriterion("SEND_TIME not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(String value1, String value2) {
            addCriterion("SEND_TIME between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(String value1, String value2) {
            addCriterion("SEND_TIME not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andTransStatusIsNull() {
            addCriterion("TRANS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTransStatusIsNotNull() {
            addCriterion("TRANS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTransStatusEqualTo(String value) {
            addCriterion("TRANS_STATUS =", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotEqualTo(String value) {
            addCriterion("TRANS_STATUS <>", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusGreaterThan(String value) {
            addCriterion("TRANS_STATUS >", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_STATUS >=", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusLessThan(String value) {
            addCriterion("TRANS_STATUS <", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusLessThanOrEqualTo(String value) {
            addCriterion("TRANS_STATUS <=", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusLike(String value) {
            addCriterion("TRANS_STATUS like", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotLike(String value) {
            addCriterion("TRANS_STATUS not like", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusIn(List<String> values) {
            addCriterion("TRANS_STATUS in", values, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotIn(List<String> values) {
            addCriterion("TRANS_STATUS not in", values, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusBetween(String value1, String value2) {
            addCriterion("TRANS_STATUS between", value1, value2, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotBetween(String value1, String value2) {
            addCriterion("TRANS_STATUS not between", value1, value2, "transStatus");
            return (Criteria) this;
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

        public Criteria andChannelTransNoIsNull() {
            addCriterion("CHANNEL_TRANS_NO is null");
            return (Criteria) this;
        }

        public Criteria andChannelTransNoIsNotNull() {
            addCriterion("CHANNEL_TRANS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTransNoEqualTo(String value) {
            addCriterion("CHANNEL_TRANS_NO =", value, "channelTransNo");
            return (Criteria) this;
        }

        public Criteria andChannelTransNoNotEqualTo(String value) {
            addCriterion("CHANNEL_TRANS_NO <>", value, "channelTransNo");
            return (Criteria) this;
        }

        public Criteria andChannelTransNoGreaterThan(String value) {
            addCriterion("CHANNEL_TRANS_NO >", value, "channelTransNo");
            return (Criteria) this;
        }

        public Criteria andChannelTransNoGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_TRANS_NO >=", value, "channelTransNo");
            return (Criteria) this;
        }

        public Criteria andChannelTransNoLessThan(String value) {
            addCriterion("CHANNEL_TRANS_NO <", value, "channelTransNo");
            return (Criteria) this;
        }

        public Criteria andChannelTransNoLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_TRANS_NO <=", value, "channelTransNo");
            return (Criteria) this;
        }

        public Criteria andChannelTransNoLike(String value) {
            addCriterion("CHANNEL_TRANS_NO like", value, "channelTransNo");
            return (Criteria) this;
        }

        public Criteria andChannelTransNoNotLike(String value) {
            addCriterion("CHANNEL_TRANS_NO not like", value, "channelTransNo");
            return (Criteria) this;
        }

        public Criteria andChannelTransNoIn(List<String> values) {
            addCriterion("CHANNEL_TRANS_NO in", values, "channelTransNo");
            return (Criteria) this;
        }

        public Criteria andChannelTransNoNotIn(List<String> values) {
            addCriterion("CHANNEL_TRANS_NO not in", values, "channelTransNo");
            return (Criteria) this;
        }

        public Criteria andChannelTransNoBetween(String value1, String value2) {
            addCriterion("CHANNEL_TRANS_NO between", value1, value2, "channelTransNo");
            return (Criteria) this;
        }

        public Criteria andChannelTransNoNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_TRANS_NO not between", value1, value2, "channelTransNo");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdIsNull() {
            addCriterion("CHANNEL_BATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdIsNotNull() {
            addCriterion("CHANNEL_BATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdEqualTo(String value) {
            addCriterion("CHANNEL_BATCH_ID =", value, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdNotEqualTo(String value) {
            addCriterion("CHANNEL_BATCH_ID <>", value, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdGreaterThan(String value) {
            addCriterion("CHANNEL_BATCH_ID >", value, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_BATCH_ID >=", value, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdLessThan(String value) {
            addCriterion("CHANNEL_BATCH_ID <", value, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_BATCH_ID <=", value, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdLike(String value) {
            addCriterion("CHANNEL_BATCH_ID like", value, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdNotLike(String value) {
            addCriterion("CHANNEL_BATCH_ID not like", value, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdIn(List<String> values) {
            addCriterion("CHANNEL_BATCH_ID in", values, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdNotIn(List<String> values) {
            addCriterion("CHANNEL_BATCH_ID not in", values, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdBetween(String value1, String value2) {
            addCriterion("CHANNEL_BATCH_ID between", value1, value2, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_BATCH_ID not between", value1, value2, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelReturnCodeIsNull() {
            addCriterion("CHANNEL_RETURN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnCodeIsNotNull() {
            addCriterion("CHANNEL_RETURN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnCodeEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_CODE =", value, "channelReturnCode");
            return (Criteria) this;
        }

        public Criteria andChannelReturnCodeNotEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_CODE <>", value, "channelReturnCode");
            return (Criteria) this;
        }

        public Criteria andChannelReturnCodeGreaterThan(String value) {
            addCriterion("CHANNEL_RETURN_CODE >", value, "channelReturnCode");
            return (Criteria) this;
        }

        public Criteria andChannelReturnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_CODE >=", value, "channelReturnCode");
            return (Criteria) this;
        }

        public Criteria andChannelReturnCodeLessThan(String value) {
            addCriterion("CHANNEL_RETURN_CODE <", value, "channelReturnCode");
            return (Criteria) this;
        }

        public Criteria andChannelReturnCodeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_CODE <=", value, "channelReturnCode");
            return (Criteria) this;
        }

        public Criteria andChannelReturnCodeLike(String value) {
            addCriterion("CHANNEL_RETURN_CODE like", value, "channelReturnCode");
            return (Criteria) this;
        }

        public Criteria andChannelReturnCodeNotLike(String value) {
            addCriterion("CHANNEL_RETURN_CODE not like", value, "channelReturnCode");
            return (Criteria) this;
        }

        public Criteria andChannelReturnCodeIn(List<String> values) {
            addCriterion("CHANNEL_RETURN_CODE in", values, "channelReturnCode");
            return (Criteria) this;
        }

        public Criteria andChannelReturnCodeNotIn(List<String> values) {
            addCriterion("CHANNEL_RETURN_CODE not in", values, "channelReturnCode");
            return (Criteria) this;
        }

        public Criteria andChannelReturnCodeBetween(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_CODE between", value1, value2, "channelReturnCode");
            return (Criteria) this;
        }

        public Criteria andChannelReturnCodeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_CODE not between", value1, value2, "channelReturnCode");
            return (Criteria) this;
        }

        public Criteria andChannelReturnMessageIsNull() {
            addCriterion("CHANNEL_RETURN_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnMessageIsNotNull() {
            addCriterion("CHANNEL_RETURN_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnMessageEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_MESSAGE =", value, "channelReturnMessage");
            return (Criteria) this;
        }

        public Criteria andChannelReturnMessageNotEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_MESSAGE <>", value, "channelReturnMessage");
            return (Criteria) this;
        }

        public Criteria andChannelReturnMessageGreaterThan(String value) {
            addCriterion("CHANNEL_RETURN_MESSAGE >", value, "channelReturnMessage");
            return (Criteria) this;
        }

        public Criteria andChannelReturnMessageGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_MESSAGE >=", value, "channelReturnMessage");
            return (Criteria) this;
        }

        public Criteria andChannelReturnMessageLessThan(String value) {
            addCriterion("CHANNEL_RETURN_MESSAGE <", value, "channelReturnMessage");
            return (Criteria) this;
        }

        public Criteria andChannelReturnMessageLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_MESSAGE <=", value, "channelReturnMessage");
            return (Criteria) this;
        }

        public Criteria andChannelReturnMessageLike(String value) {
            addCriterion("CHANNEL_RETURN_MESSAGE like", value, "channelReturnMessage");
            return (Criteria) this;
        }

        public Criteria andChannelReturnMessageNotLike(String value) {
            addCriterion("CHANNEL_RETURN_MESSAGE not like", value, "channelReturnMessage");
            return (Criteria) this;
        }

        public Criteria andChannelReturnMessageIn(List<String> values) {
            addCriterion("CHANNEL_RETURN_MESSAGE in", values, "channelReturnMessage");
            return (Criteria) this;
        }

        public Criteria andChannelReturnMessageNotIn(List<String> values) {
            addCriterion("CHANNEL_RETURN_MESSAGE not in", values, "channelReturnMessage");
            return (Criteria) this;
        }

        public Criteria andChannelReturnMessageBetween(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_MESSAGE between", value1, value2, "channelReturnMessage");
            return (Criteria) this;
        }

        public Criteria andChannelReturnMessageNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_MESSAGE not between", value1, value2, "channelReturnMessage");
            return (Criteria) this;
        }

        public Criteria andChannelReturnDateIsNull() {
            addCriterion("CHANNEL_RETURN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnDateIsNotNull() {
            addCriterion("CHANNEL_RETURN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnDateEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_DATE =", value, "channelReturnDate");
            return (Criteria) this;
        }

        public Criteria andChannelReturnDateNotEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_DATE <>", value, "channelReturnDate");
            return (Criteria) this;
        }

        public Criteria andChannelReturnDateGreaterThan(String value) {
            addCriterion("CHANNEL_RETURN_DATE >", value, "channelReturnDate");
            return (Criteria) this;
        }

        public Criteria andChannelReturnDateGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_DATE >=", value, "channelReturnDate");
            return (Criteria) this;
        }

        public Criteria andChannelReturnDateLessThan(String value) {
            addCriterion("CHANNEL_RETURN_DATE <", value, "channelReturnDate");
            return (Criteria) this;
        }

        public Criteria andChannelReturnDateLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_DATE <=", value, "channelReturnDate");
            return (Criteria) this;
        }

        public Criteria andChannelReturnDateLike(String value) {
            addCriterion("CHANNEL_RETURN_DATE like", value, "channelReturnDate");
            return (Criteria) this;
        }

        public Criteria andChannelReturnDateNotLike(String value) {
            addCriterion("CHANNEL_RETURN_DATE not like", value, "channelReturnDate");
            return (Criteria) this;
        }

        public Criteria andChannelReturnDateIn(List<String> values) {
            addCriterion("CHANNEL_RETURN_DATE in", values, "channelReturnDate");
            return (Criteria) this;
        }

        public Criteria andChannelReturnDateNotIn(List<String> values) {
            addCriterion("CHANNEL_RETURN_DATE not in", values, "channelReturnDate");
            return (Criteria) this;
        }

        public Criteria andChannelReturnDateBetween(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_DATE between", value1, value2, "channelReturnDate");
            return (Criteria) this;
        }

        public Criteria andChannelReturnDateNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_DATE not between", value1, value2, "channelReturnDate");
            return (Criteria) this;
        }

        public Criteria andChannelReturnTimeIsNull() {
            addCriterion("CHANNEL_RETURN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnTimeIsNotNull() {
            addCriterion("CHANNEL_RETURN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnTimeEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_TIME =", value, "channelReturnTime");
            return (Criteria) this;
        }

        public Criteria andChannelReturnTimeNotEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_TIME <>", value, "channelReturnTime");
            return (Criteria) this;
        }

        public Criteria andChannelReturnTimeGreaterThan(String value) {
            addCriterion("CHANNEL_RETURN_TIME >", value, "channelReturnTime");
            return (Criteria) this;
        }

        public Criteria andChannelReturnTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_TIME >=", value, "channelReturnTime");
            return (Criteria) this;
        }

        public Criteria andChannelReturnTimeLessThan(String value) {
            addCriterion("CHANNEL_RETURN_TIME <", value, "channelReturnTime");
            return (Criteria) this;
        }

        public Criteria andChannelReturnTimeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_TIME <=", value, "channelReturnTime");
            return (Criteria) this;
        }

        public Criteria andChannelReturnTimeLike(String value) {
            addCriterion("CHANNEL_RETURN_TIME like", value, "channelReturnTime");
            return (Criteria) this;
        }

        public Criteria andChannelReturnTimeNotLike(String value) {
            addCriterion("CHANNEL_RETURN_TIME not like", value, "channelReturnTime");
            return (Criteria) this;
        }

        public Criteria andChannelReturnTimeIn(List<String> values) {
            addCriterion("CHANNEL_RETURN_TIME in", values, "channelReturnTime");
            return (Criteria) this;
        }

        public Criteria andChannelReturnTimeNotIn(List<String> values) {
            addCriterion("CHANNEL_RETURN_TIME not in", values, "channelReturnTime");
            return (Criteria) this;
        }

        public Criteria andChannelReturnTimeBetween(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_TIME between", value1, value2, "channelReturnTime");
            return (Criteria) this;
        }

        public Criteria andChannelReturnTimeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_TIME not between", value1, value2, "channelReturnTime");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq1IsNull() {
            addCriterion("CHANNEL_RETURN_SEQ1 is null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq1IsNotNull() {
            addCriterion("CHANNEL_RETURN_SEQ1 is not null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq1EqualTo(String value) {
            addCriterion("CHANNEL_RETURN_SEQ1 =", value, "channelReturnSeq1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq1NotEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_SEQ1 <>", value, "channelReturnSeq1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq1GreaterThan(String value) {
            addCriterion("CHANNEL_RETURN_SEQ1 >", value, "channelReturnSeq1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq1GreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_SEQ1 >=", value, "channelReturnSeq1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq1LessThan(String value) {
            addCriterion("CHANNEL_RETURN_SEQ1 <", value, "channelReturnSeq1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq1LessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_SEQ1 <=", value, "channelReturnSeq1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq1Like(String value) {
            addCriterion("CHANNEL_RETURN_SEQ1 like", value, "channelReturnSeq1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq1NotLike(String value) {
            addCriterion("CHANNEL_RETURN_SEQ1 not like", value, "channelReturnSeq1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq1In(List<String> values) {
            addCriterion("CHANNEL_RETURN_SEQ1 in", values, "channelReturnSeq1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq1NotIn(List<String> values) {
            addCriterion("CHANNEL_RETURN_SEQ1 not in", values, "channelReturnSeq1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq1Between(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_SEQ1 between", value1, value2, "channelReturnSeq1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq1NotBetween(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_SEQ1 not between", value1, value2, "channelReturnSeq1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq2IsNull() {
            addCriterion("CHANNEL_RETURN_SEQ2 is null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq2IsNotNull() {
            addCriterion("CHANNEL_RETURN_SEQ2 is not null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq2EqualTo(String value) {
            addCriterion("CHANNEL_RETURN_SEQ2 =", value, "channelReturnSeq2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq2NotEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_SEQ2 <>", value, "channelReturnSeq2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq2GreaterThan(String value) {
            addCriterion("CHANNEL_RETURN_SEQ2 >", value, "channelReturnSeq2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq2GreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_SEQ2 >=", value, "channelReturnSeq2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq2LessThan(String value) {
            addCriterion("CHANNEL_RETURN_SEQ2 <", value, "channelReturnSeq2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq2LessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_SEQ2 <=", value, "channelReturnSeq2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq2Like(String value) {
            addCriterion("CHANNEL_RETURN_SEQ2 like", value, "channelReturnSeq2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq2NotLike(String value) {
            addCriterion("CHANNEL_RETURN_SEQ2 not like", value, "channelReturnSeq2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq2In(List<String> values) {
            addCriterion("CHANNEL_RETURN_SEQ2 in", values, "channelReturnSeq2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq2NotIn(List<String> values) {
            addCriterion("CHANNEL_RETURN_SEQ2 not in", values, "channelReturnSeq2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq2Between(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_SEQ2 between", value1, value2, "channelReturnSeq2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnSeq2NotBetween(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_SEQ2 not between", value1, value2, "channelReturnSeq2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv1IsNull() {
            addCriterion("CHANNEL_RETURN_RESV1 is null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv1IsNotNull() {
            addCriterion("CHANNEL_RETURN_RESV1 is not null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv1EqualTo(String value) {
            addCriterion("CHANNEL_RETURN_RESV1 =", value, "channelReturnResv1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv1NotEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_RESV1 <>", value, "channelReturnResv1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv1GreaterThan(String value) {
            addCriterion("CHANNEL_RETURN_RESV1 >", value, "channelReturnResv1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv1GreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_RESV1 >=", value, "channelReturnResv1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv1LessThan(String value) {
            addCriterion("CHANNEL_RETURN_RESV1 <", value, "channelReturnResv1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv1LessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_RESV1 <=", value, "channelReturnResv1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv1Like(String value) {
            addCriterion("CHANNEL_RETURN_RESV1 like", value, "channelReturnResv1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv1NotLike(String value) {
            addCriterion("CHANNEL_RETURN_RESV1 not like", value, "channelReturnResv1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv1In(List<String> values) {
            addCriterion("CHANNEL_RETURN_RESV1 in", values, "channelReturnResv1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv1NotIn(List<String> values) {
            addCriterion("CHANNEL_RETURN_RESV1 not in", values, "channelReturnResv1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv1Between(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_RESV1 between", value1, value2, "channelReturnResv1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv1NotBetween(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_RESV1 not between", value1, value2, "channelReturnResv1");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv2IsNull() {
            addCriterion("CHANNEL_RETURN_RESV2 is null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv2IsNotNull() {
            addCriterion("CHANNEL_RETURN_RESV2 is not null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv2EqualTo(String value) {
            addCriterion("CHANNEL_RETURN_RESV2 =", value, "channelReturnResv2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv2NotEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_RESV2 <>", value, "channelReturnResv2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv2GreaterThan(String value) {
            addCriterion("CHANNEL_RETURN_RESV2 >", value, "channelReturnResv2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv2GreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_RESV2 >=", value, "channelReturnResv2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv2LessThan(String value) {
            addCriterion("CHANNEL_RETURN_RESV2 <", value, "channelReturnResv2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv2LessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_RESV2 <=", value, "channelReturnResv2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv2Like(String value) {
            addCriterion("CHANNEL_RETURN_RESV2 like", value, "channelReturnResv2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv2NotLike(String value) {
            addCriterion("CHANNEL_RETURN_RESV2 not like", value, "channelReturnResv2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv2In(List<String> values) {
            addCriterion("CHANNEL_RETURN_RESV2 in", values, "channelReturnResv2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv2NotIn(List<String> values) {
            addCriterion("CHANNEL_RETURN_RESV2 not in", values, "channelReturnResv2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv2Between(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_RESV2 between", value1, value2, "channelReturnResv2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv2NotBetween(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_RESV2 not between", value1, value2, "channelReturnResv2");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv3IsNull() {
            addCriterion("CHANNEL_RETURN_RESV3 is null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv3IsNotNull() {
            addCriterion("CHANNEL_RETURN_RESV3 is not null");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv3EqualTo(String value) {
            addCriterion("CHANNEL_RETURN_RESV3 =", value, "channelReturnResv3");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv3NotEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_RESV3 <>", value, "channelReturnResv3");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv3GreaterThan(String value) {
            addCriterion("CHANNEL_RETURN_RESV3 >", value, "channelReturnResv3");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv3GreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_RESV3 >=", value, "channelReturnResv3");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv3LessThan(String value) {
            addCriterion("CHANNEL_RETURN_RESV3 <", value, "channelReturnResv3");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv3LessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RETURN_RESV3 <=", value, "channelReturnResv3");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv3Like(String value) {
            addCriterion("CHANNEL_RETURN_RESV3 like", value, "channelReturnResv3");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv3NotLike(String value) {
            addCriterion("CHANNEL_RETURN_RESV3 not like", value, "channelReturnResv3");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv3In(List<String> values) {
            addCriterion("CHANNEL_RETURN_RESV3 in", values, "channelReturnResv3");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv3NotIn(List<String> values) {
            addCriterion("CHANNEL_RETURN_RESV3 not in", values, "channelReturnResv3");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv3Between(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_RESV3 between", value1, value2, "channelReturnResv3");
            return (Criteria) this;
        }

        public Criteria andChannelReturnResv3NotBetween(String value1, String value2) {
            addCriterion("CHANNEL_RETURN_RESV3 not between", value1, value2, "channelReturnResv3");
            return (Criteria) this;
        }

        public Criteria andChannelCheckFlagIsNull() {
            addCriterion("CHANNEL_CHECK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andChannelCheckFlagIsNotNull() {
            addCriterion("CHANNEL_CHECK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCheckFlagEqualTo(String value) {
            addCriterion("CHANNEL_CHECK_FLAG =", value, "channelCheckFlag");
            return (Criteria) this;
        }

        public Criteria andChannelCheckFlagNotEqualTo(String value) {
            addCriterion("CHANNEL_CHECK_FLAG <>", value, "channelCheckFlag");
            return (Criteria) this;
        }

        public Criteria andChannelCheckFlagGreaterThan(String value) {
            addCriterion("CHANNEL_CHECK_FLAG >", value, "channelCheckFlag");
            return (Criteria) this;
        }

        public Criteria andChannelCheckFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CHECK_FLAG >=", value, "channelCheckFlag");
            return (Criteria) this;
        }

        public Criteria andChannelCheckFlagLessThan(String value) {
            addCriterion("CHANNEL_CHECK_FLAG <", value, "channelCheckFlag");
            return (Criteria) this;
        }

        public Criteria andChannelCheckFlagLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CHECK_FLAG <=", value, "channelCheckFlag");
            return (Criteria) this;
        }

        public Criteria andChannelCheckFlagLike(String value) {
            addCriterion("CHANNEL_CHECK_FLAG like", value, "channelCheckFlag");
            return (Criteria) this;
        }

        public Criteria andChannelCheckFlagNotLike(String value) {
            addCriterion("CHANNEL_CHECK_FLAG not like", value, "channelCheckFlag");
            return (Criteria) this;
        }

        public Criteria andChannelCheckFlagIn(List<String> values) {
            addCriterion("CHANNEL_CHECK_FLAG in", values, "channelCheckFlag");
            return (Criteria) this;
        }

        public Criteria andChannelCheckFlagNotIn(List<String> values) {
            addCriterion("CHANNEL_CHECK_FLAG not in", values, "channelCheckFlag");
            return (Criteria) this;
        }

        public Criteria andChannelCheckFlagBetween(String value1, String value2) {
            addCriterion("CHANNEL_CHECK_FLAG between", value1, value2, "channelCheckFlag");
            return (Criteria) this;
        }

        public Criteria andChannelCheckFlagNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_CHECK_FLAG not between", value1, value2, "channelCheckFlag");
            return (Criteria) this;
        }

        public Criteria andChannelCheckTimeIsNull() {
            addCriterion("CHANNEL_CHECK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andChannelCheckTimeIsNotNull() {
            addCriterion("CHANNEL_CHECK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCheckTimeEqualTo(String value) {
            addCriterion("CHANNEL_CHECK_TIME =", value, "channelCheckTime");
            return (Criteria) this;
        }

        public Criteria andChannelCheckTimeNotEqualTo(String value) {
            addCriterion("CHANNEL_CHECK_TIME <>", value, "channelCheckTime");
            return (Criteria) this;
        }

        public Criteria andChannelCheckTimeGreaterThan(String value) {
            addCriterion("CHANNEL_CHECK_TIME >", value, "channelCheckTime");
            return (Criteria) this;
        }

        public Criteria andChannelCheckTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CHECK_TIME >=", value, "channelCheckTime");
            return (Criteria) this;
        }

        public Criteria andChannelCheckTimeLessThan(String value) {
            addCriterion("CHANNEL_CHECK_TIME <", value, "channelCheckTime");
            return (Criteria) this;
        }

        public Criteria andChannelCheckTimeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CHECK_TIME <=", value, "channelCheckTime");
            return (Criteria) this;
        }

        public Criteria andChannelCheckTimeLike(String value) {
            addCriterion("CHANNEL_CHECK_TIME like", value, "channelCheckTime");
            return (Criteria) this;
        }

        public Criteria andChannelCheckTimeNotLike(String value) {
            addCriterion("CHANNEL_CHECK_TIME not like", value, "channelCheckTime");
            return (Criteria) this;
        }

        public Criteria andChannelCheckTimeIn(List<String> values) {
            addCriterion("CHANNEL_CHECK_TIME in", values, "channelCheckTime");
            return (Criteria) this;
        }

        public Criteria andChannelCheckTimeNotIn(List<String> values) {
            addCriterion("CHANNEL_CHECK_TIME not in", values, "channelCheckTime");
            return (Criteria) this;
        }

        public Criteria andChannelCheckTimeBetween(String value1, String value2) {
            addCriterion("CHANNEL_CHECK_TIME between", value1, value2, "channelCheckTime");
            return (Criteria) this;
        }

        public Criteria andChannelCheckTimeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_CHECK_TIME not between", value1, value2, "channelCheckTime");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNull() {
            addCriterion("BANK_NO is null");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNotNull() {
            addCriterion("BANK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBankNoEqualTo(String value) {
            addCriterion("BANK_NO =", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotEqualTo(String value) {
            addCriterion("BANK_NO <>", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThan(String value) {
            addCriterion("BANK_NO >", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NO >=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThan(String value) {
            addCriterion("BANK_NO <", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThanOrEqualTo(String value) {
            addCriterion("BANK_NO <=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLike(String value) {
            addCriterion("BANK_NO like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotLike(String value) {
            addCriterion("BANK_NO not like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoIn(List<String> values) {
            addCriterion("BANK_NO in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotIn(List<String> values) {
            addCriterion("BANK_NO not in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoBetween(String value1, String value2) {
            addCriterion("BANK_NO between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotBetween(String value1, String value2) {
            addCriterion("BANK_NO not between", value1, value2, "bankNo");
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

        public Criteria andProvNameIsNull() {
            addCriterion("PROV_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProvNameIsNotNull() {
            addCriterion("PROV_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProvNameEqualTo(String value) {
            addCriterion("PROV_NAME =", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotEqualTo(String value) {
            addCriterion("PROV_NAME <>", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameGreaterThan(String value) {
            addCriterion("PROV_NAME >", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROV_NAME >=", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLessThan(String value) {
            addCriterion("PROV_NAME <", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLessThanOrEqualTo(String value) {
            addCriterion("PROV_NAME <=", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLike(String value) {
            addCriterion("PROV_NAME like", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotLike(String value) {
            addCriterion("PROV_NAME not like", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameIn(List<String> values) {
            addCriterion("PROV_NAME in", values, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotIn(List<String> values) {
            addCriterion("PROV_NAME not in", values, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameBetween(String value1, String value2) {
            addCriterion("PROV_NAME between", value1, value2, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotBetween(String value1, String value2) {
            addCriterion("PROV_NAME not between", value1, value2, "provName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("AREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("AREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("AREA_NAME =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("AREA_NAME <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("AREA_NAME >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_NAME >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("AREA_NAME <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("AREA_NAME <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("AREA_NAME like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("AREA_NAME not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("AREA_NAME in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("AREA_NAME not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("AREA_NAME between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("AREA_NAME not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNull() {
            addCriterion("BRANCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("BRANCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(String value) {
            addCriterion("BRANCH_ID =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(String value) {
            addCriterion("BRANCH_ID <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(String value) {
            addCriterion("BRANCH_ID >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_ID >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(String value) {
            addCriterion("BRANCH_ID <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_ID <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLike(String value) {
            addCriterion("BRANCH_ID like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotLike(String value) {
            addCriterion("BRANCH_ID not like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<String> values) {
            addCriterion("BRANCH_ID in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<String> values) {
            addCriterion("BRANCH_ID not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(String value1, String value2) {
            addCriterion("BRANCH_ID between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(String value1, String value2) {
            addCriterion("BRANCH_ID not between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNull() {
            addCriterion("BRANCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNotNull() {
            addCriterion("BRANCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBranchNameEqualTo(String value) {
            addCriterion("BRANCH_NAME =", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotEqualTo(String value) {
            addCriterion("BRANCH_NAME <>", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThan(String value) {
            addCriterion("BRANCH_NAME >", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_NAME >=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThan(String value) {
            addCriterion("BRANCH_NAME <", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_NAME <=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLike(String value) {
            addCriterion("BRANCH_NAME like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotLike(String value) {
            addCriterion("BRANCH_NAME not like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameIn(List<String> values) {
            addCriterion("BRANCH_NAME in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotIn(List<String> values) {
            addCriterion("BRANCH_NAME not in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameBetween(String value1, String value2) {
            addCriterion("BRANCH_NAME between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotBetween(String value1, String value2) {
            addCriterion("BRANCH_NAME not between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagIsNull() {
            addCriterion("PRIVATE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagIsNotNull() {
            addCriterion("PRIVATE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagEqualTo(String value) {
            addCriterion("PRIVATE_FLAG =", value, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagNotEqualTo(String value) {
            addCriterion("PRIVATE_FLAG <>", value, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagGreaterThan(String value) {
            addCriterion("PRIVATE_FLAG >", value, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PRIVATE_FLAG >=", value, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagLessThan(String value) {
            addCriterion("PRIVATE_FLAG <", value, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagLessThanOrEqualTo(String value) {
            addCriterion("PRIVATE_FLAG <=", value, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagLike(String value) {
            addCriterion("PRIVATE_FLAG like", value, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagNotLike(String value) {
            addCriterion("PRIVATE_FLAG not like", value, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagIn(List<String> values) {
            addCriterion("PRIVATE_FLAG in", values, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagNotIn(List<String> values) {
            addCriterion("PRIVATE_FLAG not in", values, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagBetween(String value1, String value2) {
            addCriterion("PRIVATE_FLAG between", value1, value2, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagNotBetween(String value1, String value2) {
            addCriterion("PRIVATE_FLAG not between", value1, value2, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv1IsNull() {
            addCriterion("OUTCOME_RESV1 is null");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv1IsNotNull() {
            addCriterion("OUTCOME_RESV1 is not null");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv1EqualTo(String value) {
            addCriterion("OUTCOME_RESV1 =", value, "outcomeResv1");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv1NotEqualTo(String value) {
            addCriterion("OUTCOME_RESV1 <>", value, "outcomeResv1");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv1GreaterThan(String value) {
            addCriterion("OUTCOME_RESV1 >", value, "outcomeResv1");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv1GreaterThanOrEqualTo(String value) {
            addCriterion("OUTCOME_RESV1 >=", value, "outcomeResv1");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv1LessThan(String value) {
            addCriterion("OUTCOME_RESV1 <", value, "outcomeResv1");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv1LessThanOrEqualTo(String value) {
            addCriterion("OUTCOME_RESV1 <=", value, "outcomeResv1");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv1Like(String value) {
            addCriterion("OUTCOME_RESV1 like", value, "outcomeResv1");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv1NotLike(String value) {
            addCriterion("OUTCOME_RESV1 not like", value, "outcomeResv1");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv1In(List<String> values) {
            addCriterion("OUTCOME_RESV1 in", values, "outcomeResv1");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv1NotIn(List<String> values) {
            addCriterion("OUTCOME_RESV1 not in", values, "outcomeResv1");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv1Between(String value1, String value2) {
            addCriterion("OUTCOME_RESV1 between", value1, value2, "outcomeResv1");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv1NotBetween(String value1, String value2) {
            addCriterion("OUTCOME_RESV1 not between", value1, value2, "outcomeResv1");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv2IsNull() {
            addCriterion("OUTCOME_RESV2 is null");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv2IsNotNull() {
            addCriterion("OUTCOME_RESV2 is not null");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv2EqualTo(String value) {
            addCriterion("OUTCOME_RESV2 =", value, "outcomeResv2");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv2NotEqualTo(String value) {
            addCriterion("OUTCOME_RESV2 <>", value, "outcomeResv2");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv2GreaterThan(String value) {
            addCriterion("OUTCOME_RESV2 >", value, "outcomeResv2");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv2GreaterThanOrEqualTo(String value) {
            addCriterion("OUTCOME_RESV2 >=", value, "outcomeResv2");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv2LessThan(String value) {
            addCriterion("OUTCOME_RESV2 <", value, "outcomeResv2");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv2LessThanOrEqualTo(String value) {
            addCriterion("OUTCOME_RESV2 <=", value, "outcomeResv2");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv2Like(String value) {
            addCriterion("OUTCOME_RESV2 like", value, "outcomeResv2");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv2NotLike(String value) {
            addCriterion("OUTCOME_RESV2 not like", value, "outcomeResv2");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv2In(List<String> values) {
            addCriterion("OUTCOME_RESV2 in", values, "outcomeResv2");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv2NotIn(List<String> values) {
            addCriterion("OUTCOME_RESV2 not in", values, "outcomeResv2");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv2Between(String value1, String value2) {
            addCriterion("OUTCOME_RESV2 between", value1, value2, "outcomeResv2");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv2NotBetween(String value1, String value2) {
            addCriterion("OUTCOME_RESV2 not between", value1, value2, "outcomeResv2");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv3IsNull() {
            addCriterion("OUTCOME_RESV3 is null");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv3IsNotNull() {
            addCriterion("OUTCOME_RESV3 is not null");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv3EqualTo(String value) {
            addCriterion("OUTCOME_RESV3 =", value, "outcomeResv3");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv3NotEqualTo(String value) {
            addCriterion("OUTCOME_RESV3 <>", value, "outcomeResv3");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv3GreaterThan(String value) {
            addCriterion("OUTCOME_RESV3 >", value, "outcomeResv3");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv3GreaterThanOrEqualTo(String value) {
            addCriterion("OUTCOME_RESV3 >=", value, "outcomeResv3");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv3LessThan(String value) {
            addCriterion("OUTCOME_RESV3 <", value, "outcomeResv3");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv3LessThanOrEqualTo(String value) {
            addCriterion("OUTCOME_RESV3 <=", value, "outcomeResv3");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv3Like(String value) {
            addCriterion("OUTCOME_RESV3 like", value, "outcomeResv3");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv3NotLike(String value) {
            addCriterion("OUTCOME_RESV3 not like", value, "outcomeResv3");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv3In(List<String> values) {
            addCriterion("OUTCOME_RESV3 in", values, "outcomeResv3");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv3NotIn(List<String> values) {
            addCriterion("OUTCOME_RESV3 not in", values, "outcomeResv3");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv3Between(String value1, String value2) {
            addCriterion("OUTCOME_RESV3 between", value1, value2, "outcomeResv3");
            return (Criteria) this;
        }

        public Criteria andOutcomeResv3NotBetween(String value1, String value2) {
            addCriterion("OUTCOME_RESV3 not between", value1, value2, "outcomeResv3");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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