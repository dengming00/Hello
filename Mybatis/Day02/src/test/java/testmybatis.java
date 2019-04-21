import com.deng.dao.UserMapper1;
import com.deng.domain.Param;
import com.deng.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.beans.Transient;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 测试类
 */
public class testmybatis {
    InputStream in;
    SqlSession session;
    UserMapper1 userMapper;
    User user=null;
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
       userMapper = session.getMapper(UserMapper1.class);
        user=new User(7,"0000","0000","男");
    }
    /**
     * 1.测试查找所有 finlAll()
     * @throws IOException
     */
    @Test
    public void finlAll() throws Exception {
        //5.执行方法
        List<User> users = userMapper.finlAll();
        System.out.println(users);

    }

    /**
     * 2.查找一条数据finlOne()
     */
    @Test
    public void finlOne(){
        User user = userMapper.finlOne(4);
        System.out.println(user);

    }

    /**
     * 向数据库中添加数据
     */
    @Test
    public void add(){
        userMapper.add(user);
    }

    /**
     * 修改数据
     */
    @Test
    public void update(){
        userMapper.update(user);
    }

    /**
     * 根据id来删除数据
     */
    @Test
    public void delete(){
        userMapper.delete(7);
    }

    /**
     * 模糊查询
     */
    @Test
    public void likeSelect(){
        List<User> list = userMapper.likeSelect("江");
        System.out.println(list);
    }

    /**
     * 获取用户数据总数
     */
    @Test
    public void sum(){
        Integer sum = userMapper.sum();
        System.out.println(sum);
    }

    /**
     * 包装参数在类Param中
     */
    @Test
    public void selectParam(){
        User user=new User();
        user.setId(4);
        Param p = new Param(user);
        User us = userMapper.selectParam(p);
        System.out.println(us);
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
