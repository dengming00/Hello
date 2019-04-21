package com.dming.dao;

import com.dming.domain.QueryVo;
import com.dming.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 根据id动态的查询语句
     * @param vo
     * @return
     */
    List<User> finaById(QueryVo vo);

    /**
     * 根据id和username两个条件查询
     * @param vo
     * @return
     */
    List<User> finaBySexandUsername(QueryVo vo);

    /**
     * 动态sql语句,条件不限
     * @param vo
     * @return
     */
    List<User> finl(QueryVo vo);

    /**
     * id条件为等于in(41,46,48)
     * @param vo
     * @return
     */
    List<User> foreachBy(QueryVo vo);

    /**
     * 同时插入多条数据
     * @param vo
     * @return
     */
    void insert(QueryVo vo);
}
