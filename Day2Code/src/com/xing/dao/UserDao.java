package com.xing.dao;/*
 * @author Xingqilin
 *
 */

import com.xing.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface UserDao {
    @Select("select * from user;")
    List<User> selectAll();


    @Insert("Insert into user values(#{uid},#{uname},#{upwd})")
    int addUser(User user);
}
