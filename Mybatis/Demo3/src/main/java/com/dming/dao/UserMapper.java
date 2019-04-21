package com.dming.dao;
import com.dming.domain.Account;
import com.dming.domain.User;
import com.dming.domain.UserAccount;
import com.dming.domain.UserAccount2;

import java.util.List;

public interface UserMapper {
    /**
     * 查询两个表中所有的数据
     * @return
     */
    List<Account>finlAll();

    /**
     * 一对一查找
     * @return
     */
    List<UserAccount> finlOne();

    /**
     * 多对多查询
     * @return
     */
    List<User> finlTwo();

    /**
     * 多对多查询，方式二
     * @return
     */
    List<UserAccount2> finlTwo2();
}
