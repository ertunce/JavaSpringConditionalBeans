package com.bilgeadam.JavaSpringConditionalBeans;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class CustomCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // Define your condition here
        // For example, check a system property
        return "true".equals(System.getProperty("my.custom.condition"));
    }
}
