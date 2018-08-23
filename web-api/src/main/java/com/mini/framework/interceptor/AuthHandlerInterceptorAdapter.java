package com.mini.framework.interceptor;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户验证拦截器
 */
public class AuthHandlerInterceptorAdapter extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // 是否接受页面跳转
        boolean accept = true;
//        if (handler.getClass().isAssignableFrom(HandlerMethod.class)){
//            //登陆验证
//        }
//        if (!accept){
//            // 跳转到登录页面
//            response.sendRedirect("/logout");
//        }
        return accept;
    }
}
