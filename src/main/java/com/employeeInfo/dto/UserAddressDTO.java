package com.employeeInfo.dto;


import com.employeeInfo.entity.UserInfo;

public class UserAddressDTO
{
      private Integer addressId;
      private UserInfo userId;
      private String address;


      public Integer getAddressId() {
         return addressId;
      }

      public void setAddressId(Integer addressId) {
        this.addressId = addressId;
      }



     public String getAddress() {
        return address;
     }

     public void setAddress(String address) {
        this.address = address;
     }
    public UserInfo getUserId() {
        return userId;
    }

    public void setUserId(UserInfo userId) {
        this.userId = userId;
    }



}
