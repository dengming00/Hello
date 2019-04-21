package com.dming;

import com.dming.dao.UserMapper;
import com.dming.domain.Account;
import com.dming.domain.User;
import com.dming.domain.UserAccount;
import com.dming.domain.UserAccount2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test2 {
    InputStream in;
    SqlSession session;
    UserMapper usermapper;
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
        //4.用session获取代理对象usermapper
        usermapper = session.getMapper(UserMapper.class);
    }

    /**
     * 查询两个表中的内容一对一
     */
    @Test
    public void finlAll(){
        List<Account> accounts = usermapper.finlAll();
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            System.out.println(account);
        }
    }


    /**
     * 一对一查找
     */
    @Test
    public void finlOne(){
        List<UserAccount> userAccounts = usermapper.finlOne();
        for (int i = 0; i < userAccounts.size(); i++) {
            UserAccount userAccount = userAccounts.get(i);
            System.out.println(userAccount);
        }
    }

    /**
     * 一对多查询方式一
     */
    @Test
    public void finlTwo(){
        List<User> list = usermapper.finlTwo();
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user);
            if (i==list.size()-1){
                User user1 = list.get(i);
                for (int j = 0; j < list.size(); j++) {
                    User user2 = list.get(j);
                    System.out.println(user2);
                }
            }

        }
    }

    /**
     * 一对多方式二
     */
    @Test
    public void finlTwo2(){
        List<UserAccount2> list = usermapper.finlTwo2();
        for (int i = 0; i < list.size(); i++) {
            UserAccount2 user = list.get(i);
            System.out.println(user);
        }
    }
    public void finAthree(){

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
