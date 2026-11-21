package org.example.StrategyDesignPattern.Without;

public class Main {
    static void main(String[] args) {
        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();

        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        Vehicle passangerVehicle = new PassangerVehicle();
        passangerVehicle.drive();
    }
}
