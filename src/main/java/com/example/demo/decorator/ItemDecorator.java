package com.example.demo.decorator;

import com.example.demo.flowerStore.model.Item;

public abstract class ItemDecorator extends Item {
    public abstract String getDescription();
}
