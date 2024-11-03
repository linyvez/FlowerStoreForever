package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.delivery.PostDeliveryStrategy;

public class DeliveryTests {

    @Test
    public void testPaypalNotification() {
        DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
        String expResult = "Delivered with DHL";

        String actualResult = delivery.getDeliveryNotification();
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testCreditCardNotification() {
        PostDeliveryStrategy payment = new PostDeliveryStrategy();
        String expResult = "Delivered with simple Post";

        String actualResult = payment.getDeliveryNotification();
        assertEquals(expResult, actualResult);
    }
}
