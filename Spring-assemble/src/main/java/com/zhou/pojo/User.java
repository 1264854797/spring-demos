package com.zhou.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 相当于配置文件中 <bean id="user" class="当前注解的类"/>
 */
@Component("user")
public class User {
    @Resource
    private Cat cat;
    @Resource
    private Dog dog1;

    /**
     * 相当于配置文件中 <property name="str" value="小周"/>
      */
    @Value("小周")
    private String str;

    public Cat getCat() {
        return cat;
    }

//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }

    public Dog getDog() {
        return dog1;
    }

//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }

    public String getStr() {
        return str;
    }

//    public void setStr(String str) {
//        this.str = str;
//    }

    public void show() {
        System.out.println("主人是" + str);
    }
}
