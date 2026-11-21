package org.example.AbstractFactory.PaymentOptions;

public class RazorpayPaymentValidator implements PaymentValidator{
    @Override
    public void validate() {
        System.out.println("RazorpayPaymentValidator.validate");
    }
}
