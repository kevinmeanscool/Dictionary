package com.example.spring.dictionary.service.Impl;

import com.example.spring.dictionary.dao.UserMapper;

import com.example.spring.dictionary.model.User;
import com.example.spring.dictionary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserInfo(Number userid) {
        return userMapper.getUserInfo(userid);
    }
}
