package com.dmingm.dao;

import com.dmingm.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from transfer")
    public List<User> finalAll();

    /**
     * 保存数据
     * @param user
     */
    public void saveUser(User user);
}
