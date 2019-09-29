package com.example.spring.dictionary.controller;

import com.example.spring.dictionary.model.User;
import com.example.spring.dictionary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/userInfo")
    @ResponseBody
    public String getUserInfo(){
        User userInfo = userService.getUserInfo(1);
        System.out.println(userInfo.toString());
        return userInfo.toString();
    }
}
