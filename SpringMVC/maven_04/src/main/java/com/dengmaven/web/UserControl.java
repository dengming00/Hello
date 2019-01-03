package com.dengmaven.web;

import com.dengmaven.domain.User;
import com.dengmaven.service.UserService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserControl {
    @Autowired
    private UserService serviceImp;
    /**
     * 查找所有数据
     * @return
     */
    @RequestMapping(value = "/findAll")
    public ModelAndView findAll(){
        List<User> list = serviceImp.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("list",list);
        mv.setViewName("findAll");
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user);
        }
        return mv;

    }
}

