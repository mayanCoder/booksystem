package com.mayan.controller;

import com.mayan.entity.User;
import com.mayan.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/book/login")
    public String login(String username,String password){
        User user = userService.getUser(username,password);
        if (user==null) return "login.html";
        return "index";
    }
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
