package com.example.demospringboot23;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Period;

@SpringBootApplication
public class DemoSpringboot23Application {

    @Value("${chicken.howlong}")
    private Period chickenHowLong;

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringboot23Application.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> System.out.println(chickenHowLong.getMonths());
    }

}
