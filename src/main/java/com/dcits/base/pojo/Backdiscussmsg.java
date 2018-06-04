package com.dcits.base.pojo;

public class Backdiscussmsg {
    private Integer sid;

    private Integer userSid;

    private Integer pdmSid;

    private String preSalesSummarize;

    private String clientBackSummarize;

    private String preSalesComment;

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

    public String getPreSalesSummarize() {
        return preSalesSummarize;
    }

    public void setPreSalesSummarize(String preSalesSummarize) {
        this.preSalesSummarize = preSalesSummarize == null ? null : preSalesSummarize.trim();
    }

    public String getClientBackSummarize() {
        return clientBackSummarize;
    }

    public void setClientBackSummarize(String clientBackSummarize) {
        this.clientBackSummarize = clientBackSummarize == null ? null : clientBackSummarize.trim();
    }

    public String getPreSalesComment() {
        return preSalesComment;
    }

    public void setPreSalesComment(String preSalesComment) {
        this.preSalesComment = preSalesComment == null ? null : preSalesComment.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}