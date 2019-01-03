package com.deng.Utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 将日期的字符串转换为日期格式
 */
public class StringToDate implements Converter<String,Date> {
    /**
     * String s为传入的日期
     * @param s
     * @return
     */
    @Override
    public Date convert(String s) {
        if (s==null&&!(s.length()>0)){
            throw new RuntimeException("未输入，请输入日期");
        }

    DateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
            date = sd.parse(s);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }
}
