package com.harry.lld.parkinglot.entity;

import com.harry.lld.parkinglot.config.FloorConfig;
import com.harry.lld.parkinglot.config.LotConfig;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


@ToString
public class ParkingLot {
    private List<Floor> floors;


    public ParkingLot(final LotConfig lotConfig) {
        floors = new ArrayList<>();
        createFloors(lotConfig.getFloorConfigs());
    }

    private void createFloors(List<FloorConfig> floorConfigs) {
        IntStream.range(0, floorConfigs.size())
                .forEach(level -> floors.add(new Floor(floorConfigs.get(level), level + 1)));
    }

}
