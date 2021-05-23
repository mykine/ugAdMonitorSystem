package com.ug.admonitor.web.config;

import com.ug.admonitor.web.servlet.MyFilter;
import com.ug.admonitor.web.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRegistConfig {

    @Bean
    public ServletRegistrationBean myservlet(){
        MyServlet myServlet = new MyServlet();
        return new ServletRegistrationBean(myServlet,"/my","/my02");
    }

    @Bean
    public FilterRegistrationBean myFilter(){
        return new FilterRegistrationBean(new MyFilter(),this.myservlet());
    }


}
