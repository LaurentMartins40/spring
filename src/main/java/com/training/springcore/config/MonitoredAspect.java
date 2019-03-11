package com.training.springcore.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MonitoredAspect {
    @Before("@annotation(Monitored)")
    public void logServiceBeforeCall(JoinPoint jp) {
        System.out.println("Appel finder " + jp.getSignature());
    }
    @After("@annotation(Monitored)")
    public void logServiceAfterCall(JoinPoint jp) {
        System.out.println("Appel finder after " + jp.getSignature());
    }
}
