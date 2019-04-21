package com.deng.domain;

public class Param {
    private User user;

    public Param() {
    }

    public Param(User user) {
        this.user = user;
    }

    public User getUser() {

        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Param{" +
                "user=" + user +
                '}';
    }
}
