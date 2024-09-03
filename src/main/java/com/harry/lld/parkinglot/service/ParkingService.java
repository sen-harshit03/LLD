package com.harry.lld.parkinglot.service;

import com.harry.lld.parkinglot.config.LotConfig;
import com.harry.lld.parkinglot.entity.ParkingLot;
import com.harry.lld.parkinglot.factory.LotFactory;

public class ParkingService {


    public ParkingLot createParkingLot(final LotConfig lotConfig) {
        return LotFactory.createParkingLot(lotConfig);
    }

}
