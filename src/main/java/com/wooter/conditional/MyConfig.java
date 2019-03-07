package com.wooter.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by taota on 2018/8/31.
 */
@Configuration
public class MyConfig {

    @Bean
    @Conditional(MyCondition.class)
    public MyService myService(){
        System.out.println("config enabled !!!");
        return new MyService();
    }
}
