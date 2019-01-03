package com.maven_panter02.userservice;

import com.maven_panter02.domain.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有
     * @return
     */
    List<User> findAll();
}
