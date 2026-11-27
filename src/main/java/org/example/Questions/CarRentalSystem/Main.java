package org.example.Questions.CarRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);


        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(stores, users);
        Location location = new Location(230301, "Pratapgarh", "UP");
        Store store = vehicleRentalSystem.getStore(location);
        List<Vehicle> vehicle = store.getVehicles(VehicleType.CAR);

        //
        Reservation reservation = store.createReservation(vehicle.get(0), users.get(0));

        Bill bill = new Bill(reservation);
        Payment payment = new Payment();
        payment.payBill(bill);


        store.completeReservation(reservation.id);
    }

    private static List<Store> addStores(List<Vehicle> vehicles) {
        List<Store> stores = new ArrayList<>();
        Store store = new Store();
        store.setId(1);
        store.setVehicle(vehicles);

        stores.add(store);
        return stores;
    }

    private static List<User> addUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);
        user1.setUsername("Shailendra");
        user1.setDrivingLicence(1111);

        User user2 = new User();
        user2.setUserId(2);
        user2.setUsername("Shivam");
        user2.setDrivingLicence(2222);
        users.add(user1);
        users.add(user2);
        return users;
    }

    private static List<Vehicle> addVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleId(1);
        vehicle1.setVehicleType(VehicleType.CAR);


        Vehicle vehicle2 = new Bike();
        vehicle2.setVehicleId(2);
        vehicle2.setVehicleType(VehicleType.BIKE);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;
    }

}
