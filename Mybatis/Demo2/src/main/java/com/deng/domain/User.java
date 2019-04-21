package com.deng.domain;

public class User {
    private Integer iD;
    private String name;
    private String pass;
    private String male;

    public User(Integer iD, String name, String pass, String male) {
        this.iD = iD;
        this.name = name;
        this.pass = pass;
        this.male = male;
    }

    public User() {

    }

    public Integer getiD() {

        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return "User{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", male='" + male + '\'' +
                '}';
    }
}
