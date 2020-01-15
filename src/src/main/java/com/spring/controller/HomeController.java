package com.spring.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spring.bean.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/add")
    public void addUser() {
        User user = new User();
        user.setUserName("scott");
        user.setPassword("ac089b11709f9b9e9980e7c497268dfa");
        user.setCreateTime(new Date());
        user.setStatus("0");
        this.userService.save(user);
    }

    @RequestMapping("/users")
    public List<User> Users() {
        PageHelper.startPage(2, 2);
        List<User> list = userService.selectAll();
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        List<User> result = pageInfo.getList();
        return result;
    }
}
