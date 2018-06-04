package com.dcits.base.pojo;

public class Tablepower {
    private Integer sid;

    private Integer roleSid;

    private String tableName;

    private Integer power;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getRoleSid() {
        return roleSid;
    }

    public void setRoleSid(Integer roleSid) {
        this.roleSid = roleSid;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
}