package org.example.AdapterDesignPattern.TravelBooking;

//this cant be modified
public class FastPayClient {
    public String makePayment(double amount) {
        return "FastPay payment successful: " + amount;
    }
}
