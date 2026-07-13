package com.library.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.library.service.BookService.*(..))")
    public void logServiceMethod(JoinPoint joinPoint) {
        System.out.println("[AOP] Before service method: " + joinPoint.getSignature().getName());
    }

    @Before("execution(* com.library.repository.BookRepository.*(..))")
    public void logRepositoryMethod(JoinPoint joinPoint) {
        System.out.println("[AOP] Before repository method: " + joinPoint.getSignature().getName());
    }
}
