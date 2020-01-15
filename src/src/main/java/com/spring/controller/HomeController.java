package com.spring.controller;

import com.spring.bean.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public void index() {
        User user = new User();
        user.setUserName("scott");
        user.setPassword("ac089b11709f9b9e9980e7c497268dfa");
        user.setCreateTime(new Date());
        user.setStatus("0");
        this.userService.save(user);
    }
}
