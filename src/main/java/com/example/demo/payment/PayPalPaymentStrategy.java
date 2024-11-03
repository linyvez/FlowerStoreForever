package com.example.demo.payment;

import lombok.Getter;

@Getter
public class PayPalPaymentStrategy implements Payment {
    private String paymentNotification;

    public PayPalPaymentStrategy() {
        this.paymentNotification = "Paying with PayPal.";
    }

    public void pay(double price) {
        System.out.println("Paying with PayPal: " + price);;
    }
}