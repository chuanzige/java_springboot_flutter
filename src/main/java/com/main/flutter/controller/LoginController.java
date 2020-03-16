package com.main.flutter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MrWang
 * @version v1.0
 * @date 2020/3/16
 * @Description
 */

@RestController
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/login")
    public Map<String,Object> login(String userName,String password){
        Map<String,Object> returnData = new HashMap<>(8);
        if (userName==null||password==null){
            returnData.put("code","E19999");
            returnData.put("msg","用户名或密码不能为空");
        }else if (!"admin".equals(userName)||!"admin".equals(password)){
            returnData.put("code","E19999");
            returnData.put("msg","用户名或密码错误");
        }else {
            returnData.put("code","S10000");
            returnData.put("msg","登录成功");
        }
        return returnData;
    }
}
