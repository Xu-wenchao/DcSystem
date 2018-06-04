package com.dcits.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class KeycodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KeycodeExample() {
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

        public Criteria andFtypeIsNull() {
            addCriterion("ftype is null");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNotNull() {
            addCriterion("ftype is not null");
            return (Criteria) this;
        }

        public Criteria andFtypeEqualTo(String value) {
            addCriterion("ftype =", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotEqualTo(String value) {
            addCriterion("ftype <>", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThan(String value) {
            addCriterion("ftype >", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ftype >=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThan(String value) {
            addCriterion("ftype <", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThanOrEqualTo(String value) {
            addCriterion("ftype <=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLike(String value) {
            addCriterion("ftype like", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotLike(String value) {
            addCriterion("ftype not like", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeIn(List<String> values) {
            addCriterion("ftype in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotIn(List<String> values) {
            addCriterion("ftype not in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeBetween(String value1, String value2) {
            addCriterion("ftype between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotBetween(String value1, String value2) {
            addCriterion("ftype not between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andFvalueIsNull() {
            addCriterion("fvalue is null");
            return (Criteria) this;
        }

        public Criteria andFvalueIsNotNull() {
            addCriterion("fvalue is not null");
            return (Criteria) this;
        }

        public Criteria andFvalueEqualTo(String value) {
            addCriterion("fvalue =", value, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueNotEqualTo(String value) {
            addCriterion("fvalue <>", value, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueGreaterThan(String value) {
            addCriterion("fvalue >", value, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueGreaterThanOrEqualTo(String value) {
            addCriterion("fvalue >=", value, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueLessThan(String value) {
            addCriterion("fvalue <", value, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueLessThanOrEqualTo(String value) {
            addCriterion("fvalue <=", value, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueLike(String value) {
            addCriterion("fvalue like", value, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueNotLike(String value) {
            addCriterion("fvalue not like", value, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueIn(List<String> values) {
            addCriterion("fvalue in", values, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueNotIn(List<String> values) {
            addCriterion("fvalue not in", values, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueBetween(String value1, String value2) {
            addCriterion("fvalue between", value1, value2, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueNotBetween(String value1, String value2) {
            addCriterion("fvalue not between", value1, value2, "fvalue");
            return (Criteria) this;
        }

        public Criteria andPSidIsNull() {
            addCriterion("p_sid is null");
            return (Criteria) this;
        }

        public Criteria andPSidIsNotNull() {
            addCriterion("p_sid is not null");
            return (Criteria) this;
        }

        public Criteria andPSidEqualTo(Integer value) {
            addCriterion("p_sid =", value, "pSid");
            return (Criteria) this;
        }

        public Criteria andPSidNotEqualTo(Integer value) {
            addCriterion("p_sid <>", value, "pSid");
            return (Criteria) this;
        }

        public Criteria andPSidGreaterThan(Integer value) {
            addCriterion("p_sid >", value, "pSid");
            return (Criteria) this;
        }

        public Criteria andPSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_sid >=", value, "pSid");
            return (Criteria) this;
        }

        public Criteria andPSidLessThan(Integer value) {
            addCriterion("p_sid <", value, "pSid");
            return (Criteria) this;
        }

        public Criteria andPSidLessThanOrEqualTo(Integer value) {
            addCriterion("p_sid <=", value, "pSid");
            return (Criteria) this;
        }

        public Criteria andPSidIn(List<Integer> values) {
            addCriterion("p_sid in", values, "pSid");
            return (Criteria) this;
        }

        public Criteria andPSidNotIn(List<Integer> values) {
            addCriterion("p_sid not in", values, "pSid");
            return (Criteria) this;
        }

        public Criteria andPSidBetween(Integer value1, Integer value2) {
            addCriterion("p_sid between", value1, value2, "pSid");
            return (Criteria) this;
        }

        public Criteria andPSidNotBetween(Integer value1, Integer value2) {
            addCriterion("p_sid not between", value1, value2, "pSid");
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