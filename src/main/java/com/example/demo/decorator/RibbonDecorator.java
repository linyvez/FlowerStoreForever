package com.example.demo.decorator;

import com.example.demo.flowerStore.model.Item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class RibbonDecorator extends ItemDecorator {
    
    private Item item;

    public double getPrice() {
        return 40 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return "Its a RibbonDecorator.";
    }
}
