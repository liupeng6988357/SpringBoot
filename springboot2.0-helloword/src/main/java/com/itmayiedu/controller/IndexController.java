package com.itmayiedu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/Index")
    public String index() {
        return "springboot 2.0 全新版本教程";
    }
}
