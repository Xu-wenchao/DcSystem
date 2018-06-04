package com.dcits.base.pojo;

import java.util.Date;

public class Prediscussmsg {
    private Integer sid;

    private Integer userId;

    private String proposer;

    private String preSalesType;

    private Date applicationDate;

    private String proposerDepartment;

    private String aimUnit;

    private String aimDepartment;

    private String aimLocation;

    private String aimTime;

    private String clientInterface;

    private String clientDuty;

    private String clientBack;

    private String aimPurpose;

    private String remark;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer == null ? null : proposer.trim();
    }

    public String getPreSalesType() {
        return preSalesType;
    }

    public void setPreSalesType(String preSalesType) {
        this.preSalesType = preSalesType == null ? null : preSalesType.trim();
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getProposerDepartment() {
        return proposerDepartment;
    }

    public void setProposerDepartment(String proposerDepartment) {
        this.proposerDepartment = proposerDepartment == null ? null : proposerDepartment.trim();
    }

    public String getAimUnit() {
        return aimUnit;
    }

    public void setAimUnit(String aimUnit) {
        this.aimUnit = aimUnit == null ? null : aimUnit.trim();
    }

    public String getAimDepartment() {
        return aimDepartment;
    }

    public void setAimDepartment(String aimDepartment) {
        this.aimDepartment = aimDepartment == null ? null : aimDepartment.trim();
    }

    public String getAimLocation() {
        return aimLocation;
    }

    public void setAimLocation(String aimLocation) {
        this.aimLocation = aimLocation == null ? null : aimLocation.trim();
    }

    public String getAimTime() {
        return aimTime;
    }

    public void setAimTime(String aimTime) {
        this.aimTime = aimTime == null ? null : aimTime.trim();
    }

    public String getClientInterface() {
        return clientInterface;
    }

    public void setClientInterface(String clientInterface) {
        this.clientInterface = clientInterface == null ? null : clientInterface.trim();
    }

    public String getClientDuty() {
        return clientDuty;
    }

    public void setClientDuty(String clientDuty) {
        this.clientDuty = clientDuty == null ? null : clientDuty.trim();
    }

    public String getClientBack() {
        return clientBack;
    }

    public void setClientBack(String clientBack) {
        this.clientBack = clientBack == null ? null : clientBack.trim();
    }

    public String getAimPurpose() {
        return aimPurpose;
    }

    public void setAimPurpose(String aimPurpose) {
        this.aimPurpose = aimPurpose == null ? null : aimPurpose.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}