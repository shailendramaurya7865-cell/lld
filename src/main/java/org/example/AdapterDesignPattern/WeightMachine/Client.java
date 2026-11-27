package org.example.AdapterDesignPattern.WeightMachine;

import org.example.AdapterDesignPattern.WeightMachine.Adaptee.WeightMachineForBabies;
import org.example.AdapterDesignPattern.WeightMachine.Adapter.WeightMachineAdapterImp;

public class Client {
    static void main(String[] args) {

        WeightMachineForBabies weightMachineForBabies = new WeightMachineForBabies();
        WeightMachineAdapterImp weightMachineAdapterImp = new WeightMachineAdapterImp(weightMachineForBabies);
        double weightMachineInKg = weightMachineAdapterImp.getWeightMachineInKg();
        System.out.println("weightMachineInKg = " + weightMachineInKg);

    }
}
