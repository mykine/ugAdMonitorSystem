package com.ug.admonitor.web.controller;

import com.ug.admonitor.repo.entity.Users;
import com.ug.admonitor.service.UsersService;
import com.ug.admonitor.web.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping("/findUser/{id}")
    public Users findUser(@PathVariable("id") Long id){
        return usersService.findUser(id);
    }

}
