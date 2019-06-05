package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
    * 欢迎
    * @author 王浩
    * @time 2012-11-2014:49:01
    */
@Controller
@RequestMapping(value = {"/user"})
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/index")
    public String index() {
        System.out.println("11231"); // 测试
        System.out.println("打印语句。");
        return "index";

//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("hello");
//        modelAndView.addObject("key", 12345);
////        //System.out.println("test");
//        return modelAndView;
    }

    /**
     * 查询用户
     * @return 用户列表页面
     */
    @RequestMapping(value = "/query")
    public String query(ModelMap modelMap){
        userService.save(new User("1","Mshu","123456","zhuiqiu95@foxmail.com"));
        List<User> users = userService.findAll();
        for (User param : users) {
            System.out.println("打印=" + param.getId());
        }
        modelMap.put("users",users);
        return "index";
    }

}