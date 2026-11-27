package org.example.Questions.CarRentalSystem;

public class Bill {
    Reservation reservation;
    boolean isPaid;
    double amount;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.amount = computeAmount();
        isPaid = false;
    }

    private double computeAmount() {
        return 1000;
    }
}
