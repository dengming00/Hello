package com.deng.domain;

public class Man {
    private String mname;
    private Integer mage;

    public Man() {
    }

    @Override
    public String toString() {
        return "Man{" +
                "mname='" + mname + '\'' +
                ", mage=" + mage +
                '}';
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Integer getMage() {
        return mage;
    }

    public void setMage(Integer mage) {
        this.mage = mage;
    }
}
