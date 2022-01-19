package com.example.demospringboot23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@ConfigurationPropertiesScan
public class DemoSpringboot23Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringboot23Application.class, args);
    }

//    @RestController
//    class SlowController {
//
//        @GetMapping("/slow")
//        public String slow() throws InterruptedException {
//            System.out.println("got the request");
//            Thread.sleep(1000L);
//            return "slow";
//        }
//    }

}
