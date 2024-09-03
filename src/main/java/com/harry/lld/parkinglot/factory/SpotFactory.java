package com.harry.lld.parkinglot.factory;

import com.harry.lld.parkinglot.entity.spot.BikeSpot;
import com.harry.lld.parkinglot.entity.spot.CarSpot;
import com.harry.lld.parkinglot.entity.spot.Spot;
import com.harry.lld.parkinglot.entity.spot.VanSpot;
import com.harry.lld.parkinglot.enums.VehicleType;

public class SpotFactory {
    public static Spot createSpot(final VehicleType vehicleType) {
        if (VehicleType.CAR.equals(vehicleType)) {
            return new CarSpot();
        } else if (VehicleType.BIKE.equals(vehicleType)) {
            return new BikeSpot();
        } else {
           return new VanSpot();
        }
    }
}
