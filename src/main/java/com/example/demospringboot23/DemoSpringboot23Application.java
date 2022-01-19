package com.example.demospringboot23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
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
