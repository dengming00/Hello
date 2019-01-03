package com.ming.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestInterceptor2 implements HandlerInterceptor {

    /**
     * 1. preHandle方法是controller方法执行前拦截的方法
     *     1. 可以使用request或者response跳转到指定的页面
     *     2. return true放行，执行下一个拦截器，如果没有拦截器，执行controller中的方法。
     *     3. return false不放行，不会执行controller中的方法。
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器前2");
        return true;
    }

    /**
     * 2. postHandle是controller方法执行后执行的方法，在JSP视图执行前。
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截器中2");
    }

    /**
     * ostHandle方法是在JSP执行后执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("JSP执行后执行");
        System.out.println("拦截器后2");
    }
}
