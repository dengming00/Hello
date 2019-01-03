package com.maven_panter02.userservice.imp;

import com.maven_panter02.dao.UserDao;
import com.maven_panter02.domain.User;
import com.maven_panter02.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("serviceImp")
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao dao;
    @Override
    public List<User> findAll() {
        List<User> list = dao.findAll();
        return list;
    }
}
