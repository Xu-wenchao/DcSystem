package com.dcits.base.pojo;

public class Indiscussmsg {
    private Integer sid;

    private Integer userSid;

    private Integer pdmSid;

    private String discussProficient;

    private String discussTime;

    private String discussWay;

    private String discussFile;

    private String preSalesDays;

    private String reimbursementAmount;

    private String apartmentPerson;

    private String discussResult;

    private String remark;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getUserSid() {
        return userSid;
    }

    public void setUserSid(Integer userSid) {
        this.userSid = userSid;
    }

    public Integer getPdmSid() {
        return pdmSid;
    }

    public void setPdmSid(Integer pdmSid) {
        this.pdmSid = pdmSid;
    }

    public String getDiscussProficient() {
        return discussProficient;
    }

    public void setDiscussProficient(String discussProficient) {
        this.discussProficient = discussProficient == null ? null : discussProficient.trim();
    }

    public String getDiscussTime() {
        return discussTime;
    }

    public void setDiscussTime(String discussTime) {
        this.discussTime = discussTime == null ? null : discussTime.trim();
    }

    public String getDiscussWay() {
        return discussWay;
    }

    public void setDiscussWay(String discussWay) {
        this.discussWay = discussWay == null ? null : discussWay.trim();
    }

    public String getDiscussFile() {
        return discussFile;
    }

    public void setDiscussFile(String discussFile) {
        this.discussFile = discussFile == null ? null : discussFile.trim();
    }

    public String getPreSalesDays() {
        return preSalesDays;
    }

    public void setPreSalesDays(String preSalesDays) {
        this.preSalesDays = preSalesDays == null ? null : preSalesDays.trim();
    }

    public String getReimbursementAmount() {
        return reimbursementAmount;
    }

    public void setReimbursementAmount(String reimbursementAmount) {
        this.reimbursementAmount = reimbursementAmount == null ? null : reimbursementAmount.trim();
    }

    public String getApartmentPerson() {
        return apartmentPerson;
    }

    public void setApartmentPerson(String apartmentPerson) {
        this.apartmentPerson = apartmentPerson == null ? null : apartmentPerson.trim();
    }

    public String getDiscussResult() {
        return discussResult;
    }

    public void setDiscussResult(String discussResult) {
        this.discussResult = discussResult == null ? null : discussResult.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}