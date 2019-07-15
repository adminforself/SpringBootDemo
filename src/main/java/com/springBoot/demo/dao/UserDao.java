package com.springBoot.demo.dao;

import com.springBoot.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public List<User> findAll();
}
