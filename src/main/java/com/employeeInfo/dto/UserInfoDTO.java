package com.employeeInfo.dto;


import java.util.Collection;
import java.util.List;
import java.util.Set;


public class UserInfoDTO
{
    private Integer userId;
    private String userName;
    private String userEmail;
    private String phoneNumber;
    private List<UserAddressDTO> userAddress;
    private List<UserLoginDTO> userLogin;

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

    public List<UserAddressDTO> getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(List<UserAddressDTO> userAddress) {
        this.userAddress = userAddress;
    }

    public List<UserLoginDTO> getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(List<UserLoginDTO> userLogin) {
        this.userLogin = userLogin;
    }

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
              //  ", userAddress=" + userAddress +
                ", userLogin=" + userLogin +
                '}';
    }
}
