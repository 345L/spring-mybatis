package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
        * 欢迎
        * @author 王浩
        * @time 2012-11-2014:49:01
        */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello() {
        System.out.println("11231");// 测试
        System.out.println("11231");// 测试
        return "hello,Spring Boot";
    }

    // sout System.out.println("");
    // main方法快捷 psvm

}