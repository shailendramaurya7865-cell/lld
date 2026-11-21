package org.example.Factory.FactoryMethod;

import org.example.Factory.CreditCardPayment;
import org.example.Factory.PaymentStrategy;

public class CreditCardPaymentProcesser extends PaymentProcesser{
    @Override
    public PaymentStrategy create() {
        return new CreditCardPayment();
    }
}
