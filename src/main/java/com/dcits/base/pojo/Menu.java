package com.dcits.base.pojo;

public class Menu {
    private Integer sid;

    private String menuName;

    private Integer pSid;

    private Integer sort;

    private String remark;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Integer getpSid() {
        return pSid;
    }

    public void setpSid(Integer pSid) {
        this.pSid = pSid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}