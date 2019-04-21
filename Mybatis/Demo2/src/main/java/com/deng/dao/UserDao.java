package com.deng.dao;

import com.deng.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有
     * @return
     */
    List<User> finlAll();

    /**
     * 添加数据并返回其id值
     * @param user
     * @return
     */
    int insert(User user);
}
