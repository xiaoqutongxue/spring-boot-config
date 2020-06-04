package com.atguigu.springbootconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @ImportResource(locations = {"classpath:beans.xml"}）加载相关的xml
 * 导入Spring配置文件,让配置文件生效
 *
 *
 * SpringBoot推荐使用全注解的方式
 */
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringBootConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigApplication.class, args);
    }

}
