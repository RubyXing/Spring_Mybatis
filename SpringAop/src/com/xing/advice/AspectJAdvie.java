package com.xing.advice;/*
 * @author Xingqilin
 *
 */

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class AspectJAdvie {
    public void before() {
        System.out.println("Aspect开启事务");
    }

    public void after() {
        System.out.println("Aspect关闭事务");
    }

    public void exc() {
        System.out.println("Aspect异常处理,回滚");
    }

    //    环绕通知
    public void around(ProceedingJoinPoint pj) {
        System.out.println("环绕前执行……");

        try {
            pj.proceed();
            System.out.println("环绕后执行");

            Signature signature = pj.getSignature();
            System.out.println(signature.getName() + "执行成功");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("回滚");
        }
    }
}
