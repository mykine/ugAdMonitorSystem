package com.ug.admonitor.web;

import com.ug.admonitor.web.bean.Cat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //1.返回IOC容器
       ConfigurableApplicationContext ioc = SpringApplication.run(Application.class,args);

//        //2.查看容器中的组件bean名字
//        String[] names = ioc.getBeanDefinitionNames();
//        for (String name :names
//             ) {
//            System.out.println("name="+name);
//        }
//
//        Cat littleCat1 = ioc.getBean("littleCat",Cat.class);
//        System.out.println("name="+littleCat1.getName());
    }
}
