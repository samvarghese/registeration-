package com.employeeInfo.controller;

import com.employeeInfo.dto.UserInfoDTO;
import com.employeeInfo.business.UserInfoBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path ="/employee")
public class UserDetailsController
{

    @Autowired
    private UserInfoBusiness userBsnn;

    @GetMapping(path ="/employeeDetails")
    public List<UserInfoDTO> getAllEmployeeDetails()
    {
        System.out.println("haiii");
       return  userBsnn.retrieveAllUserInformation();
    }

    @PostMapping(path ="/employeeDetails")
    public String insertUserInfo(@RequestBody UserInfoDTO employeeDetails)
    {
        Map<String,String>  responseData = new HashMap<>();
        userBsnn.insertUserInfo(employeeDetails);
        return  responseData.put("Result","Sucess");
    }


}
