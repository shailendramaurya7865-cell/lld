package org.example.AdapterDesignPattern.TravelBooking.Adapter;

import org.example.AdapterDesignPattern.TravelBooking.Adaptee.PaymentGateWay;
import org.example.AdapterDesignPattern.TravelBooking.FastPayClient;

public class FastPayAdapter implements PaymentGateWay {
    public FastPayClient fastPayClient;

    public FastPayAdapter(FastPayClient fastPayClient) {
        this.fastPayClient = fastPayClient;
    }

    @Override
    public String pay(double amount) {
        return fastPayClient.makePayment(amount);
    }
}
