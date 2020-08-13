package com.zqh.usequartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class UsequartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsequartzApplication.class, args);
    }
}
