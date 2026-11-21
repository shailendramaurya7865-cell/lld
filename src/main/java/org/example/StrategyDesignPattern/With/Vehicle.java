package org.example.StrategyDesignPattern.With;

public class Vehicle {
    public DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
}
