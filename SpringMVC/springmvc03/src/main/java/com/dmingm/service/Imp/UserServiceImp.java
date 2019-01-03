package com.dmingm.service.Imp;

import com.dmingm.dao.UserDao;
import com.dmingm.domain.User;
import com.dmingm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("USImp")
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao udao;

    /**
     *查询所有
     * @return
     */
    @Override
    public List<User> finalAll() {
        List<User> users = udao.finalAll();
        return users;
    }

    /**
     *保存数据
     * @param user
     */
    @Override
    public void saveUser(User user) {
        System.out.println("保存数据了.....service");

    }
}
