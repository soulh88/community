package com.soulh88.community.service;

import com.soulh88.community.dao.UserMapper;
import com.soulh88.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
