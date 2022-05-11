package me.rootsong.designpatterns;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    
    @Bean
    public String hello() {
        return "hello";
    }
}
