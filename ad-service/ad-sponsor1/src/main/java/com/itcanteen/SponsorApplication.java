package com.itcanteen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class SponsorApplication {
    public static void main(String[] args){
        SpringApplication.run(SponsorApplication.class,args);
    }
}
