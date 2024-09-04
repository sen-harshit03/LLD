package com.harry.lld.parkinglot;

import com.harry.lld.parkinglot.config.FloorConfig;
import com.harry.lld.parkinglot.config.LotConfig;
import com.harry.lld.parkinglot.entity.Ticket;
import com.harry.lld.parkinglot.entity.spot.Spot;
import com.harry.lld.parkinglot.entity.vehicle.Car;
import com.harry.lld.parkinglot.entity.vehicle.Vehicle;
import com.harry.lld.parkinglot.enums.VehicleType;
import com.harry.lld.parkinglot.service.ParkingService;

import java.util.List;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {

        FloorConfig floor1 = new FloorConfig();
        floor1.setSpotCounts(Map.of(VehicleType.CAR, 2));

        FloorConfig floor2 = new FloorConfig();
        floor2.setSpotCounts(Map.of(VehicleType.CAR, 2, VehicleType.BIKE, 2));

        LotConfig lotConfig = new LotConfig();
        lotConfig.setFloorConfigs(List.of(floor1, floor2));

        ParkingService service = new ParkingService(lotConfig);

        /**
         * Get available spots for particular vehicleType
         */
        List<Spot> availableSpots = service.getAvailableSpots(VehicleType.CAR);
        System.out.println(availableSpots);
        System.out.println(availableSpots.size());



        Vehicle vehicle = new Car();
        Ticket ticket = service.park(vehicle);
        System.out.println(service.getAvailableSpots(VehicleType.CAR).size());

        System.out.println(ticket);
        double price = service.exit(ticket);
        System.out.println(price);

    }
}
