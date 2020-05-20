package com.xing.service.impl;/*
 * @author Xingqilin
 *
 */

import com.xing.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        System.out.println("执行插入数据！");
//        int i = 1/0;

    }
}
