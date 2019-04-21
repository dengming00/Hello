package com.deng;

import com.deng.dao.UserDao;
import com.deng.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class test {
    InputStream in;
    SqlSession session;
    UserDao userDao;
    /**
     * 在测试方法前执行，起初始化作用
     */
    @Before
    public void init()throws Exception {
        //1.获取配置文件
        in = Resources.getResourceAsStream("SqlConfig.xml");
        //2获取工厂SqlSessionFactory
        SqlSessionFactory Factory = new SqlSessionFactoryBuilder().build(in);
        //3.SqlSessionFactory工厂生产SqlSession对象
        session = Factory.openSession();
        //4.用session获取代理对象userMapper
        userDao = session.getMapper(UserDao.class);

    }

    /**
     * 查找所有
     */
    @Test
    public void finlAll(){
        List<User> list = userDao.finlAll();
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user);
        }

    }

    /**
     * 添加数据后，返回id
     */
    @Test
    public void insertId(){
        User user = new User();
        user.setName("9999");
        user.setPass("9999");
        user.setMale("9999");
        System.out.println(user);
        int insert = userDao.insert(user);
        System.out.println(user);

    }

    /**
     * 最后执行，起关闭资源作用
     */
    @After
    public void destory() throws Exception {
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
