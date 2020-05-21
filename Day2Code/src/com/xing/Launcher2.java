package com.xing;/*
 * @author Xingqilin
 *
 */

import com.alibaba.fastjson.JSON;
import com.xing.dao.UserDao;
import com.xing.service.UserService;
import com.xing.servlet.UserServlet;
import com.xing.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Launcher2 {
    public static void main(String[] args) {
        Launcher2 l = new Launcher2();
        l.myTest2();
//        l.myTest2();
    }

    private  void myTest1() {
        SqlSession session = MyBatisUtil.getSession();
        UserDao mapper = session.getMapper(UserDao.class);

        System.out.println(mapper.selectAll());
    }

    public void myTest2(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

    }

}
