package org.example.Factory;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void doPayment() {
        System.out.println("CreditCardPayment.doPayment");
    }
}
