package com.zys.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class UserController {

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private String age;


    @GetMapping("/user/get")
    public String get() {
        return "我是服务提供者 ,姓名：" + name + ",年龄" + age;
    }
}
