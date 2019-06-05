package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//@Component
public interface UserMapper {
    List<User> getAll();

    int insert(User user);

    User selectByPrimaryKey(String id);

}
