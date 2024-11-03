package com.example.demo.decorator;

import com.example.demo.flowerStore.model.Item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class BasketDecorator extends ItemDecorator {
    
    private Item item;

    public double getPrice() {
        return 4 + item.price();
    }

    @Override
    public String getDescription() {
        return "Its a BasketDecorator.";
    }
}
