package com.dming.domain;

public class UserAccount extends Account {
    private String username;
    private String address;
    private String sex;

    @Override
    public String toString() {
        return "UserAccount{"+super.toString()+
                "usrename='" + username + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getUsrename() {
        return username;
    }

    public void setUsrename(String usrename) {
        this.username = usrename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
