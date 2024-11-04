package com.example.demo.flowerStore.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlowerBucket extends Item {

    private List<Flower> flowers;

    public FlowerBucket() {
        this.flowers = new ArrayList<>();
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (Flower flower: flowers) {
            price += flower.getPrice();
        }
        return price;
    }

    public boolean searchFlower(Flower flower) {
        for (Flower flower_: flowers) {
            if (flower.matches(flower_)) {
                return true;
            }
        }
        return false;
    }

    public void addFlowers(List<Flower> newFlowers) {
        for (Flower flower: newFlowers) {
            flowers.add(flower);
        }
    }
    
}
