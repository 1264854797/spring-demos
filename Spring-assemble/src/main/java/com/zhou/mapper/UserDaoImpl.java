package com.zhou.mapper;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    public void shout() {
        System.out.println("dao层测试!");
    }
}
