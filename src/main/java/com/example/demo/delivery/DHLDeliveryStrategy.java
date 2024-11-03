package com.example.demo.delivery;

import lombok.Getter;

@Getter
public class DHLDeliveryStrategy implements Delivery {
    private String deliveryNotification;

    public DHLDeliveryStrategy() {
        this.deliveryNotification = "Delivered with DHL";
    }

    public void deliver() {
        System.out.println("Delivered with DHL");
    }
}
