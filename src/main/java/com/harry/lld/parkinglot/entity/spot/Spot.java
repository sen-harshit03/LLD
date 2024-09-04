package com.harry.lld.parkinglot.entity.spot;

import com.harry.lld.parkinglot.entity.Ticket;
import com.harry.lld.parkinglot.entity.vehicle.Vehicle;
import com.harry.lld.parkinglot.enums.VehicleType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.Month;

@Getter @Setter
public abstract class Spot {
    protected Vehicle vehicle;
    protected VehicleType vehicleType;
    protected boolean occupied;

    public Ticket park(final Vehicle vehicle) {
        this.vehicle = vehicle;
        this.occupied = true;

        return getTicket(vehicle);
    }

    private Ticket getTicket(Vehicle vehicle) {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(LocalDateTime.of(2024, Month.SEPTEMBER,4 , 0, 0));
        ticket.setVehicle(vehicle);
        ticket.setSpot(this);
        return ticket;
    }

    public void exit() {
        this.vehicle = null;
        this.occupied = false;
    }


}
