package org.example.Factory.FactoryMethod;

import org.example.Factory.PaymentStrategy;

public abstract class PaymentProcesser {

    public abstract PaymentStrategy create();

    public void processPayment() {
        PaymentStrategy paymentStrategy = create();
        paymentStrategy.doPayment();
    }
}
