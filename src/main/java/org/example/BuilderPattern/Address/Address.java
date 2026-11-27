package org.example.BuilderPattern.Address;

public class Address {
    int id;
    String roomNo;
    String floorNo;
    String buildingName;
    String towerNumber;
    String pincode;
    String city;

    String state;

    public Address(Builder builder) {
        this.id = builder.id;
        this.floorNo = builder.floorNo;
        this.buildingName = builder.buildingName;
        this.towerNumber = builder.towerNumber;
        this.pincode = builder.pincode;
        this.city = builder.city;
        this.state = builder.state;
        this.roomNo = builder.roomNo;

    }


    public static class Builder {
        int id;
        String roomNo;
        String floorNo;
        String buildingName;
        String towerNumber;
        String pincode;
        String city;
        String state;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setFloor(String floorNo) {
            this.floorNo = floorNo;
            return this;
        }

        public Builder setBuilding(String buildingName) {
            this.buildingName = buildingName;
            return this;
        }

        public Builder setTower(String towerNumber) {
            this.towerNumber = towerNumber;
            return this;
        }

        public Builder setPincode(String pincode) {
            this.pincode = pincode;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Address build() {
            return new Address(this);
        }


    }
}
