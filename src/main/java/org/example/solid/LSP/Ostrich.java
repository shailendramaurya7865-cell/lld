package org.example.solid.LSP;

public class Ostrich implements Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostritch cant fly");
    }
}
