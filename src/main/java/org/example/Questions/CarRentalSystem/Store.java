package org.example.Questions.CarRentalSystem;

import java.util.List;

public class Store {
    int id;
    VehicleManagementInventory inventory;
    Location location;
    List<Reservation> listReservation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VehicleManagementInventory getInventory() {
        return inventory;
    }

    public void setVehicle(List<Vehicle> vehicles) {
        this.inventory = new VehicleManagementInventory(vehicles);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Reservation> getListReservation() {
        return listReservation;
    }

    public void setListReservation(List<Reservation> listReservation) {
        this.listReservation = listReservation;
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return inventory.getVehicles(vehicleType);
    }

    public Reservation createReservation(Vehicle vehicle, User user) {
        Reservation reservation = new Reservation();
        reservation.createReservation(user, vehicle);
        listReservation.add(reservation);
        return reservation;
    }

    public void completeReservation(int reservationId) {
        Reservation reservation = listReservation.get(reservationId);
        reservation.completeReseration();
    }
}
