package com.ssmdemo.service;

import com.alibaba.fastjson.JSONObject;
import com.ssmdemo.model.User;

public interface UserService {
    /**
     * @param user 用户实例
     * @return 执行结果
     */
    JSONObject add(User user);
}
