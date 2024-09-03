package com.harry.lld.parkinglot.service;

import com.harry.lld.parkinglot.config.LotConfig;
import com.harry.lld.parkinglot.entity.ParkingLot;
import com.harry.lld.parkinglot.entity.spot.Spot;
import com.harry.lld.parkinglot.enums.VehicleType;
import com.harry.lld.parkinglot.factory.LotFactory;
import com.harry.lld.parkinglot.entity.vehicle.Vehicle;

import java.util.List;

public class ParkingService {

    private ParkingLot parkingLot;

    public ParkingService(final LotConfig lotConfig) {
        parkingLot = LotFactory.createParkingLot(lotConfig);
        System.out.println(parkingLot);
    }

//    public ParkingLot createParkingLot(final LotConfig lotConfig) {
//        return LotFactory.createParkingLot(lotConfig);
//    }

    public List<Spot> getAvailableSpots(final VehicleType vehicleType) {
        return parkingLot.getAvailableSpot(vehicleType);
    }



}
