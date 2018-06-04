package com.dcits.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserRoleRefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRoleRefExample() {
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

        public Criteria andRoleSidIsNull() {
            addCriterion("role_sid is null");
            return (Criteria) this;
        }

        public Criteria andRoleSidIsNotNull() {
            addCriterion("role_sid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleSidEqualTo(Integer value) {
            addCriterion("role_sid =", value, "roleSid");
            return (Criteria) this;
        }

        public Criteria andRoleSidNotEqualTo(Integer value) {
            addCriterion("role_sid <>", value, "roleSid");
            return (Criteria) this;
        }

        public Criteria andRoleSidGreaterThan(Integer value) {
            addCriterion("role_sid >", value, "roleSid");
            return (Criteria) this;
        }

        public Criteria andRoleSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_sid >=", value, "roleSid");
            return (Criteria) this;
        }

        public Criteria andRoleSidLessThan(Integer value) {
            addCriterion("role_sid <", value, "roleSid");
            return (Criteria) this;
        }

        public Criteria andRoleSidLessThanOrEqualTo(Integer value) {
            addCriterion("role_sid <=", value, "roleSid");
            return (Criteria) this;
        }

        public Criteria andRoleSidIn(List<Integer> values) {
            addCriterion("role_sid in", values, "roleSid");
            return (Criteria) this;
        }

        public Criteria andRoleSidNotIn(List<Integer> values) {
            addCriterion("role_sid not in", values, "roleSid");
            return (Criteria) this;
        }

        public Criteria andRoleSidBetween(Integer value1, Integer value2) {
            addCriterion("role_sid between", value1, value2, "roleSid");
            return (Criteria) this;
        }

        public Criteria andRoleSidNotBetween(Integer value1, Integer value2) {
            addCriterion("role_sid not between", value1, value2, "roleSid");
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