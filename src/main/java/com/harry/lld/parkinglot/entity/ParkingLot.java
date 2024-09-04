package com.harry.lld.parkinglot.entity;

import com.harry.lld.parkinglot.config.FloorConfig;
import com.harry.lld.parkinglot.config.LotConfig;
import com.harry.lld.parkinglot.entity.spot.Spot;
import com.harry.lld.parkinglot.enums.VehicleType;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
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

    public List<Spot> getAvailableSpot(final VehicleType vehicleType) {
        return floors.stream()
                .map(floor -> floor.getAvailability(vehicleType))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
