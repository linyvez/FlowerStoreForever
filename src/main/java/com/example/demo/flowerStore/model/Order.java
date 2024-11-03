package com.example.demo.flowerStore.model;

import java.util.List;

import com.example.demo.delivery.Delivery;
import com.example.demo.payment.Payment;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class Order {
    
    private List<Item> items;
    private Delivery delivery;
    private Payment payment;


    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item: items) {
            price += item.price();
        }
        return price;
    }

    public String processOrder() {
        return "Order is being processed...";
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
        }
    }

}
