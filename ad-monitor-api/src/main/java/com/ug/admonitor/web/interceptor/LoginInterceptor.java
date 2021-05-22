package com.ug.admonitor.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 拦截器
 * 1.配置好要拦截哪些请求
 * 2.把这些配置放到容器中
 * */
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 目标方法执行之前进行拦截
     * */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object loginUser =  session.getAttribute("loginUser");
        if(null != loginUser){
            return true;//放行
        }
        session.setAttribute("msg","请先登录");
        response.sendRedirect("/needLogin");
        //拦截
        return false;
    }

    /**
     * 目标方法执行之后进行拦截
     * */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 页面渲染之后
     * */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
