package com.dengmaven.dao;

import com.dengmaven.domain.User;

import java.util.List;

public interface UserDao{
    /**
     * 查找所有
     * @return
     */
    List<User> findAll();
}
