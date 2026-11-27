package org.example.Questions.CarRentalSystem;

import java.util.List;

public class VehicleRentalSystem {
    List<Store> stores;
    List<User> users;

    public VehicleRentalSystem(List<Store> stores, List<User> users) {
        this.stores = stores;
        this.users = users;
    }

    public Store getStore(Location location) {
        return stores.get(0);
    }
}
