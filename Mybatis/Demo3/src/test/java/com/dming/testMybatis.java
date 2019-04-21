package com.dming;

import com.dming.dao.UserDao;
import com.dming.domain.QueryVo;
import com.dming.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class testMybatis {
    InputStream in;
    SqlSession session;
    UserDao userDao;
    /**
     * 在测试方法前执行，起初始化作用
     */
    @Before
    public void init()throws Exception {
        //1.获取配置文件
        in = Resources.getResourceAsStream("SqlCofig.xml");
        //2获取工厂SqlSessionFactory
        SqlSessionFactory Factory = new SqlSessionFactoryBuilder().build(in);
        //3.SqlSessionFactory工厂生产SqlSession对象
        session = Factory.openSession();
        //4.用session获取代理对象userMapper
        userDao = session.getMapper(UserDao.class);

    }

    /**
     * 根据id查询，动态的语句
     */
    @Test
    public void finlById(){
        QueryVo vo = new QueryVo(new User(41,null,null,null,null),null,null);
        List<User> users = userDao.finaById(vo);
        for (int i = 0; i < users.size(); i++) {
            User us = users.get(i);
            System.out.println(us);
        }
    }

    /**
     * 根据sex和usrname查询，动态的语句
     */
    @Test
    public void finaBySexandUsername(){
        QueryVo vo = new QueryVo(new User(null,"小二王",null,"男",null),null,null);
        List<User> users = userDao.finaBySexandUsername(vo);
        for (int i = 0; i < users.size(); i++) {
            User us = users.get(i);
            System.out.println(us);
        }
    }

    /**
     * 用where 可以去掉第一个and，则不用写 1 = 1
     */
    @Test
    public void finl(){
        QueryVo vo = new QueryVo(new User(45, null, null, null, "北京金燕龙"), null,null);
        List<User> finl = userDao.finl(vo);
        for (int i = 0; i < finl.size(); i++) {
            User user = finl.get(i);
            System.out.println(user);
        }


    }

    /**
     * id条件为等于in(41,46,48)
     */
    @Test
    public void foreach(){
        List<Integer> list= new ArrayList<>();
        list.add(41);
        list.add(46);
        list.add(48);
        QueryVo vo = new QueryVo(null, list,null);
        List<User> li = userDao.foreachBy(vo);
        for (int i = 0; i < list.size(); i++) {
            User user = li.get(i);
            System.out.println(user);
        }

    }

    /**
     * 向数据库中添加多条数据
     */
    @Test
    public void insert(){
       List<User> li = new ArrayList<>();
        Date date = new Date(90000);
        User u1 = new User(null, "小样", date, "男", "江西");
        User u2 = new User(null, "大样", date, "男", "南昌");
        User u3 = new User(null, "中样", date, "男", "抚州");
        li.add(u1);
        li.add(u2);
        li.add(u3);
        QueryVo vo = new QueryVo(null,null,li);
        userDao.insert(vo);
    }



    /**
     * 最后执行，起关闭资源作用
     */
    @After
    public void destory() throws IOException {
        //事务回滚
        session.commit();
        if (session!=null){
            session.close();
        }

        if (in!=null){
            in.close();
        }
    }
}
