package com.demoproject.demoaopapi.service;

import com.demoproject.demoaopapi.sercurity.CurrentUserHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public void checkAccess(){
        CurrentUserHolder holder = new CurrentUserHolder();
        String user = CurrentUserHolder.get();
        if(!"admin".equals(user)){
            throw new RuntimeException("用户不是admin");
        }
    }
}
