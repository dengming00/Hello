package com.dengmaven.service;

import com.dengmaven.domain.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有
     * @return
     */
     List<User> findAll();
}
