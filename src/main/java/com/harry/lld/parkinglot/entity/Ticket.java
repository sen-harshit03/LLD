package com.harry.lld.parkinglot.entity;
import com.harry.lld.parkinglot.entity.spot.Spot;
import com.harry.lld.parkinglot.entity.vehicle.Vehicle;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter @Setter @ToString
public class Ticket {
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private Spot spot;
}
