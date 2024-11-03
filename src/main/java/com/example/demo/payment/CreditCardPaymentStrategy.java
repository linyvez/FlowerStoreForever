package com.example.demo.payment;

import lombok.Getter;

@Getter
public class CreditCardPaymentStrategy implements Payment {
    private String paymentNotification;

    public CreditCardPaymentStrategy() {
        this.paymentNotification = "Paying with credit card.";
    }
    
    public void pay(double price) {
        System.out.println("Paying with credit card: " + price);
    }
}