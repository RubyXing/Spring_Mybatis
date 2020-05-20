package com.xing.advice;/*
 * @author Xingqilin
 *
 */

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice {
    /**
     * 参数
     * 1：方法返回结果
     */

    @Override
    public void afterReturning(Object result, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("提交事务");
    }
}
