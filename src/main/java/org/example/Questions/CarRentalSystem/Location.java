package org.example.Questions.CarRentalSystem;

public class Location {
    String address;
    int pincode;
    String city;
    String state;

    public Location(int pincode, String city, String state) {
        this.pincode = pincode;
        this.city = city;
        this.state = state;
    }
}
