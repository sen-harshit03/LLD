package com.harry.lld.parkinglot.service;

import com.harry.lld.parkinglot.config.LotConfig;
import com.harry.lld.parkinglot.entity.ParkingLot;
import com.harry.lld.parkinglot.entity.Ticket;
import com.harry.lld.parkinglot.entity.spot.Spot;
import com.harry.lld.parkinglot.entity.vehicle.Vehicle;
import com.harry.lld.parkinglot.enums.VehicleType;
import com.harry.lld.parkinglot.factory.LotFactory;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class ParkingService {

    private ParkingLot parkingLot;

    public ParkingService(final LotConfig lotConfig) {
        parkingLot = LotFactory.createParkingLot(lotConfig);
        System.out.println(parkingLot);
    }

    public List<Spot> getAvailableSpots(final VehicleType vehicleType) {
        return parkingLot.getAvailableSpot(vehicleType);
    }

    public Ticket park(final Vehicle vehicle) {
        final List<Spot> availableSpots = getAvailableSpots(vehicle.getVehicleType());
        final Spot parkingSpot = availableSpots.stream()
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No parking spot available for : " + vehicle.getVehicleType()));

        return parkingSpot.park(vehicle);
    }

    public double exit(final Ticket ticket) {
        Spot spot = ticket.getSpot();
        spot.exit();
        return calculatePrice(ticket);
    }

    private double calculatePrice(final Ticket ticket) {
        double hours = getDuration(ticket.getEntryTime(), LocalDateTime.now());
        double rate = ticket.getVehicle().getRate();

        System.out.println(hours);
        System.out.println(rate);

        return hours * rate;
    }

    private double getDuration(LocalDateTime entryTime, LocalDateTime exitTime) {
        Duration duration = Duration.between(entryTime, exitTime);
        return Math.ceil(duration.toMinutes() / 60.0);
    }



}
