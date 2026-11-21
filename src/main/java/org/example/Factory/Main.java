package org.example.Factory;

public class Main {
    static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
//        PaymentStrategy paymentStrategy = new UPIPayment();
//        paymentService.setPaymentStrategy(paymentStrategy);

        PaymentStrategy paymentStrategy = PaymentStrategyFactory.create("UPI");
        paymentService.setPaymentStrategy(paymentStrategy);
        paymentService.makePayment();
    }
}
