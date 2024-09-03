package com.harry.lld.parkinglot.entity.spot;

import com.harry.lld.parkinglot.enums.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Spot {
    protected VehicleType vehicleType;
    protected boolean free;
}
