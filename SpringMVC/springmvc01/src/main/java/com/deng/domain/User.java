package com.deng.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class User  implements Serializable{
    private String name;
    private String year;
    private String male;
    private Man man;
    List<Man> list;
    Map<String,Man> map;

    public User() {
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public List<Man> getList() {
        return list;
    }

    public void setList(List<Man> list) {
        this.list = list;
    }

    public Map<String, Man> getMap() {
        return map;
    }

    public void setMap(Map<String, Man> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", male='" + male + '\'' +
                ", man=" + man +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
