package com.parquimetro.inspector.controller;

import com.parquimetro.inspector.controller.dto.ConsultVehicleDto;
import com.parquimetro.inspector.controller.dto.TrafficTicketVehicleDto;
import com.parquimetro.inspector.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    private final ParkingService parkingService;

    @Autowired
    public VehicleController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @PostMapping
    public ResponseEntity<TrafficTicketVehicleDto> consultVehicle(@RequestBody ConsultVehicleDto consultVehicleDto) {
        return ResponseEntity.ok(parkingService.consultVehicle(consultVehicleDto));
    }
}
