package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.decorator.BasketDecorator;
import com.example.demo.decorator.PaperDecorator;
import com.example.demo.decorator.RibbonDecorator;
import com.example.demo.flowerStore.model.Flower;
import com.example.demo.flowerStore.model.FlowerColor;
import com.example.demo.flowerStore.model.FlowerType;

public class DecoratorTests {

    @Test
    public void testBasketDecoratorGetPrice() {
        Flower flower = new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 35, 10);
        BasketDecorator decorator = new BasketDecorator(flower);
        double expResult = 14;

        double actualResult = decorator.getPrice();
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testPaperDecoratorGetPrice() {
        Flower flower = new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 35, 10);
        PaperDecorator decorator = new PaperDecorator(flower);
        double expResult = 23;

        double actualResult = decorator.getPrice();
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testRibbonDecoratorGetPrice() {
        Flower flower = new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 35, 10);
        RibbonDecorator decorator = new RibbonDecorator(flower);
        double expResult = 50;

        double actualResult = decorator.getPrice();
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testBasketDecoratorGetDescription() {
        Flower flower = new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 35, 10);
        BasketDecorator decorator = new BasketDecorator(flower);
        String expResult = "Its a BasketDecorator.";

        String actualResult = decorator.getDescription();
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testPaperDecoratorGetDescription() {
        Flower flower = new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 35, 10);
        PaperDecorator decorator = new PaperDecorator(flower);
        String expResult = "Its a PaperDecorator.";

        String actualResult = decorator.getDescription();
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testRibbonDecoratorGetDescription() {
        Flower flower = new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 35, 10);
        RibbonDecorator decorator = new RibbonDecorator(flower);
        String expResult = "Its a RibbonDecorator.";

        String actualResult = decorator.getDescription();
        assertEquals(expResult, actualResult);
    }

}
