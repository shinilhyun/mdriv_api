package com.enjoybt.mdriv_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan("com.enjoybt")
public class MdrivApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MdrivApiApplication.class, args);
    }

}

