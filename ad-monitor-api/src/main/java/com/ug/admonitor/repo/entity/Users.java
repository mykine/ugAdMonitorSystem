package com.ug.admonitor.repo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Users {
    private Long id;
    private Integer age;
    private Integer gender;
    private String name;
    private String create_time;
    private String update_time;
}
