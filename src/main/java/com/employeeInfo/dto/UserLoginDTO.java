package com.employeeInfo.dto;

import java.sql.Timestamp;

public class UserLoginDTO {

    private Integer userLogin;
    private UserInfoDTO userId;
    private short activeStatus;
    private String userPassword;
    private Timestamp createTime;
    private Timestamp update_time;


    public Integer getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(Integer userLogin) {
        this.userLogin = userLogin;
    }

    public UserInfoDTO getUserId() {
        return userId;
    }

    public void setUserId(UserInfoDTO userId) {
        this.userId = userId;
    }

    public short getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(short activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Timestamp update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "UserLoginDTO{" +
                "userLogin=" + userLogin +
                ", userId=" + userId +
                ", activeStatus=" + activeStatus +
                ", userPassword='" + userPassword + '\'' +
                ", createTime=" + createTime +
                ", update_time=" + update_time +
                '}';
    }
}
