package com.zhou.service;

import com.zhou.mapper.UserDao;
import com.zhou.mapper.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void shout() {
        userDao.shout();
    }


}
