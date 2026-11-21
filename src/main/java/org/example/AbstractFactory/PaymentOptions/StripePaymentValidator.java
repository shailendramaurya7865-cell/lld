package org.example.AbstractFactory.PaymentOptions;

public class StripePaymentValidator implements PaymentValidator{
    @Override
    public void validate() {
        System.out.println("StripePaymentValidator.validate");
    }
}
