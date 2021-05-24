package com.ug.admonitor.repo.mapper;

import com.ug.admonitor.repo.entity.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {

   public Users findById(Long id);
}
