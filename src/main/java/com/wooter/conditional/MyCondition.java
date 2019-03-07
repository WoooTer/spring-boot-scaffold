package com.wooter.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by taota on 2018/8/31.
 */
public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return true;
//        try {
//            conditionContext.getClassLoader().loadClass("xxx.yyy.MyObject");
//            return true;
//        } catch (ClassNotFoundException e) {
//            return false;
//        }
    }
}
