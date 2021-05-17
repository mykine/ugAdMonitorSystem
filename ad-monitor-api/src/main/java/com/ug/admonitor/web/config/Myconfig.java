package com.ug.admonitor.web.config;

import com.ug.admonitor.web.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 1.配置类里使用@Bean标注在方法上给容器注册组件，默认是单例的
 * 2.配置类本身也是组件
 * 3.proxyBeanMethods：代理bean的方式
 * Full(proxyBeanMethods = true) :
 *      外部调用配置类的方法返回Ioc中的单例bean,
 *      优点:实现组件内单例bean之间的依赖，
 *      缺点：Springboot初始化时会涉及外部调用配置类的方法时会检查对象是否在Ioc内维护的bean，
 *      影响初始化性能
 *
 *
 * little(proxyBeanMethods = false):
 *      外部调用配置类的方法返回new出来的新对象,
 *      优点：不会影响到springboot启动性能,
 *      缺点：无法实现组件内部单例bean之间的依赖
 * */
@Configuration(proxyBeanMethods = true)//告诉SpringBoot这是一个配置类==配置文件
public class Myconfig {

    @Bean //给容器中添加组件，以方法名作为组件id,返回类型就是组件类型
    public Cat littleCat(){
        return new Cat("小猫",1);
    }

    @Bean("tom")//自定义组件id
    public Cat bigCat(){
        return new Cat("tom猫",2);
    }
}
