package com.itmayiedu.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.itmayiedu.controller")
public class App {

    public static void main(String[] args) {

        //整个程序的入口，启动springboot项目   使用springmvc  创建内置tomcat服务器，使用tomcat加载springmvc 注解启动类
        SpringApplication.run(App.class,args);
    }
}
