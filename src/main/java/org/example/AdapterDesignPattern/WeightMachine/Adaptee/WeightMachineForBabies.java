package org.example.AdapterDesignPattern.WeightMachine.Adaptee;

public class WeightMachineForBabies implements WeightMachine{
    @Override
    public double getWeightInPounds() {
        return 32;
    }
}
