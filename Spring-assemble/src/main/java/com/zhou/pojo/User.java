package com.zhou.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;


public class User {
    @Resource(name = "cat2")
    private Cat cat;
    @Autowired
    private Dog dog;

    private String str;

    public Cat getCat() {
        return cat;
    }

//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }

    public Dog getDog() {
        return dog;
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

    public void show(){
        System.out.println("主人是"+str);
    }
}
