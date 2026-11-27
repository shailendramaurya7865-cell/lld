package org.example.AdapterDesignPattern.WeightMachine.Adapter;

import org.example.AdapterDesignPattern.WeightMachine.Adaptee.WeightMachine;

public class WeightMachineAdapterImp implements WeightMachineAdapter {
    WeightMachine machine;

    public WeightMachineAdapterImp(WeightMachine machine) {
        this.machine = machine;
    }

    @Override
    public double getWeightMachineInKg() {
        double weightInPounds = machine.getWeightInPounds();
        return weightInPounds * 10;
    }
}
