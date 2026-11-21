package org.example.StrategyDesignPattern.With;

public class PassangerVehicle extends Vehicle {
    public PassangerVehicle() {
        super(new NormalDriveStrategy());
    }
}
