package com.learnspring.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
    var orderService = context.getBean(OrderService.class);
         orderService.placeorder();   public static void main(String[] args) {
    }

}
