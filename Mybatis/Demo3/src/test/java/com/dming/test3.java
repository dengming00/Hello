package com.dming;

import com.dming.dao.RoleDao;

import com.dming.domain.User1;
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


public class test3 {
    InputStream in;
    SqlSession session;
    RoleDao roledao;
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
        //4.用session获取配置文件的RoleDao.xml代理对象 roledao
        roledao = session.getMapper(RoleDao.class);
    }

    /**
     * 多对多查找
     */
  @Test
    public void finlAll(){
      List<User1> user1s = roledao.finlAll();
      for (int i = 0; i < user1s.size(); i++) {
          User1 user1 = user1s.get(i);

          System.out.println(user1);
      }

  }
  @Test
  public void fialTwo(){
      List<User1> user1s = roledao.finTwo();
      for (int i = 0; i < user1s.size(); i++) {
          User1 user1 = user1s.get(i);
          System.out.println(user1);
      }
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
