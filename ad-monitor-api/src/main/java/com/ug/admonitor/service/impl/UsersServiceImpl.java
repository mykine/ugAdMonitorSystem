package com.ug.admonitor.service.impl;

import com.ug.admonitor.repo.entity.Users;
import com.ug.admonitor.repo.mapper.UsersMapper;
import com.ug.admonitor.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;

    public Users findUser(Long id) {
        return usersMapper.findById(id);
    }
}
