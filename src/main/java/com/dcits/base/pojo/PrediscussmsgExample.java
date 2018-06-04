package com.dcits.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrediscussmsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrediscussmsgExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andProposerIsNull() {
            addCriterion("proposer is null");
            return (Criteria) this;
        }

        public Criteria andProposerIsNotNull() {
            addCriterion("proposer is not null");
            return (Criteria) this;
        }

        public Criteria andProposerEqualTo(String value) {
            addCriterion("proposer =", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotEqualTo(String value) {
            addCriterion("proposer <>", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThan(String value) {
            addCriterion("proposer >", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThanOrEqualTo(String value) {
            addCriterion("proposer >=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThan(String value) {
            addCriterion("proposer <", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThanOrEqualTo(String value) {
            addCriterion("proposer <=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLike(String value) {
            addCriterion("proposer like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotLike(String value) {
            addCriterion("proposer not like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerIn(List<String> values) {
            addCriterion("proposer in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotIn(List<String> values) {
            addCriterion("proposer not in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerBetween(String value1, String value2) {
            addCriterion("proposer between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotBetween(String value1, String value2) {
            addCriterion("proposer not between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andPreSalesTypeIsNull() {
            addCriterion("pre_sales_type is null");
            return (Criteria) this;
        }

        public Criteria andPreSalesTypeIsNotNull() {
            addCriterion("pre_sales_type is not null");
            return (Criteria) this;
        }

        public Criteria andPreSalesTypeEqualTo(String value) {
            addCriterion("pre_sales_type =", value, "preSalesType");
            return (Criteria) this;
        }

        public Criteria andPreSalesTypeNotEqualTo(String value) {
            addCriterion("pre_sales_type <>", value, "preSalesType");
            return (Criteria) this;
        }

        public Criteria andPreSalesTypeGreaterThan(String value) {
            addCriterion("pre_sales_type >", value, "preSalesType");
            return (Criteria) this;
        }

        public Criteria andPreSalesTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pre_sales_type >=", value, "preSalesType");
            return (Criteria) this;
        }

        public Criteria andPreSalesTypeLessThan(String value) {
            addCriterion("pre_sales_type <", value, "preSalesType");
            return (Criteria) this;
        }

        public Criteria andPreSalesTypeLessThanOrEqualTo(String value) {
            addCriterion("pre_sales_type <=", value, "preSalesType");
            return (Criteria) this;
        }

        public Criteria andPreSalesTypeLike(String value) {
            addCriterion("pre_sales_type like", value, "preSalesType");
            return (Criteria) this;
        }

        public Criteria andPreSalesTypeNotLike(String value) {
            addCriterion("pre_sales_type not like", value, "preSalesType");
            return (Criteria) this;
        }

        public Criteria andPreSalesTypeIn(List<String> values) {
            addCriterion("pre_sales_type in", values, "preSalesType");
            return (Criteria) this;
        }

        public Criteria andPreSalesTypeNotIn(List<String> values) {
            addCriterion("pre_sales_type not in", values, "preSalesType");
            return (Criteria) this;
        }

        public Criteria andPreSalesTypeBetween(String value1, String value2) {
            addCriterion("pre_sales_type between", value1, value2, "preSalesType");
            return (Criteria) this;
        }

        public Criteria andPreSalesTypeNotBetween(String value1, String value2) {
            addCriterion("pre_sales_type not between", value1, value2, "preSalesType");
            return (Criteria) this;
        }

        public Criteria andApplicationDateIsNull() {
            addCriterion("application_date is null");
            return (Criteria) this;
        }

        public Criteria andApplicationDateIsNotNull() {
            addCriterion("application_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationDateEqualTo(Date value) {
            addCriterion("application_date =", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotEqualTo(Date value) {
            addCriterion("application_date <>", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateGreaterThan(Date value) {
            addCriterion("application_date >", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("application_date >=", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateLessThan(Date value) {
            addCriterion("application_date <", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateLessThanOrEqualTo(Date value) {
            addCriterion("application_date <=", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateIn(List<Date> values) {
            addCriterion("application_date in", values, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotIn(List<Date> values) {
            addCriterion("application_date not in", values, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateBetween(Date value1, Date value2) {
            addCriterion("application_date between", value1, value2, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotBetween(Date value1, Date value2) {
            addCriterion("application_date not between", value1, value2, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andProposerDepartmentIsNull() {
            addCriterion("proposer_department is null");
            return (Criteria) this;
        }

        public Criteria andProposerDepartmentIsNotNull() {
            addCriterion("proposer_department is not null");
            return (Criteria) this;
        }

        public Criteria andProposerDepartmentEqualTo(String value) {
            addCriterion("proposer_department =", value, "proposerDepartment");
            return (Criteria) this;
        }

        public Criteria andProposerDepartmentNotEqualTo(String value) {
            addCriterion("proposer_department <>", value, "proposerDepartment");
            return (Criteria) this;
        }

        public Criteria andProposerDepartmentGreaterThan(String value) {
            addCriterion("proposer_department >", value, "proposerDepartment");
            return (Criteria) this;
        }

        public Criteria andProposerDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("proposer_department >=", value, "proposerDepartment");
            return (Criteria) this;
        }

        public Criteria andProposerDepartmentLessThan(String value) {
            addCriterion("proposer_department <", value, "proposerDepartment");
            return (Criteria) this;
        }

        public Criteria andProposerDepartmentLessThanOrEqualTo(String value) {
            addCriterion("proposer_department <=", value, "proposerDepartment");
            return (Criteria) this;
        }

        public Criteria andProposerDepartmentLike(String value) {
            addCriterion("proposer_department like", value, "proposerDepartment");
            return (Criteria) this;
        }

        public Criteria andProposerDepartmentNotLike(String value) {
            addCriterion("proposer_department not like", value, "proposerDepartment");
            return (Criteria) this;
        }

        public Criteria andProposerDepartmentIn(List<String> values) {
            addCriterion("proposer_department in", values, "proposerDepartment");
            return (Criteria) this;
        }

        public Criteria andProposerDepartmentNotIn(List<String> values) {
            addCriterion("proposer_department not in", values, "proposerDepartment");
            return (Criteria) this;
        }

        public Criteria andProposerDepartmentBetween(String value1, String value2) {
            addCriterion("proposer_department between", value1, value2, "proposerDepartment");
            return (Criteria) this;
        }

        public Criteria andProposerDepartmentNotBetween(String value1, String value2) {
            addCriterion("proposer_department not between", value1, value2, "proposerDepartment");
            return (Criteria) this;
        }

        public Criteria andAimUnitIsNull() {
            addCriterion("aim_unit is null");
            return (Criteria) this;
        }

        public Criteria andAimUnitIsNotNull() {
            addCriterion("aim_unit is not null");
            return (Criteria) this;
        }

        public Criteria andAimUnitEqualTo(String value) {
            addCriterion("aim_unit =", value, "aimUnit");
            return (Criteria) this;
        }

        public Criteria andAimUnitNotEqualTo(String value) {
            addCriterion("aim_unit <>", value, "aimUnit");
            return (Criteria) this;
        }

        public Criteria andAimUnitGreaterThan(String value) {
            addCriterion("aim_unit >", value, "aimUnit");
            return (Criteria) this;
        }

        public Criteria andAimUnitGreaterThanOrEqualTo(String value) {
            addCriterion("aim_unit >=", value, "aimUnit");
            return (Criteria) this;
        }

        public Criteria andAimUnitLessThan(String value) {
            addCriterion("aim_unit <", value, "aimUnit");
            return (Criteria) this;
        }

        public Criteria andAimUnitLessThanOrEqualTo(String value) {
            addCriterion("aim_unit <=", value, "aimUnit");
            return (Criteria) this;
        }

        public Criteria andAimUnitLike(String value) {
            addCriterion("aim_unit like", value, "aimUnit");
            return (Criteria) this;
        }

        public Criteria andAimUnitNotLike(String value) {
            addCriterion("aim_unit not like", value, "aimUnit");
            return (Criteria) this;
        }

        public Criteria andAimUnitIn(List<String> values) {
            addCriterion("aim_unit in", values, "aimUnit");
            return (Criteria) this;
        }

        public Criteria andAimUnitNotIn(List<String> values) {
            addCriterion("aim_unit not in", values, "aimUnit");
            return (Criteria) this;
        }

        public Criteria andAimUnitBetween(String value1, String value2) {
            addCriterion("aim_unit between", value1, value2, "aimUnit");
            return (Criteria) this;
        }

        public Criteria andAimUnitNotBetween(String value1, String value2) {
            addCriterion("aim_unit not between", value1, value2, "aimUnit");
            return (Criteria) this;
        }

        public Criteria andAimDepartmentIsNull() {
            addCriterion("aim_department is null");
            return (Criteria) this;
        }

        public Criteria andAimDepartmentIsNotNull() {
            addCriterion("aim_department is not null");
            return (Criteria) this;
        }

        public Criteria andAimDepartmentEqualTo(String value) {
            addCriterion("aim_department =", value, "aimDepartment");
            return (Criteria) this;
        }

        public Criteria andAimDepartmentNotEqualTo(String value) {
            addCriterion("aim_department <>", value, "aimDepartment");
            return (Criteria) this;
        }

        public Criteria andAimDepartmentGreaterThan(String value) {
            addCriterion("aim_department >", value, "aimDepartment");
            return (Criteria) this;
        }

        public Criteria andAimDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("aim_department >=", value, "aimDepartment");
            return (Criteria) this;
        }

        public Criteria andAimDepartmentLessThan(String value) {
            addCriterion("aim_department <", value, "aimDepartment");
            return (Criteria) this;
        }

        public Criteria andAimDepartmentLessThanOrEqualTo(String value) {
            addCriterion("aim_department <=", value, "aimDepartment");
            return (Criteria) this;
        }

        public Criteria andAimDepartmentLike(String value) {
            addCriterion("aim_department like", value, "aimDepartment");
            return (Criteria) this;
        }

        public Criteria andAimDepartmentNotLike(String value) {
            addCriterion("aim_department not like", value, "aimDepartment");
            return (Criteria) this;
        }

        public Criteria andAimDepartmentIn(List<String> values) {
            addCriterion("aim_department in", values, "aimDepartment");
            return (Criteria) this;
        }

        public Criteria andAimDepartmentNotIn(List<String> values) {
            addCriterion("aim_department not in", values, "aimDepartment");
            return (Criteria) this;
        }

        public Criteria andAimDepartmentBetween(String value1, String value2) {
            addCriterion("aim_department between", value1, value2, "aimDepartment");
            return (Criteria) this;
        }

        public Criteria andAimDepartmentNotBetween(String value1, String value2) {
            addCriterion("aim_department not between", value1, value2, "aimDepartment");
            return (Criteria) this;
        }

        public Criteria andAimLocationIsNull() {
            addCriterion("aim_location is null");
            return (Criteria) this;
        }

        public Criteria andAimLocationIsNotNull() {
            addCriterion("aim_location is not null");
            return (Criteria) this;
        }

        public Criteria andAimLocationEqualTo(String value) {
            addCriterion("aim_location =", value, "aimLocation");
            return (Criteria) this;
        }

        public Criteria andAimLocationNotEqualTo(String value) {
            addCriterion("aim_location <>", value, "aimLocation");
            return (Criteria) this;
        }

        public Criteria andAimLocationGreaterThan(String value) {
            addCriterion("aim_location >", value, "aimLocation");
            return (Criteria) this;
        }

        public Criteria andAimLocationGreaterThanOrEqualTo(String value) {
            addCriterion("aim_location >=", value, "aimLocation");
            return (Criteria) this;
        }

        public Criteria andAimLocationLessThan(String value) {
            addCriterion("aim_location <", value, "aimLocation");
            return (Criteria) this;
        }

        public Criteria andAimLocationLessThanOrEqualTo(String value) {
            addCriterion("aim_location <=", value, "aimLocation");
            return (Criteria) this;
        }

        public Criteria andAimLocationLike(String value) {
            addCriterion("aim_location like", value, "aimLocation");
            return (Criteria) this;
        }

        public Criteria andAimLocationNotLike(String value) {
            addCriterion("aim_location not like", value, "aimLocation");
            return (Criteria) this;
        }

        public Criteria andAimLocationIn(List<String> values) {
            addCriterion("aim_location in", values, "aimLocation");
            return (Criteria) this;
        }

        public Criteria andAimLocationNotIn(List<String> values) {
            addCriterion("aim_location not in", values, "aimLocation");
            return (Criteria) this;
        }

        public Criteria andAimLocationBetween(String value1, String value2) {
            addCriterion("aim_location between", value1, value2, "aimLocation");
            return (Criteria) this;
        }

        public Criteria andAimLocationNotBetween(String value1, String value2) {
            addCriterion("aim_location not between", value1, value2, "aimLocation");
            return (Criteria) this;
        }

        public Criteria andAimTimeIsNull() {
            addCriterion("aim_time is null");
            return (Criteria) this;
        }

        public Criteria andAimTimeIsNotNull() {
            addCriterion("aim_time is not null");
            return (Criteria) this;
        }

        public Criteria andAimTimeEqualTo(String value) {
            addCriterion("aim_time =", value, "aimTime");
            return (Criteria) this;
        }

        public Criteria andAimTimeNotEqualTo(String value) {
            addCriterion("aim_time <>", value, "aimTime");
            return (Criteria) this;
        }

        public Criteria andAimTimeGreaterThan(String value) {
            addCriterion("aim_time >", value, "aimTime");
            return (Criteria) this;
        }

        public Criteria andAimTimeGreaterThanOrEqualTo(String value) {
            addCriterion("aim_time >=", value, "aimTime");
            return (Criteria) this;
        }

        public Criteria andAimTimeLessThan(String value) {
            addCriterion("aim_time <", value, "aimTime");
            return (Criteria) this;
        }

        public Criteria andAimTimeLessThanOrEqualTo(String value) {
            addCriterion("aim_time <=", value, "aimTime");
            return (Criteria) this;
        }

        public Criteria andAimTimeLike(String value) {
            addCriterion("aim_time like", value, "aimTime");
            return (Criteria) this;
        }

        public Criteria andAimTimeNotLike(String value) {
            addCriterion("aim_time not like", value, "aimTime");
            return (Criteria) this;
        }

        public Criteria andAimTimeIn(List<String> values) {
            addCriterion("aim_time in", values, "aimTime");
            return (Criteria) this;
        }

        public Criteria andAimTimeNotIn(List<String> values) {
            addCriterion("aim_time not in", values, "aimTime");
            return (Criteria) this;
        }

        public Criteria andAimTimeBetween(String value1, String value2) {
            addCriterion("aim_time between", value1, value2, "aimTime");
            return (Criteria) this;
        }

        public Criteria andAimTimeNotBetween(String value1, String value2) {
            addCriterion("aim_time not between", value1, value2, "aimTime");
            return (Criteria) this;
        }

        public Criteria andClientInterfaceIsNull() {
            addCriterion("client_interface is null");
            return (Criteria) this;
        }

        public Criteria andClientInterfaceIsNotNull() {
            addCriterion("client_interface is not null");
            return (Criteria) this;
        }

        public Criteria andClientInterfaceEqualTo(String value) {
            addCriterion("client_interface =", value, "clientInterface");
            return (Criteria) this;
        }

        public Criteria andClientInterfaceNotEqualTo(String value) {
            addCriterion("client_interface <>", value, "clientInterface");
            return (Criteria) this;
        }

        public Criteria andClientInterfaceGreaterThan(String value) {
            addCriterion("client_interface >", value, "clientInterface");
            return (Criteria) this;
        }

        public Criteria andClientInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("client_interface >=", value, "clientInterface");
            return (Criteria) this;
        }

        public Criteria andClientInterfaceLessThan(String value) {
            addCriterion("client_interface <", value, "clientInterface");
            return (Criteria) this;
        }

        public Criteria andClientInterfaceLessThanOrEqualTo(String value) {
            addCriterion("client_interface <=", value, "clientInterface");
            return (Criteria) this;
        }

        public Criteria andClientInterfaceLike(String value) {
            addCriterion("client_interface like", value, "clientInterface");
            return (Criteria) this;
        }

        public Criteria andClientInterfaceNotLike(String value) {
            addCriterion("client_interface not like", value, "clientInterface");
            return (Criteria) this;
        }

        public Criteria andClientInterfaceIn(List<String> values) {
            addCriterion("client_interface in", values, "clientInterface");
            return (Criteria) this;
        }

        public Criteria andClientInterfaceNotIn(List<String> values) {
            addCriterion("client_interface not in", values, "clientInterface");
            return (Criteria) this;
        }

        public Criteria andClientInterfaceBetween(String value1, String value2) {
            addCriterion("client_interface between", value1, value2, "clientInterface");
            return (Criteria) this;
        }

        public Criteria andClientInterfaceNotBetween(String value1, String value2) {
            addCriterion("client_interface not between", value1, value2, "clientInterface");
            return (Criteria) this;
        }

        public Criteria andClientDutyIsNull() {
            addCriterion("client_duty is null");
            return (Criteria) this;
        }

        public Criteria andClientDutyIsNotNull() {
            addCriterion("client_duty is not null");
            return (Criteria) this;
        }

        public Criteria andClientDutyEqualTo(String value) {
            addCriterion("client_duty =", value, "clientDuty");
            return (Criteria) this;
        }

        public Criteria andClientDutyNotEqualTo(String value) {
            addCriterion("client_duty <>", value, "clientDuty");
            return (Criteria) this;
        }

        public Criteria andClientDutyGreaterThan(String value) {
            addCriterion("client_duty >", value, "clientDuty");
            return (Criteria) this;
        }

        public Criteria andClientDutyGreaterThanOrEqualTo(String value) {
            addCriterion("client_duty >=", value, "clientDuty");
            return (Criteria) this;
        }

        public Criteria andClientDutyLessThan(String value) {
            addCriterion("client_duty <", value, "clientDuty");
            return (Criteria) this;
        }

        public Criteria andClientDutyLessThanOrEqualTo(String value) {
            addCriterion("client_duty <=", value, "clientDuty");
            return (Criteria) this;
        }

        public Criteria andClientDutyLike(String value) {
            addCriterion("client_duty like", value, "clientDuty");
            return (Criteria) this;
        }

        public Criteria andClientDutyNotLike(String value) {
            addCriterion("client_duty not like", value, "clientDuty");
            return (Criteria) this;
        }

        public Criteria andClientDutyIn(List<String> values) {
            addCriterion("client_duty in", values, "clientDuty");
            return (Criteria) this;
        }

        public Criteria andClientDutyNotIn(List<String> values) {
            addCriterion("client_duty not in", values, "clientDuty");
            return (Criteria) this;
        }

        public Criteria andClientDutyBetween(String value1, String value2) {
            addCriterion("client_duty between", value1, value2, "clientDuty");
            return (Criteria) this;
        }

        public Criteria andClientDutyNotBetween(String value1, String value2) {
            addCriterion("client_duty not between", value1, value2, "clientDuty");
            return (Criteria) this;
        }

        public Criteria andClientBackIsNull() {
            addCriterion("client_back is null");
            return (Criteria) this;
        }

        public Criteria andClientBackIsNotNull() {
            addCriterion("client_back is not null");
            return (Criteria) this;
        }

        public Criteria andClientBackEqualTo(String value) {
            addCriterion("client_back =", value, "clientBack");
            return (Criteria) this;
        }

        public Criteria andClientBackNotEqualTo(String value) {
            addCriterion("client_back <>", value, "clientBack");
            return (Criteria) this;
        }

        public Criteria andClientBackGreaterThan(String value) {
            addCriterion("client_back >", value, "clientBack");
            return (Criteria) this;
        }

        public Criteria andClientBackGreaterThanOrEqualTo(String value) {
            addCriterion("client_back >=", value, "clientBack");
            return (Criteria) this;
        }

        public Criteria andClientBackLessThan(String value) {
            addCriterion("client_back <", value, "clientBack");
            return (Criteria) this;
        }

        public Criteria andClientBackLessThanOrEqualTo(String value) {
            addCriterion("client_back <=", value, "clientBack");
            return (Criteria) this;
        }

        public Criteria andClientBackLike(String value) {
            addCriterion("client_back like", value, "clientBack");
            return (Criteria) this;
        }

        public Criteria andClientBackNotLike(String value) {
            addCriterion("client_back not like", value, "clientBack");
            return (Criteria) this;
        }

        public Criteria andClientBackIn(List<String> values) {
            addCriterion("client_back in", values, "clientBack");
            return (Criteria) this;
        }

        public Criteria andClientBackNotIn(List<String> values) {
            addCriterion("client_back not in", values, "clientBack");
            return (Criteria) this;
        }

        public Criteria andClientBackBetween(String value1, String value2) {
            addCriterion("client_back between", value1, value2, "clientBack");
            return (Criteria) this;
        }

        public Criteria andClientBackNotBetween(String value1, String value2) {
            addCriterion("client_back not between", value1, value2, "clientBack");
            return (Criteria) this;
        }

        public Criteria andAimPurposeIsNull() {
            addCriterion("aim_purpose is null");
            return (Criteria) this;
        }

        public Criteria andAimPurposeIsNotNull() {
            addCriterion("aim_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andAimPurposeEqualTo(String value) {
            addCriterion("aim_purpose =", value, "aimPurpose");
            return (Criteria) this;
        }

        public Criteria andAimPurposeNotEqualTo(String value) {
            addCriterion("aim_purpose <>", value, "aimPurpose");
            return (Criteria) this;
        }

        public Criteria andAimPurposeGreaterThan(String value) {
            addCriterion("aim_purpose >", value, "aimPurpose");
            return (Criteria) this;
        }

        public Criteria andAimPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("aim_purpose >=", value, "aimPurpose");
            return (Criteria) this;
        }

        public Criteria andAimPurposeLessThan(String value) {
            addCriterion("aim_purpose <", value, "aimPurpose");
            return (Criteria) this;
        }

        public Criteria andAimPurposeLessThanOrEqualTo(String value) {
            addCriterion("aim_purpose <=", value, "aimPurpose");
            return (Criteria) this;
        }

        public Criteria andAimPurposeLike(String value) {
            addCriterion("aim_purpose like", value, "aimPurpose");
            return (Criteria) this;
        }

        public Criteria andAimPurposeNotLike(String value) {
            addCriterion("aim_purpose not like", value, "aimPurpose");
            return (Criteria) this;
        }

        public Criteria andAimPurposeIn(List<String> values) {
            addCriterion("aim_purpose in", values, "aimPurpose");
            return (Criteria) this;
        }

        public Criteria andAimPurposeNotIn(List<String> values) {
            addCriterion("aim_purpose not in", values, "aimPurpose");
            return (Criteria) this;
        }

        public Criteria andAimPurposeBetween(String value1, String value2) {
            addCriterion("aim_purpose between", value1, value2, "aimPurpose");
            return (Criteria) this;
        }

        public Criteria andAimPurposeNotBetween(String value1, String value2) {
            addCriterion("aim_purpose not between", value1, value2, "aimPurpose");
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