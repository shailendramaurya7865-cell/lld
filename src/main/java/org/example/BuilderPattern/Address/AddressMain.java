package org.example.BuilderPattern.Address;


public class AddressMain {
    static void main(String[] args) {
        Address address = new Address.Builder()
                .setId(10).build();
    }
}
