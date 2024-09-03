package com.harry.lld.parkinglot.entity;

import com.harry.lld.parkinglot.config.FloorConfig;
import com.harry.lld.parkinglot.entity.spot.Spot;
import com.harry.lld.parkinglot.enums.VehicleType;
import com.harry.lld.parkinglot.factory.SpotFactory;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@ToString
public class Floor {
    private int level;
    private List<Spot> spots;

    public Floor(final FloorConfig floorConfig, final int level) {
        this.level = level;
        this.spots = new ArrayList<>();
        floorConfig.getSpotCounts().forEach((this::createSpot));
    }

    private void createSpot(final VehicleType vehicleType, final int count) {
        IntStream.range(0, count)
                .forEach(times -> spots.add(SpotFactory.createSpot(vehicleType)));
    }
}
