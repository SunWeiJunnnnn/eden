package com.org.auth.dao;

import java.sql.Date;

public class UserDao {
    private int internalUserId;
    private String userName;
    private int roleId;
    private Date birthday;

    public UserDao(int internalUserId, String userName, int roleId, Date birthday) {
        this.internalUserId = internalUserId;
        this.userName = userName;
        this.roleId = roleId;
        this.birthday = birthday;
    }

    public UserDao(String userName, int roleId, Date birthday) {
        this.userName = userName;
        this.roleId = roleId;
        this.birthday = birthday;
    }

    public int getInternalUserId() {
        return internalUserId;
    }

    public void setInternalUserId(int internalUserId) {
        this.internalUserId = internalUserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
