package com.deng.dao;

import com.deng.domain.Param;
import com.deng.domain.User;

import java.util.List;


public interface UserMapper1 {
    /**
     * 查询所有数据，并返回到集合中
     * @return
     */
    List<User> finlAll();

    /**
     * 根据id查找,单个数据，并返回为User
     * @return
     */
    User finlOne(Integer id);

    /**
     * 向数据库中添加数据
     */
    void add(User user);

    /**
     * 修改数据
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 删除数据
     * @param id
     */
    void delete(int id);

    /**
     * 用户模糊查询
     * @param name
     * @return
     */
    List<User> likeSelect(String name);

    /**
     * 获取用户总数
     * @return
     */
    Integer sum();

    /**
     * 将参数封装到一个参数类中
     * @param p
     * @return
     */
    User selectParam(Param p);



}
