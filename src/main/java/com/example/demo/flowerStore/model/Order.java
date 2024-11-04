package com.example.demo.flowerStore.model;

import java.util.List;

import com.example.demo.delivery.Delivery;
import com.example.demo.payment.Payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor
public class Order {
    
    private List<Item> items;
    private Delivery delivery;
    private Payment payment;

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item: items) {
            price += item.getPrice();
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
