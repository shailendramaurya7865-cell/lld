package org.example.Factory.FactoryMethod;

import org.example.Factory.PaymentStrategy;
import org.example.Factory.UPIPayment;

public class UPIPaymentProcesser extends PaymentProcesser{
    @Override
    public PaymentStrategy create() {
        return new UPIPayment();
    }
}
