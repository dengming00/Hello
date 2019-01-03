package com.maven_parten.service.imp;

import com.maven_parten.dao.UserDao;
import com.maven_parten.domain.User;
import com.maven_parten.service.UserService;
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
