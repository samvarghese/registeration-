package com.employeeInfo.business;


import com.employeeInfo.dto.UserInfoDTO;
import com.employeeInfo.dao.UserInfoDao;
import com.employeeInfo.entity.UserInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoBusiness
{
    @Autowired
    private UserInfoDao userInfoDao;

    public List<UserInfoDTO>  retrieveAllUserInformation()
    {
        List<UserInfoDTO> userInfoDTO = new ArrayList<>();
         try
            {
                ObjectMapper obj = new ObjectMapper();
                List<UserInfo> userInfoLst = userInfoDao.findAll();
                System.out.println(userInfoLst);
                userInfoDTO = obj.convertValue(userInfoLst, new TypeReference<List<UserInfoDTO>>(){});
            }
            catch (Exception e)
            {
                e.printStackTrace();

            }
            return userInfoDTO;
    }

    public String insertUserInfo(UserInfoDTO userInfo)
    {
        ObjectMapper obj = new ObjectMapper();
        UserInfo userInfoEntity = obj.convertValue(userInfo,UserInfo.class);
        userInfoDao.save(userInfoEntity);
        return "Sucess";
    }
}
