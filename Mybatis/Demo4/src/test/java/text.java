import com.dengming.dao.UserDao;
import com.dengming.domain.Account;
import com.dengming.domain.User;
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


public class text {
    InputStream in;
    SqlSession session;
    UserDao dali;
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
        //4.用session获取代理对象usermapper
        dali = session.getMapper(UserDao.class);
    }

    @Test
    public void finlAll(){
        List<Account> accounts = dali.finlAccount();
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            System.out.println(account);
            System.out.println(account.getUser());
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
