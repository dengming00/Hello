package com.maven_parten.web;

import com.maven_parten.domain.User;
import com.maven_parten.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserControl {
    @Autowired
    @Qualifier("serviceImp")
    private UserService serviceImp;

    /**
     * 查询所有
     */
    @RequestMapping("/findAll")
    public  ModelAndView findAll(){
        List<User> list = serviceImp.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("list",list);
        mv.setViewName("findAll");
        return mv;
    }

}
