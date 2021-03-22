package com.employeeInfo.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user_address")
public class UserAddress implements Serializable
{
      @Id
      @Column(name="user_address_id")
      private Integer addressId;

      @ManyToOne
      @JoinColumn(name="user_id_address")
      @JsonBackReference
      private UserInfo userId ;

      @Column(name="address")
      private String address;

    public UserAddress() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public UserInfo getUserId() {
        return userId;
    }

    public void setUserId(UserInfo userId) {
        this.userId = userId;
    }


}
