package com.itmayiedu.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class FTLIndexController {

    @RequestMapping("/ftlIndex")
    public String ftlIndex(Map<String,Object> map){

        map.put("name","张三");

        map.put("age","26");

        return "ftlIndex";
    }
}
