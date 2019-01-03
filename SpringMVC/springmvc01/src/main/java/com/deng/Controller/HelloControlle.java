package com.deng.Controller;
import com.deng.domain.Date01;
import com.deng.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloControlle {
    @RequestMapping(path = "/hello")
    public String hello(){
        return "login";
    }

    /**
     * 测试RequestMapping注解中的属性
     * @return
     */
    @RequestMapping(path = "delete",method = RequestMethod.GET ,params ="name")
    public String Userdelete(){
        System.out.println();
        return "delete";
    }

    /**
     * 请求参数的绑定
     * @return
     */
    @RequestMapping(path = "/update")
    public String update(String username,@RequestParam(value = "age",required = true)Integer year){
        System.out.println("姓名："+username);
        System.out.println("年龄："+year);
        return "update";
    }

    /**
     * 封装实体类，javaBean
     * @return
     */
    @RequestMapping(path = "/insert")
    public void insert(User user, Date01 date01){
        System.out.println(user);
        System.out.println(date01);
    }

    /**
     * 日期格式
     * @param date
     */
    @RequestMapping("/DateTest")
    public String DateTest(Date01 date){
        System.out.println(date);
        return "Date";
    }



}
