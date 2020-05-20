package com.xing.service;/*
 * @author Xingqilin
 *
 */


import com.xing.pojo.User;

import java.util.List;

public interface UserService {

    List<User> selectAll();

    int addUser(User user);
}
