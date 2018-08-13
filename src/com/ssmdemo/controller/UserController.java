package com.ssmdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.ssmdemo.common.Result;
import com.ssmdemo.model.User;
import com.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.ssmdemo.common.ResultCode.SUCCESS;
import static com.ssmdemo.common.ResultCode.SYSTEM_INNER_ERROR;

/**
 * @author tuzhengsong
 */
@Controller
@RequestMapping(value = "/users")
public class UserController {
    private UserService userService;

    /**
     * 通过构造器进行注入
     */
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 获取所有成员和部门列表
     *
     * @return the result
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    Result add(@RequestBody User user) {
        Result result = new Result();
        JSONObject resJson = userService.add(user);
        int parma = resJson.getInteger("result");
        switch (parma) {
            case 1: {
                int id = resJson.getInteger("id");
                JSONObject data = new JSONObject();
                data.put("id", id);
                result.setData(data);
                result.setCode(SUCCESS.code());
                result.setMsg(SUCCESS.message());
            }
            break;

            default: {
                result.setCode(SYSTEM_INNER_ERROR.code());
                result.setMsg(SYSTEM_INNER_ERROR.message());
            }
            break;
        }
        return result;
    }
}
