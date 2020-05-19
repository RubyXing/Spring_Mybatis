package com.xing.servlet;/*
 * @author Xingqilin
 *
 */

import com.xing.pojo.User;
import com.xing.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/allUser")
public class UserServlet extends HttpServlet {

    @Autowired
    UserServiceImpl userService;

    @Override
    public void init() throws ServletException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        userService = (UserServiceImpl)context.getBean("userService");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = userService.listAll();



    }
}
