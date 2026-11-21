package org.example.StrategyDesignPattern.With;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
