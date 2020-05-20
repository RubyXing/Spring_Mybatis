package com.xing.advice;/*
 * @author Xingqilin
 *
 */

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdvice implements MethodBeforeAdvice {

    /**
     * 参数1：要执行的方法
     * 参数2：方法的参数
     * 参数3：被代理对象
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {

        System.out.println("开启事务！");
    }
}
