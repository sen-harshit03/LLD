package com.harry.lld.parkinglot.entity.spot;

import com.harry.lld.parkinglot.entity.vehicle.Car;
import com.harry.lld.parkinglot.enums.VehicleType;

public class CarSpot extends Spot {
    public CarSpot() {
        vehicleType = VehicleType.CAR;
    }
}
