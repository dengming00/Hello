package com.dmingm.web;

import com.dmingm.domain.User;
import com.dmingm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/User")
public class ControllerTest {
    @Autowired
    private UserService USImp;
    @RequestMapping(path = "/finalAll")
    public ModelAndView finalAll(){
        ModelAndView mv = new ModelAndView();
        List<User> list = USImp.finalAll();
        mv.setViewName("finalAll");
        mv.addObject("list",list);
        return mv;
    }



}
