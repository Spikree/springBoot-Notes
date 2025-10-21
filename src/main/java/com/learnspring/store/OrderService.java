package com.learnspring.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService, int x) {
        System.out.println("Default Constructor order service");
    }

    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeorder() {
        paymentService.processPayment(10);
    }
}
