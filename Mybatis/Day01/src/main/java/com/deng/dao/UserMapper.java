package com.deng.dao;

import com.deng.domain.User;

import java.util.List;


public interface UserMapper {
    /**
     * 查询数据库中所有的数据并返回，封装到List<User>中
     *
     * @return
     */
    default List<User> finlAll() {
        return null;
    }
}
