package com.bilgeadam.JavaSpringConditionalBeans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Service
@Conditional(CustomCondition.class)
public class MyService {

    @PostConstruct
    public void init() {
        System.out.println("MyService is initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("MyService is destroyed");
    }
}
