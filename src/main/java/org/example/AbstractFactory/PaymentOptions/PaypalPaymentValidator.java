package org.example.AbstractFactory.PaymentOptions;

public class PaypalPaymentValidator implements PaymentValidator{
    @Override
    public void validate() {
        System.out.println("PaypalPaymentValidator.validate");
    }
}
