package com.springBoot.demo.controller;

import com.springBoot.demo.dao.UserDao;
import com.springBoot.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userDao.findAll();
    }
}
