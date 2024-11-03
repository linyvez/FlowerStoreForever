package com.example.demo.flowerStore.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item {
    private double price;
    private String description;

    public abstract double price();

    public String getDescription() {
        return this.getClass().getSimpleName();
    }
}
