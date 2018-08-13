package com.ssmdemo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ssmdemo.dao.UserMapper;
import com.ssmdemo.model.User;
import com.ssmdemo.mydao.MyUserMapper;
import com.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    private MyUserMapper myUserMapper;

    /**
     * 通过构造器进行注入
     */
    @Autowired
    public UserServiceImpl(UserMapper userMapper,MyUserMapper myUserMapper) {
        this.userMapper = userMapper;
        this.myUserMapper = myUserMapper;
    }

    @Override
    public JSONObject add(User user) {

        JSONObject jsonObject = new JSONObject();
        userMapper.insert(user);
//        myUserMapper.add(user);
        int id = user.getId();
        if (id > 0) {
            jsonObject.put("result", 1);
            jsonObject.put("id", id);
        } else {
            jsonObject.put("result", 40001);
        }
        return jsonObject;
    }
}
