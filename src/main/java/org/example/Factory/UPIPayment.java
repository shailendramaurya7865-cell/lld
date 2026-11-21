package org.example.Factory;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void doPayment() {
        System.out.println("UPIPayment.doPayment");
    }
}
