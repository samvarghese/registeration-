package com.employeeInfo.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="user_login")
public class UserLogin {


    @Id
    @Column(name="user_login")
    private Integer userLogin;

    @ManyToOne
    @JoinColumn(name="userId")
    private UserInfo userId;

    @Column(name="active_status")
    private short activeStatus;

    @Column(name="user_password")
    private String userPassword;

    @Column(name="create_time")
    private Timestamp createTime;

    @Column(name="update_time")
    private Timestamp update_time;


    public Integer getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(Integer userLogin) {
        this.userLogin = userLogin;
    }

    public UserInfo getUserId() {
        return userId;
    }

    public void setUserId(UserInfo userId) {
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


}
