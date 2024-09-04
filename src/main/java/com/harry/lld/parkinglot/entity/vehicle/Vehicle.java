package com.harry.lld.parkinglot.entity.vehicle;

import com.harry.lld.parkinglot.enums.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Vehicle {
    protected VehicleType vehicleType;
    protected double rate; // Rate of parking
}
