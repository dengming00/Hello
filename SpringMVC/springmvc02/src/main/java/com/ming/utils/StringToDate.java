package com.ming.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将用户输入的日期yyyy-MM-dd字符串，转换为日期格式
 */
public class StringToDate implements Converter<String,Date> {
    @Override
    public Date convert(String s) {
        if (s==null&&!(s.length()>0)){
            throw new RuntimeException("未输入，请输入日期");
        }
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
            date = sd.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
