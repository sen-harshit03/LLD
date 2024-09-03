package com.harry.lld.parkinglot.entity.vehicle;

import com.harry.lld.parkinglot.enums.VehicleType;

public class Car extends Vehicle {

    public Car() {
        vehicleType = VehicleType.CAR;
        rate = 50.00;
    }
}
