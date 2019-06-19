package com.itmayiedu.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    // @RestController 注解 表示 该类中的所有方法返回json格式
    // @RestController 是springboot提供吗？ 为微服务提供返回json格式
    // springboot 启动原理：springmvc 注解方式1启动  内置http服务器（默认是tomcat）
    // @EnableAutoConfiguration  注解作用：扫描范围默认本类

    @RequestMapping("/memberIndex")
    public String memberIndex() {
        return "springboot 2.0 全新版本教程，蚂蚁课堂重磅推出";
    }


}
