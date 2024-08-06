package com.unlogged;

import com.unlogged.custom.CustomBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ActuatorDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ActuatorDemoApplication.class, args);

        CustomBean customBean = context.getBean(CustomBean.class);
        System.out.println(customBean.getMessage());
    }

}
