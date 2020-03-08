package com.itmuch.cloud.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationAop {

    @Pointcut("@annotation(com.itmuch.cloud.test.Mylog)")
    public void annotationTest(){ }

    @Around("annotationTest()")
    public Object getAnnotation(ProceedingJoinPoint point) throws Throwable {
        Object proceed = point.proceed();
        System.err.print("1111");
        System.out.print(proceed);


        return proceed;
    }
}
