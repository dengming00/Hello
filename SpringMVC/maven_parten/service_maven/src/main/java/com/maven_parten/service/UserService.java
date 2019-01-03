package com.maven_parten.service;

import com.maven_parten.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    /**
     * 查找所有
     * @return
     */
    List<User> findAll();
}
