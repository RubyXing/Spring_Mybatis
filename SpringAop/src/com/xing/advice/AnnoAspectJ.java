package com.xing.advice;/*
 * @author Xingqilin
 *
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnoAspectJ {

    //    配置切点
//    方法名作为默认ID
//    第一个*，方法前的修饰符
//    括号里加两个点，可以找到带参数或不带参数的方法
    @Pointcut("execution(* com.xing.service.impl.UserServiceImpl.*(..))")
    public void pointC() {

    }

    //      前置通知配置切点
    @Before("pointC() ")
    public void before() {
        System.out.println("前置通知，注解");
    }

    @AfterReturning("pointC()")
    public void after() {
        System.out.println("后置通知，注解");
    }

    @Around("pointC()")
    public void around(ProceedingJoinPoint pj) {
        System.out.println("环绕前执行,注解");

        try {
            pj.proceed();
            System.out.println("环绕后执行,注解");

            Signature signature = pj.getSignature();
            System.out.println(signature.getName() + "执行成功，注解");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("回滚，注解");
        }
    }
}
