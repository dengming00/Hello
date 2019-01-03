package com.maven_panter02.dao;

import com.maven_panter02.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有的数据
     * @return
     */
    List<User> findAll();
}
