package org.example.Questions.CarRentalSystem;

import java.util.Date;

public class Reservation {
    int id;
    User user;
    Vehicle vehicle;
    Date reservationStartDate;
    Date reservationEndDate;
    Long startTimeStamp;
    Long endTimeStamp;
    Location picked;
    Location drop;
    ReservationType reservationType;
    ReservationStatus reservationStatus;


    public void createReservation(User user, Vehicle vehicle) {
        id = 1;
        this.user = user;
        this.vehicle = vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;
    }

    public void completeReseration() {
        reservationStatus =ReservationStatus.COMPLETED;
    }
}
