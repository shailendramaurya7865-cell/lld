package org.example.AdapterDesignPattern.TravelBooking;

import org.example.AdapterDesignPattern.TravelBooking.Adaptee.PaymentGateWay;
import org.example.AdapterDesignPattern.TravelBooking.Adapter.FastPayAdapter;
import org.example.AdapterDesignPattern.WeightMachine.Adaptee.WeightMachineForBabies;
import org.example.AdapterDesignPattern.WeightMachine.Adapter.WeightMachineAdapterImp;

public class Client {
    static void main(String[] args) {

        PaymentGateWay paymentGateWay = new FastPayAdapter(new FastPayClient());
        paymentGateWay.pay(500);

    }
}
