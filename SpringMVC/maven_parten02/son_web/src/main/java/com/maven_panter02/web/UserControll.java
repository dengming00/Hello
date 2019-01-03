package com.maven_panter02.web;

import com.maven_panter02.domain.User;
import com.maven_panter02.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserControll {
    @Autowired
    @Qualifier("serviceImp")
    private UserService serviceImp;

    /**
     * 查找所有
     *
     * @return
     */
    @RequestMapping(value = "/findAll")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView();
        List<User> list = serviceImp.findAll();
        mv.addObject("list", list);
        mv.setViewName("findAll");
        return mv;
    }
}
