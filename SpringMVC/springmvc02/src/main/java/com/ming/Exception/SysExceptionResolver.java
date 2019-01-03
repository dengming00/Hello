package com.ming.Exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理器
 */
public class SysExceptionResolver implements HandlerExceptionResolver {

    /**
     * 处理异常的业务逻辑,Exception e为抛出的异常
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
       SysException Syse=null;
       if (e instanceof SysException){
           Syse=(SysException)e;//强转
       }
        else{
           Syse=new SysException("系统正在维护");
       }
        ModelAndView mv = new ModelAndView();
       //存入键值对，
       mv.addObject("message",Syse.getMessage());
       //跳转到该页面
       mv.setViewName("error");
        return mv;
    }
}
