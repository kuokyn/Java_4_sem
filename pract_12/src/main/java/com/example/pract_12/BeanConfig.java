package com.example.pract_12;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
class BeanConfig {

    @Bean
    public Student student() {
        return new Student();
    }

    @Bean
    public Hashing hashing() {
        return new Hashing();
    }

}
