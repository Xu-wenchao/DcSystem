package com.dcits.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class IndiscussmsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndiscussmsgExample() {
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

        public Criteria andDiscussProficientIsNull() {
            addCriterion("discuss_proficient is null");
            return (Criteria) this;
        }

        public Criteria andDiscussProficientIsNotNull() {
            addCriterion("discuss_proficient is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussProficientEqualTo(String value) {
            addCriterion("discuss_proficient =", value, "discussProficient");
            return (Criteria) this;
        }

        public Criteria andDiscussProficientNotEqualTo(String value) {
            addCriterion("discuss_proficient <>", value, "discussProficient");
            return (Criteria) this;
        }

        public Criteria andDiscussProficientGreaterThan(String value) {
            addCriterion("discuss_proficient >", value, "discussProficient");
            return (Criteria) this;
        }

        public Criteria andDiscussProficientGreaterThanOrEqualTo(String value) {
            addCriterion("discuss_proficient >=", value, "discussProficient");
            return (Criteria) this;
        }

        public Criteria andDiscussProficientLessThan(String value) {
            addCriterion("discuss_proficient <", value, "discussProficient");
            return (Criteria) this;
        }

        public Criteria andDiscussProficientLessThanOrEqualTo(String value) {
            addCriterion("discuss_proficient <=", value, "discussProficient");
            return (Criteria) this;
        }

        public Criteria andDiscussProficientLike(String value) {
            addCriterion("discuss_proficient like", value, "discussProficient");
            return (Criteria) this;
        }

        public Criteria andDiscussProficientNotLike(String value) {
            addCriterion("discuss_proficient not like", value, "discussProficient");
            return (Criteria) this;
        }

        public Criteria andDiscussProficientIn(List<String> values) {
            addCriterion("discuss_proficient in", values, "discussProficient");
            return (Criteria) this;
        }

        public Criteria andDiscussProficientNotIn(List<String> values) {
            addCriterion("discuss_proficient not in", values, "discussProficient");
            return (Criteria) this;
        }

        public Criteria andDiscussProficientBetween(String value1, String value2) {
            addCriterion("discuss_proficient between", value1, value2, "discussProficient");
            return (Criteria) this;
        }

        public Criteria andDiscussProficientNotBetween(String value1, String value2) {
            addCriterion("discuss_proficient not between", value1, value2, "discussProficient");
            return (Criteria) this;
        }

        public Criteria andDiscussTimeIsNull() {
            addCriterion("discuss_time is null");
            return (Criteria) this;
        }

        public Criteria andDiscussTimeIsNotNull() {
            addCriterion("discuss_time is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussTimeEqualTo(String value) {
            addCriterion("discuss_time =", value, "discussTime");
            return (Criteria) this;
        }

        public Criteria andDiscussTimeNotEqualTo(String value) {
            addCriterion("discuss_time <>", value, "discussTime");
            return (Criteria) this;
        }

        public Criteria andDiscussTimeGreaterThan(String value) {
            addCriterion("discuss_time >", value, "discussTime");
            return (Criteria) this;
        }

        public Criteria andDiscussTimeGreaterThanOrEqualTo(String value) {
            addCriterion("discuss_time >=", value, "discussTime");
            return (Criteria) this;
        }

        public Criteria andDiscussTimeLessThan(String value) {
            addCriterion("discuss_time <", value, "discussTime");
            return (Criteria) this;
        }

        public Criteria andDiscussTimeLessThanOrEqualTo(String value) {
            addCriterion("discuss_time <=", value, "discussTime");
            return (Criteria) this;
        }

        public Criteria andDiscussTimeLike(String value) {
            addCriterion("discuss_time like", value, "discussTime");
            return (Criteria) this;
        }

        public Criteria andDiscussTimeNotLike(String value) {
            addCriterion("discuss_time not like", value, "discussTime");
            return (Criteria) this;
        }

        public Criteria andDiscussTimeIn(List<String> values) {
            addCriterion("discuss_time in", values, "discussTime");
            return (Criteria) this;
        }

        public Criteria andDiscussTimeNotIn(List<String> values) {
            addCriterion("discuss_time not in", values, "discussTime");
            return (Criteria) this;
        }

        public Criteria andDiscussTimeBetween(String value1, String value2) {
            addCriterion("discuss_time between", value1, value2, "discussTime");
            return (Criteria) this;
        }

        public Criteria andDiscussTimeNotBetween(String value1, String value2) {
            addCriterion("discuss_time not between", value1, value2, "discussTime");
            return (Criteria) this;
        }

        public Criteria andDiscussWayIsNull() {
            addCriterion("discuss_way is null");
            return (Criteria) this;
        }

        public Criteria andDiscussWayIsNotNull() {
            addCriterion("discuss_way is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussWayEqualTo(String value) {
            addCriterion("discuss_way =", value, "discussWay");
            return (Criteria) this;
        }

        public Criteria andDiscussWayNotEqualTo(String value) {
            addCriterion("discuss_way <>", value, "discussWay");
            return (Criteria) this;
        }

        public Criteria andDiscussWayGreaterThan(String value) {
            addCriterion("discuss_way >", value, "discussWay");
            return (Criteria) this;
        }

        public Criteria andDiscussWayGreaterThanOrEqualTo(String value) {
            addCriterion("discuss_way >=", value, "discussWay");
            return (Criteria) this;
        }

        public Criteria andDiscussWayLessThan(String value) {
            addCriterion("discuss_way <", value, "discussWay");
            return (Criteria) this;
        }

        public Criteria andDiscussWayLessThanOrEqualTo(String value) {
            addCriterion("discuss_way <=", value, "discussWay");
            return (Criteria) this;
        }

        public Criteria andDiscussWayLike(String value) {
            addCriterion("discuss_way like", value, "discussWay");
            return (Criteria) this;
        }

        public Criteria andDiscussWayNotLike(String value) {
            addCriterion("discuss_way not like", value, "discussWay");
            return (Criteria) this;
        }

        public Criteria andDiscussWayIn(List<String> values) {
            addCriterion("discuss_way in", values, "discussWay");
            return (Criteria) this;
        }

        public Criteria andDiscussWayNotIn(List<String> values) {
            addCriterion("discuss_way not in", values, "discussWay");
            return (Criteria) this;
        }

        public Criteria andDiscussWayBetween(String value1, String value2) {
            addCriterion("discuss_way between", value1, value2, "discussWay");
            return (Criteria) this;
        }

        public Criteria andDiscussWayNotBetween(String value1, String value2) {
            addCriterion("discuss_way not between", value1, value2, "discussWay");
            return (Criteria) this;
        }

        public Criteria andDiscussFileIsNull() {
            addCriterion("discuss_file is null");
            return (Criteria) this;
        }

        public Criteria andDiscussFileIsNotNull() {
            addCriterion("discuss_file is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussFileEqualTo(String value) {
            addCriterion("discuss_file =", value, "discussFile");
            return (Criteria) this;
        }

        public Criteria andDiscussFileNotEqualTo(String value) {
            addCriterion("discuss_file <>", value, "discussFile");
            return (Criteria) this;
        }

        public Criteria andDiscussFileGreaterThan(String value) {
            addCriterion("discuss_file >", value, "discussFile");
            return (Criteria) this;
        }

        public Criteria andDiscussFileGreaterThanOrEqualTo(String value) {
            addCriterion("discuss_file >=", value, "discussFile");
            return (Criteria) this;
        }

        public Criteria andDiscussFileLessThan(String value) {
            addCriterion("discuss_file <", value, "discussFile");
            return (Criteria) this;
        }

        public Criteria andDiscussFileLessThanOrEqualTo(String value) {
            addCriterion("discuss_file <=", value, "discussFile");
            return (Criteria) this;
        }

        public Criteria andDiscussFileLike(String value) {
            addCriterion("discuss_file like", value, "discussFile");
            return (Criteria) this;
        }

        public Criteria andDiscussFileNotLike(String value) {
            addCriterion("discuss_file not like", value, "discussFile");
            return (Criteria) this;
        }

        public Criteria andDiscussFileIn(List<String> values) {
            addCriterion("discuss_file in", values, "discussFile");
            return (Criteria) this;
        }

        public Criteria andDiscussFileNotIn(List<String> values) {
            addCriterion("discuss_file not in", values, "discussFile");
            return (Criteria) this;
        }

        public Criteria andDiscussFileBetween(String value1, String value2) {
            addCriterion("discuss_file between", value1, value2, "discussFile");
            return (Criteria) this;
        }

        public Criteria andDiscussFileNotBetween(String value1, String value2) {
            addCriterion("discuss_file not between", value1, value2, "discussFile");
            return (Criteria) this;
        }

        public Criteria andPreSalesDaysIsNull() {
            addCriterion("pre_sales_days is null");
            return (Criteria) this;
        }

        public Criteria andPreSalesDaysIsNotNull() {
            addCriterion("pre_sales_days is not null");
            return (Criteria) this;
        }

        public Criteria andPreSalesDaysEqualTo(String value) {
            addCriterion("pre_sales_days =", value, "preSalesDays");
            return (Criteria) this;
        }

        public Criteria andPreSalesDaysNotEqualTo(String value) {
            addCriterion("pre_sales_days <>", value, "preSalesDays");
            return (Criteria) this;
        }

        public Criteria andPreSalesDaysGreaterThan(String value) {
            addCriterion("pre_sales_days >", value, "preSalesDays");
            return (Criteria) this;
        }

        public Criteria andPreSalesDaysGreaterThanOrEqualTo(String value) {
            addCriterion("pre_sales_days >=", value, "preSalesDays");
            return (Criteria) this;
        }

        public Criteria andPreSalesDaysLessThan(String value) {
            addCriterion("pre_sales_days <", value, "preSalesDays");
            return (Criteria) this;
        }

        public Criteria andPreSalesDaysLessThanOrEqualTo(String value) {
            addCriterion("pre_sales_days <=", value, "preSalesDays");
            return (Criteria) this;
        }

        public Criteria andPreSalesDaysLike(String value) {
            addCriterion("pre_sales_days like", value, "preSalesDays");
            return (Criteria) this;
        }

        public Criteria andPreSalesDaysNotLike(String value) {
            addCriterion("pre_sales_days not like", value, "preSalesDays");
            return (Criteria) this;
        }

        public Criteria andPreSalesDaysIn(List<String> values) {
            addCriterion("pre_sales_days in", values, "preSalesDays");
            return (Criteria) this;
        }

        public Criteria andPreSalesDaysNotIn(List<String> values) {
            addCriterion("pre_sales_days not in", values, "preSalesDays");
            return (Criteria) this;
        }

        public Criteria andPreSalesDaysBetween(String value1, String value2) {
            addCriterion("pre_sales_days between", value1, value2, "preSalesDays");
            return (Criteria) this;
        }

        public Criteria andPreSalesDaysNotBetween(String value1, String value2) {
            addCriterion("pre_sales_days not between", value1, value2, "preSalesDays");
            return (Criteria) this;
        }

        public Criteria andReimbursementAmountIsNull() {
            addCriterion("reimbursement_amount is null");
            return (Criteria) this;
        }

        public Criteria andReimbursementAmountIsNotNull() {
            addCriterion("reimbursement_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReimbursementAmountEqualTo(String value) {
            addCriterion("reimbursement_amount =", value, "reimbursementAmount");
            return (Criteria) this;
        }

        public Criteria andReimbursementAmountNotEqualTo(String value) {
            addCriterion("reimbursement_amount <>", value, "reimbursementAmount");
            return (Criteria) this;
        }

        public Criteria andReimbursementAmountGreaterThan(String value) {
            addCriterion("reimbursement_amount >", value, "reimbursementAmount");
            return (Criteria) this;
        }

        public Criteria andReimbursementAmountGreaterThanOrEqualTo(String value) {
            addCriterion("reimbursement_amount >=", value, "reimbursementAmount");
            return (Criteria) this;
        }

        public Criteria andReimbursementAmountLessThan(String value) {
            addCriterion("reimbursement_amount <", value, "reimbursementAmount");
            return (Criteria) this;
        }

        public Criteria andReimbursementAmountLessThanOrEqualTo(String value) {
            addCriterion("reimbursement_amount <=", value, "reimbursementAmount");
            return (Criteria) this;
        }

        public Criteria andReimbursementAmountLike(String value) {
            addCriterion("reimbursement_amount like", value, "reimbursementAmount");
            return (Criteria) this;
        }

        public Criteria andReimbursementAmountNotLike(String value) {
            addCriterion("reimbursement_amount not like", value, "reimbursementAmount");
            return (Criteria) this;
        }

        public Criteria andReimbursementAmountIn(List<String> values) {
            addCriterion("reimbursement_amount in", values, "reimbursementAmount");
            return (Criteria) this;
        }

        public Criteria andReimbursementAmountNotIn(List<String> values) {
            addCriterion("reimbursement_amount not in", values, "reimbursementAmount");
            return (Criteria) this;
        }

        public Criteria andReimbursementAmountBetween(String value1, String value2) {
            addCriterion("reimbursement_amount between", value1, value2, "reimbursementAmount");
            return (Criteria) this;
        }

        public Criteria andReimbursementAmountNotBetween(String value1, String value2) {
            addCriterion("reimbursement_amount not between", value1, value2, "reimbursementAmount");
            return (Criteria) this;
        }

        public Criteria andApartmentPersonIsNull() {
            addCriterion("apartment_person is null");
            return (Criteria) this;
        }

        public Criteria andApartmentPersonIsNotNull() {
            addCriterion("apartment_person is not null");
            return (Criteria) this;
        }

        public Criteria andApartmentPersonEqualTo(String value) {
            addCriterion("apartment_person =", value, "apartmentPerson");
            return (Criteria) this;
        }

        public Criteria andApartmentPersonNotEqualTo(String value) {
            addCriterion("apartment_person <>", value, "apartmentPerson");
            return (Criteria) this;
        }

        public Criteria andApartmentPersonGreaterThan(String value) {
            addCriterion("apartment_person >", value, "apartmentPerson");
            return (Criteria) this;
        }

        public Criteria andApartmentPersonGreaterThanOrEqualTo(String value) {
            addCriterion("apartment_person >=", value, "apartmentPerson");
            return (Criteria) this;
        }

        public Criteria andApartmentPersonLessThan(String value) {
            addCriterion("apartment_person <", value, "apartmentPerson");
            return (Criteria) this;
        }

        public Criteria andApartmentPersonLessThanOrEqualTo(String value) {
            addCriterion("apartment_person <=", value, "apartmentPerson");
            return (Criteria) this;
        }

        public Criteria andApartmentPersonLike(String value) {
            addCriterion("apartment_person like", value, "apartmentPerson");
            return (Criteria) this;
        }

        public Criteria andApartmentPersonNotLike(String value) {
            addCriterion("apartment_person not like", value, "apartmentPerson");
            return (Criteria) this;
        }

        public Criteria andApartmentPersonIn(List<String> values) {
            addCriterion("apartment_person in", values, "apartmentPerson");
            return (Criteria) this;
        }

        public Criteria andApartmentPersonNotIn(List<String> values) {
            addCriterion("apartment_person not in", values, "apartmentPerson");
            return (Criteria) this;
        }

        public Criteria andApartmentPersonBetween(String value1, String value2) {
            addCriterion("apartment_person between", value1, value2, "apartmentPerson");
            return (Criteria) this;
        }

        public Criteria andApartmentPersonNotBetween(String value1, String value2) {
            addCriterion("apartment_person not between", value1, value2, "apartmentPerson");
            return (Criteria) this;
        }

        public Criteria andDiscussResultIsNull() {
            addCriterion("discuss_result is null");
            return (Criteria) this;
        }

        public Criteria andDiscussResultIsNotNull() {
            addCriterion("discuss_result is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussResultEqualTo(String value) {
            addCriterion("discuss_result =", value, "discussResult");
            return (Criteria) this;
        }

        public Criteria andDiscussResultNotEqualTo(String value) {
            addCriterion("discuss_result <>", value, "discussResult");
            return (Criteria) this;
        }

        public Criteria andDiscussResultGreaterThan(String value) {
            addCriterion("discuss_result >", value, "discussResult");
            return (Criteria) this;
        }

        public Criteria andDiscussResultGreaterThanOrEqualTo(String value) {
            addCriterion("discuss_result >=", value, "discussResult");
            return (Criteria) this;
        }

        public Criteria andDiscussResultLessThan(String value) {
            addCriterion("discuss_result <", value, "discussResult");
            return (Criteria) this;
        }

        public Criteria andDiscussResultLessThanOrEqualTo(String value) {
            addCriterion("discuss_result <=", value, "discussResult");
            return (Criteria) this;
        }

        public Criteria andDiscussResultLike(String value) {
            addCriterion("discuss_result like", value, "discussResult");
            return (Criteria) this;
        }

        public Criteria andDiscussResultNotLike(String value) {
            addCriterion("discuss_result not like", value, "discussResult");
            return (Criteria) this;
        }

        public Criteria andDiscussResultIn(List<String> values) {
            addCriterion("discuss_result in", values, "discussResult");
            return (Criteria) this;
        }

        public Criteria andDiscussResultNotIn(List<String> values) {
            addCriterion("discuss_result not in", values, "discussResult");
            return (Criteria) this;
        }

        public Criteria andDiscussResultBetween(String value1, String value2) {
            addCriterion("discuss_result between", value1, value2, "discussResult");
            return (Criteria) this;
        }

        public Criteria andDiscussResultNotBetween(String value1, String value2) {
            addCriterion("discuss_result not between", value1, value2, "discussResult");
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