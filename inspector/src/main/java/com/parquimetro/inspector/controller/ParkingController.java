package com.parquimetro.inspector.controller;

import com.parquimetro.inspector.controller.dto.VehicleDto;
import com.parquimetro.inspector.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    private final ParkingService parkingService;

    @Autowired
    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }


    @PostMapping
    public ResponseEntity<Long> saveVehicleParking(@RequestBody VehicleDto vehicleDto) {
        return ResponseEntity.ok(parkingService.saveVehicleParking(vehicleDto));
    }
}
