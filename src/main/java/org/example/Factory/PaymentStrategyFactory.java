package org.example.Factory;

public class PaymentStrategyFactory {

    public static PaymentStrategy create(String type) {

        if (type.equals("UPI")) {
            return new UPIPayment();
        }

        if (type.equals("CARD")) {
            return new CreditCardPayment();
        }

        throw new IllegalArgumentException("Invalid payment type");
    }}
