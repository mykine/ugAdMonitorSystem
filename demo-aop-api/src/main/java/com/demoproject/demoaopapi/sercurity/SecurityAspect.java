package com.demoproject.demoaopapi.sercurity;

import com.demoproject.demoaopapi.service.AuthService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

    @Autowired
    AuthService authService;

    /**
     * 对标记了AdminOnly注解的方法进行拦截
     * */
    @Pointcut("@annotation(AdminOnly)")
    public void adminOnly(){

    }


    /**
     * 在adminOnly()方法执行之前要插入的操作
     * */
    @Before("adminOnly()")
    public void check(){
        authService.checkAccess();
    }
}
