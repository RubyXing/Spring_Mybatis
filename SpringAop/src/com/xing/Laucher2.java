package com.xing;/*
 * @author Xingqilin
 *
 */

import com.xing.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Laucher2 {
    public static void main(String[] args) {
        Laucher2 l = new Laucher2();
        l.method3();
    }

    private void method1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService bean = context.getBean(UserService.class);
//        bean.addUser();
//        System.out.println(bean.getClass());
    }

    private void method2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-aspectj.xml");
        UserService bean = context.getBean(UserService.class);
        bean.addUser();
//        System.out.println(bean.getClass());
    }

    private void method3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-anno.xml");
        UserService bean = context.getBean(UserService.class);
        bean.addUser();
//        System.out.println(bean.getClass());
    }


}
