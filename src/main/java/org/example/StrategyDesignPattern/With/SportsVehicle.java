package org.example.StrategyDesignPattern.With;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
