package com.ckbs.csp.sb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  //P122
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        System.out.println("SpringBoot main Start....");
        SpringApplication.run(Application.class,args);



    }


}
