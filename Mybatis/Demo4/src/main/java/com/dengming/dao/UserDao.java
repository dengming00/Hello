package com.dengming.dao;

import com.dengming.domain.Account;
import com.dengming.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 延时查询,先查询User，在查询Account
     * @return
     */

    List<Account> finlAccount();
    List<User> finlUser();
}
