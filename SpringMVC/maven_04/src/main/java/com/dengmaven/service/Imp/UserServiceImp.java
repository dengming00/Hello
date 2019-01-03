package com.dengmaven.service.Imp;

import com.dengmaven.dao.UserDao;
import com.dengmaven.domain.User;
import com.dengmaven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserDao userdao;
    @Override
    public List<User> findAll() {
        List<User> list = userdao.findAll();
        return list;
    }
}
