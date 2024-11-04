package com.example.demo.flowerStore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @Entity @AllArgsConstructor @NoArgsConstructor
public class Flower extends Item {

    @Id
    private FlowerType flowerType;
    private FlowerColor color;
    private double sepalLength;
    private double price;

    public String getColor() {
        return color.toString();
    }

    public boolean matches(Flower other) {
        if (flowerType != other.flowerType ||
        sepalLength != other.sepalLength ||
        price != other.price ||
        color != other.color) {
            return false;
        }
        return true;
    }

    @Override
    public double getPrice() {
        return price;
    }

}