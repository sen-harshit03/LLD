package com.harry.lld.parkinglot.config;

import com.harry.lld.parkinglot.enums.VehicleType;
import lombok.ToString;

import java.util.Map;

/**
 * What type  of vehicle and its count we can accommodate in a particular floor.
 * BIKE - 3
 * CAR - 3
 */

@ToString
public class FloorConfig {
    private Map<VehicleType, Integer> spotCounts;

    public Map<VehicleType, Integer> getSpotCounts() {
        return spotCounts;
    }

    public void setSpotCounts(Map<VehicleType, Integer> spotCounts) {
        this.spotCounts = spotCounts;
    }
}
