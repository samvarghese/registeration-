package com.employeeInfo.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="user_info")
public class UserInfo {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "userId",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<UserAddress> userAddress = new ArrayList<>();

    public UserInfo() {
    }


    @OneToMany(mappedBy = "userId")
    private Set<UserLogin> userLogin;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<UserAddress> getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(List<UserAddress> userAddress) {
        this.userAddress = userAddress;
    }

    public Set<UserLogin> getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(Set<UserLogin> userLogin) {
        this.userLogin = userLogin;
    }


}
