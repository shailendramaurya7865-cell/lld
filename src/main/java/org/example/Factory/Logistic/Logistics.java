package org.example.Factory.Logistic;

public abstract class Logistics {

    public abstract Transport createTransport();

    public void deliver() {
        Transport transport = createTransport();
        transport.transport();
    }
}
