package com.harry.lld.parkinglot;

import com.harry.lld.parkinglot.config.FloorConfig;
import com.harry.lld.parkinglot.config.LotConfig;
import com.harry.lld.parkinglot.entity.ParkingLot;
import com.harry.lld.parkinglot.enums.VehicleType;
import com.harry.lld.parkinglot.service.ParkingService;

import java.util.List;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        ParkingService service = new ParkingService();

        FloorConfig floor1 = new FloorConfig();
        floor1.setSpotCounts(Map.of(VehicleType.CAR, 2));

        FloorConfig floor2 = new FloorConfig();
        floor2.setSpotCounts(Map.of(VehicleType.CAR, 2, VehicleType.BIKE, 2));

        LotConfig lotConfig = new LotConfig();
        lotConfig.setFloorConfigs(List.of(floor1, floor2));

        ParkingLot lot = service.createParkingLot(lotConfig);
        System.out.println(lot);

    }
}
