package com.ug.admonitor.service;

import com.ug.admonitor.repo.entity.Users;
import org.springframework.stereotype.Service;

@Service
public interface UsersService  {

     Users findUser(Long id);
}
