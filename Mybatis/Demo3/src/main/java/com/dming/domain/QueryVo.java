package com.dming.domain;

import java.util.List;

/**
 * 封装参数的类
 */
public class QueryVo{
    private User user;
    private List<Integer> list;
    private List<User> us;

    public QueryVo() {
    }

    public QueryVo(User user, List<Integer> list, List<User> us) {

        this.user = user;
        this.list = list;
        this.us = us;
    }

    public User getUser() {

        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public List<User> getUs() {
        return us;
    }

    public void setUs(List<User> us) {
        this.us = us;
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "user=" + user +
                ", list=" + list +
                ", us=" + us +
                '}';
    }
}
