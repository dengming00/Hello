package com.dmingm.service;

import com.dmingm.domain.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有
     * @return
     */
    public List<User> finalAll();

    /**
     * 保存数据
     * @param user
     */
    public void saveUser(User user);
}
