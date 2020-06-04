package com.atguigu.springbootconfig.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/*
 *1. 将配置文件中的每个属性的值，映射到这个组件中
 * @ConfigurationProperties：告诉Springboot将本类中的所有属性和配置文件中相关配置进行绑定
 * prefix = "person":指的是配置文件中person下的属性进行一一映射
 *
 * 只有这个组件是容器中的组件，才能使用@ConfigurationProperties功能
 * @Component注解意思是容器中的组件
 *
 * 2.@Value()赋值
 * // @Value("${person.last-name}")
    private String lastName;
    *     //@Value("#{11*2}")
    private Integer age;
    //@Value("true")
    private Boolean boss;
 *
 *  @PropertySource:用于加载指定的配置文件
 *  @PropertySource(value = {"classpath:person.properties"})
 *
 *
 * @ImportResource:导入Spring的配置文件，让配置文件里面的内容生效
 */
//@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

   // @Value("${person.last-name}")
    private String lastName;

    //@Value("#{11*2}")
    private Integer age;
    //@Value("true")
    private Boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
