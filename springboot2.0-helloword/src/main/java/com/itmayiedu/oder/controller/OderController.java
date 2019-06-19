package com.itmayiedu.oder.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OderController {

    @RequestMapping("/oderIndex")
    public String memberIndex() {
        return "springboot 2.0 测试SpringBootApplication扫描范围";
    }

}
