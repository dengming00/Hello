package com.ming.controller;

import com.ming.Exception.SysException;
import com.ming.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 返回类型的测试
 */
@Controller
public class TestController {
    /**
     * 无返回值的类型
     * @param request
     * @param response
     */
    @RequestMapping("/textvoid")
    public void textVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("textvoid无返回值可以直接。转发或重定向或直接响应");
        //转发
        request.getRequestDispatcher("/WEB-INF/pages/textvoid.jsp").forward(request,response);

    }
    /**
     * 无返回值的类型
     * @param request
     * @param response
     */
    @RequestMapping("/textvoid2")
    public void textVoid2(HttpServletRequest request, HttpServletResponse response) throws Exception {

        //重定向
        //response.sendRedirect(request.getContextPath()+"/textvoid2.jsp");
        //直接返回页面
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("你好");
        return;
    }

    /**
     * ModelAndView测试
     * @return
     */
    @RequestMapping(path = "/modelAndVie")
    public ModelAndView textModelAndVie(){
        ModelAndView mv = new ModelAndView();
        //模拟从带护具库中查找用户信息
        User user = new User();
        user.setName("张三");
        user.setAge(22);
        user.setMale("男");
        //添加对象到ModelAndView mv中
        mv.addObject("user",user);
        //跳转到User页面
        mv.setViewName("User");
        return mv;
    }

    /**
     * springmvc中的转发或重定向
     * @return
     */
    @RequestMapping(value = "/forward")
    public String TestForward(){
        //return "forward:/WEB-INF/pages/forward.jsp";
        return "redirect:/redirect.jsp";
    }

    /**
     * 模拟ajax和json
     * @param user
     * @return
     */
    @RequestMapping(path = "/testjson")
    public @ResponseBody User Json(@RequestBody User user){
        System.out.println(user);
        User u = new User();
        u.setName("王五");
        u.setAge(200);
        u.setMale("女");
        return u;
    }

    /**
     * 异常处理
     * @return
     */
    @RequestMapping("testException")
    public String testException() throws SysException{
        //模拟异常
        try {
            int a=100/0;
        } catch (Exception e) {
            throw new SysException("自定义异常");
        }
        return "Exception";
    }

    /**
     * 拦截器测试
     * @return
     */
    @RequestMapping(value = "interceptor")
    public String TestInterceptor(){
        System.out.println("controller中方法执行了");
        return "Interceptor";
    }

}
