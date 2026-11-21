package org.example.Factory.Logistic;

public class AirLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new AirPlane();
    }
}
