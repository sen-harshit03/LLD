package com.harry.lld.parkinglot.factory;

import com.harry.lld.parkinglot.config.LotConfig;
import com.harry.lld.parkinglot.entity.ParkingLot;

public class LotFactory {
    public static ParkingLot createParkingLot(final LotConfig lotConfig) {
        return new ParkingLot(lotConfig);
    }
}
