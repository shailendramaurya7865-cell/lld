package org.example.Questions.CarRentalSystem;

import java.util.List;

public class VehicleManagementInventory {
    List<Vehicle> listVehicles;

    public VehicleManagementInventory(List<Vehicle> listVehicles) {
        this.listVehicles = listVehicles;
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        //vehicles
        return listVehicles;
    }
}
