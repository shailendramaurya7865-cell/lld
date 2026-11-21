package org.example.AbstractFactory.PaymentOptions;

public class Main {
    public static void main(String[] args) {
        PaymentManager manager = new PaymentManager(new PaypalFactory());
        manager.doPayment();
        manager.validatePayment();
        manager.processRefund();
    }
}
