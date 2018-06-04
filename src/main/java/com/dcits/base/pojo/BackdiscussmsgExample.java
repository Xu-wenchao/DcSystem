package com.dcits.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class BackdiscussmsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BackdiscussmsgExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andUserSidIsNull() {
            addCriterion("user_sid is null");
            return (Criteria) this;
        }

        public Criteria andUserSidIsNotNull() {
            addCriterion("user_sid is not null");
            return (Criteria) this;
        }

        public Criteria andUserSidEqualTo(Integer value) {
            addCriterion("user_sid =", value, "userSid");
            return (Criteria) this;
        }

        public Criteria andUserSidNotEqualTo(Integer value) {
            addCriterion("user_sid <>", value, "userSid");
            return (Criteria) this;
        }

        public Criteria andUserSidGreaterThan(Integer value) {
            addCriterion("user_sid >", value, "userSid");
            return (Criteria) this;
        }

        public Criteria andUserSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_sid >=", value, "userSid");
            return (Criteria) this;
        }

        public Criteria andUserSidLessThan(Integer value) {
            addCriterion("user_sid <", value, "userSid");
            return (Criteria) this;
        }

        public Criteria andUserSidLessThanOrEqualTo(Integer value) {
            addCriterion("user_sid <=", value, "userSid");
            return (Criteria) this;
        }

        public Criteria andUserSidIn(List<Integer> values) {
            addCriterion("user_sid in", values, "userSid");
            return (Criteria) this;
        }

        public Criteria andUserSidNotIn(List<Integer> values) {
            addCriterion("user_sid not in", values, "userSid");
            return (Criteria) this;
        }

        public Criteria andUserSidBetween(Integer value1, Integer value2) {
            addCriterion("user_sid between", value1, value2, "userSid");
            return (Criteria) this;
        }

        public Criteria andUserSidNotBetween(Integer value1, Integer value2) {
            addCriterion("user_sid not between", value1, value2, "userSid");
            return (Criteria) this;
        }

        public Criteria andPdmSidIsNull() {
            addCriterion("pdm_sid is null");
            return (Criteria) this;
        }

        public Criteria andPdmSidIsNotNull() {
            addCriterion("pdm_sid is not null");
            return (Criteria) this;
        }

        public Criteria andPdmSidEqualTo(Integer value) {
            addCriterion("pdm_sid =", value, "pdmSid");
            return (Criteria) this;
        }

        public Criteria andPdmSidNotEqualTo(Integer value) {
            addCriterion("pdm_sid <>", value, "pdmSid");
            return (Criteria) this;
        }

        public Criteria andPdmSidGreaterThan(Integer value) {
            addCriterion("pdm_sid >", value, "pdmSid");
            return (Criteria) this;
        }

        public Criteria andPdmSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pdm_sid >=", value, "pdmSid");
            return (Criteria) this;
        }

        public Criteria andPdmSidLessThan(Integer value) {
            addCriterion("pdm_sid <", value, "pdmSid");
            return (Criteria) this;
        }

        public Criteria andPdmSidLessThanOrEqualTo(Integer value) {
            addCriterion("pdm_sid <=", value, "pdmSid");
            return (Criteria) this;
        }

        public Criteria andPdmSidIn(List<Integer> values) {
            addCriterion("pdm_sid in", values, "pdmSid");
            return (Criteria) this;
        }

        public Criteria andPdmSidNotIn(List<Integer> values) {
            addCriterion("pdm_sid not in", values, "pdmSid");
            return (Criteria) this;
        }

        public Criteria andPdmSidBetween(Integer value1, Integer value2) {
            addCriterion("pdm_sid between", value1, value2, "pdmSid");
            return (Criteria) this;
        }

        public Criteria andPdmSidNotBetween(Integer value1, Integer value2) {
            addCriterion("pdm_sid not between", value1, value2, "pdmSid");
            return (Criteria) this;
        }

        public Criteria andPreSalesSummarizeIsNull() {
            addCriterion("pre_sales_summarize is null");
            return (Criteria) this;
        }

        public Criteria andPreSalesSummarizeIsNotNull() {
            addCriterion("pre_sales_summarize is not null");
            return (Criteria) this;
        }

        public Criteria andPreSalesSummarizeEqualTo(String value) {
            addCriterion("pre_sales_summarize =", value, "preSalesSummarize");
            return (Criteria) this;
        }

        public Criteria andPreSalesSummarizeNotEqualTo(String value) {
            addCriterion("pre_sales_summarize <>", value, "preSalesSummarize");
            return (Criteria) this;
        }

        public Criteria andPreSalesSummarizeGreaterThan(String value) {
            addCriterion("pre_sales_summarize >", value, "preSalesSummarize");
            return (Criteria) this;
        }

        public Criteria andPreSalesSummarizeGreaterThanOrEqualTo(String value) {
            addCriterion("pre_sales_summarize >=", value, "preSalesSummarize");
            return (Criteria) this;
        }

        public Criteria andPreSalesSummarizeLessThan(String value) {
            addCriterion("pre_sales_summarize <", value, "preSalesSummarize");
            return (Criteria) this;
        }

        public Criteria andPreSalesSummarizeLessThanOrEqualTo(String value) {
            addCriterion("pre_sales_summarize <=", value, "preSalesSummarize");
            return (Criteria) this;
        }

        public Criteria andPreSalesSummarizeLike(String value) {
            addCriterion("pre_sales_summarize like", value, "preSalesSummarize");
            return (Criteria) this;
        }

        public Criteria andPreSalesSummarizeNotLike(String value) {
            addCriterion("pre_sales_summarize not like", value, "preSalesSummarize");
            return (Criteria) this;
        }

        public Criteria andPreSalesSummarizeIn(List<String> values) {
            addCriterion("pre_sales_summarize in", values, "preSalesSummarize");
            return (Criteria) this;
        }

        public Criteria andPreSalesSummarizeNotIn(List<String> values) {
            addCriterion("pre_sales_summarize not in", values, "preSalesSummarize");
            return (Criteria) this;
        }

        public Criteria andPreSalesSummarizeBetween(String value1, String value2) {
            addCriterion("pre_sales_summarize between", value1, value2, "preSalesSummarize");
            return (Criteria) this;
        }

        public Criteria andPreSalesSummarizeNotBetween(String value1, String value2) {
            addCriterion("pre_sales_summarize not between", value1, value2, "preSalesSummarize");
            return (Criteria) this;
        }

        public Criteria andClientBackSummarizeIsNull() {
            addCriterion("client_back_summarize is null");
            return (Criteria) this;
        }

        public Criteria andClientBackSummarizeIsNotNull() {
            addCriterion("client_back_summarize is not null");
            return (Criteria) this;
        }

        public Criteria andClientBackSummarizeEqualTo(String value) {
            addCriterion("client_back_summarize =", value, "clientBackSummarize");
            return (Criteria) this;
        }

        public Criteria andClientBackSummarizeNotEqualTo(String value) {
            addCriterion("client_back_summarize <>", value, "clientBackSummarize");
            return (Criteria) this;
        }

        public Criteria andClientBackSummarizeGreaterThan(String value) {
            addCriterion("client_back_summarize >", value, "clientBackSummarize");
            return (Criteria) this;
        }

        public Criteria andClientBackSummarizeGreaterThanOrEqualTo(String value) {
            addCriterion("client_back_summarize >=", value, "clientBackSummarize");
            return (Criteria) this;
        }

        public Criteria andClientBackSummarizeLessThan(String value) {
            addCriterion("client_back_summarize <", value, "clientBackSummarize");
            return (Criteria) this;
        }

        public Criteria andClientBackSummarizeLessThanOrEqualTo(String value) {
            addCriterion("client_back_summarize <=", value, "clientBackSummarize");
            return (Criteria) this;
        }

        public Criteria andClientBackSummarizeLike(String value) {
            addCriterion("client_back_summarize like", value, "clientBackSummarize");
            return (Criteria) this;
        }

        public Criteria andClientBackSummarizeNotLike(String value) {
            addCriterion("client_back_summarize not like", value, "clientBackSummarize");
            return (Criteria) this;
        }

        public Criteria andClientBackSummarizeIn(List<String> values) {
            addCriterion("client_back_summarize in", values, "clientBackSummarize");
            return (Criteria) this;
        }

        public Criteria andClientBackSummarizeNotIn(List<String> values) {
            addCriterion("client_back_summarize not in", values, "clientBackSummarize");
            return (Criteria) this;
        }

        public Criteria andClientBackSummarizeBetween(String value1, String value2) {
            addCriterion("client_back_summarize between", value1, value2, "clientBackSummarize");
            return (Criteria) this;
        }

        public Criteria andClientBackSummarizeNotBetween(String value1, String value2) {
            addCriterion("client_back_summarize not between", value1, value2, "clientBackSummarize");
            return (Criteria) this;
        }

        public Criteria andPreSalesCommentIsNull() {
            addCriterion("pre_sales_comment is null");
            return (Criteria) this;
        }

        public Criteria andPreSalesCommentIsNotNull() {
            addCriterion("pre_sales_comment is not null");
            return (Criteria) this;
        }

        public Criteria andPreSalesCommentEqualTo(String value) {
            addCriterion("pre_sales_comment =", value, "preSalesComment");
            return (Criteria) this;
        }

        public Criteria andPreSalesCommentNotEqualTo(String value) {
            addCriterion("pre_sales_comment <>", value, "preSalesComment");
            return (Criteria) this;
        }

        public Criteria andPreSalesCommentGreaterThan(String value) {
            addCriterion("pre_sales_comment >", value, "preSalesComment");
            return (Criteria) this;
        }

        public Criteria andPreSalesCommentGreaterThanOrEqualTo(String value) {
            addCriterion("pre_sales_comment >=", value, "preSalesComment");
            return (Criteria) this;
        }

        public Criteria andPreSalesCommentLessThan(String value) {
            addCriterion("pre_sales_comment <", value, "preSalesComment");
            return (Criteria) this;
        }

        public Criteria andPreSalesCommentLessThanOrEqualTo(String value) {
            addCriterion("pre_sales_comment <=", value, "preSalesComment");
            return (Criteria) this;
        }

        public Criteria andPreSalesCommentLike(String value) {
            addCriterion("pre_sales_comment like", value, "preSalesComment");
            return (Criteria) this;
        }

        public Criteria andPreSalesCommentNotLike(String value) {
            addCriterion("pre_sales_comment not like", value, "preSalesComment");
            return (Criteria) this;
        }

        public Criteria andPreSalesCommentIn(List<String> values) {
            addCriterion("pre_sales_comment in", values, "preSalesComment");
            return (Criteria) this;
        }

        public Criteria andPreSalesCommentNotIn(List<String> values) {
            addCriterion("pre_sales_comment not in", values, "preSalesComment");
            return (Criteria) this;
        }

        public Criteria andPreSalesCommentBetween(String value1, String value2) {
            addCriterion("pre_sales_comment between", value1, value2, "preSalesComment");
            return (Criteria) this;
        }

        public Criteria andPreSalesCommentNotBetween(String value1, String value2) {
            addCriterion("pre_sales_comment not between", value1, value2, "preSalesComment");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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