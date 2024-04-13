package com.SpringBootLearning.JavaBeanConfig.Config;

import com.SpringBootLearning.JavaBeanConfig.Common.Coach;
import com.SpringBootLearning.JavaBeanConfig.Common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
