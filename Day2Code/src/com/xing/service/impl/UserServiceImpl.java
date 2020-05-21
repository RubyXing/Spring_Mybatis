package com.xing.service.impl;/*
 * @author Xingqilin
 *
 */

import com.xing.dao.UserDao;
import com.xing.pojo.User;
import com.xing.service.UserService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public class UserServiceImpl implements UserService {
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Transactional
    @Override
    public int addUser(User user) {

        int i = userDao.addUser(new User(3003, "ABC", "123456"));

//        System.out.println(1/0);
        return i;
    }
}
