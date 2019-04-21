package com.dming.dao;
import com.dming.domain.User1;
import java.util.List;

public interface RoleDao {
    /**
     * 多对多查询
     * @return
     */
    List<User1> finlAll();


    /**
     * 多对多查询方式二
     * @return
     */
    List<User1> finTwo();
}
