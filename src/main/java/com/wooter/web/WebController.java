package com.wooter.web;

import com.wooter.mybatis.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by taota on 2018/9/5.
 */
@RestController
public class WebController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("/mybatis-test")
    public String get(){
        userMapper.insert("AAA", 20);
        return "test OK!";
    }
}
