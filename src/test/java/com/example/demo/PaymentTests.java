package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.payment.PayPalPaymentStrategy;

public class PaymentTests {
    
    @Test
    public void testPaypalNotification() {
        PayPalPaymentStrategy payment = new PayPalPaymentStrategy();
        String expResult = "Paying with PayPal.";

        String actualResult = payment.getPaymentNotification();
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testCreditCardNotification() {
        CreditCardPaymentStrategy payment = new CreditCardPaymentStrategy();
        String expResult = "Paying with credit card.";

        String actualResult = payment.getPaymentNotification();
        assertEquals(expResult, actualResult);
    }

}
