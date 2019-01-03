package com.maven_parten.dao;

import com.maven_parten.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有
     * @return
     */
    List<User> findAll();
}
