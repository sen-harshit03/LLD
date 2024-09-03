package com.harry.lld.parkinglot.entity.vehicle;

import com.harry.lld.parkinglot.enums.VehicleType;

public class Bike extends Vehicle {

    public Bike() {
        vehicleType = VehicleType.BIKE;
        rate = 20.00;
    }
}
