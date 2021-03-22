package com.employeeInfo.dao;


import com.employeeInfo.entity.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserLoginDao extends JpaRepository<UserLogin,Integer> {
}
