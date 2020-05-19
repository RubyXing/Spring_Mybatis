package com.xing.service.impl;/*
 * @author Xingqilin
 *
 */

import com.xing.dao.UserDao;
import com.xing.pojo.User;

import java.util.List;

public class UserServiceImpl {
    UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao= userDao;
    }

    public List<User> listAll(){
        return userDao.selectAll();
    }
}
