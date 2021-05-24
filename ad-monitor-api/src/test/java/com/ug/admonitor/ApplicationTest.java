package com.ug.admonitor;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@Slf4j
@SpringBootTest
public class ApplicationTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void sqlTest(){
        Long count = jdbcTemplate.queryForObject("select count(id) from t_users ",Long.class);
        log.info("count={}",count);
    }

    @Test
    void sqlTest2(){
        Long count = 999L;
        log.info("count={}",count);
    }
}
