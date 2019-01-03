package com.dmingm.test;

import com.dmingm.dao.UserDao;
import com.dmingm.domain.User;
import com.dmingm.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestCalss {
    @Autowired
    private UserService USImp;

    /**
     * 测试查询所有
     */
    @Test
    public void finalAll(){
        List<User> users = USImp.finalAll();
    }

    /**
     * 测试mybatis框架
     */
    @Test
    public void mybatisfinal() throws Exception {
// 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatisconfig.xml");
// 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
// 创建sqlSession对象
        SqlSession session = factory.openSession();
// 获取代理对象
        UserDao dao = session.getMapper(UserDao.class);
// 调用查询的方法
        List<User> list = dao.finalAll();
        for (User user : list) {
            System.out.println(user);
        }
// 释放资源
        session.close();
        inputStream.close();
    }
}
