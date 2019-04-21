package com.deng;

import com.deng.dao.UserMapper;
import com.deng.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 测试类
 */
public class testmybatis {
    /**
     * 测试查找所有 finlAll()
     * @throws IOException
     */
    @Test
    public void finlAll() throws Exception {
        //1.获取配置文件
        InputStream in = Resources.getResourceAsStream("SqlConfig.xml");
        //2获取工厂SqlSessionFactory
        SqlSessionFactory Factory = new SqlSessionFactoryBuilder().build(in);
        //3.SqlSessionFactory工厂生产SqlSession对象
        SqlSession session = Factory.openSession();
        //4.用session获取代理对象userMapper
        UserMapper userMapper = session.getMapper(UserMapper.class);
        //5.执行方法
        List<User> users = userMapper.finlAll();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            System.out.println(user);
        }
        //6.关闭资源
        session.close();
        in.close();
    }

}
