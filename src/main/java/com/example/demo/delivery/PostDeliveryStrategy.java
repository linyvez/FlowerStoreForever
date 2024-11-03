package com.example.demo.delivery;

import lombok.Getter;

@Getter
public class PostDeliveryStrategy implements Delivery {
    private String deliveryNotification;

    public PostDeliveryStrategy() {
        this.deliveryNotification = "Delivered with simple Post";
    }

    public void deliver() {
        System.out.println("Delivered with simple Post");
    }
}
