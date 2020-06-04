package com.atguigu.springbootconfig;

import com.atguigu.springbootconfig.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;


    // ioc.containsBean("helloService");指的是有没有helloService这个配置文件   （也就是 bean）
    @Test
    public void textHelloService(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

    @Test
    public void contextLoads(){
        System.out.println(person);
    }



}


