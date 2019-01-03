package com.deng.domain;

import java.util.Date;

public class Date01 {
    private Date date;

    @Override
    public String toString() {
        return "Date01{" +
                "date=" + date +
                '}';
    }

    public Date01() {
    }

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
