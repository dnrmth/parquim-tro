package com.parquimetro.inspector.controller;

import com.parquimetro.inspector.controller.dto.VehicleDto;
import com.parquimetro.inspector.service.InspectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inspector")
public class InspectorController {

    private final InspectorService service;

    @Autowired
    public InspectorController(InspectorService inspectorService) {
        this.service = inspectorService;
    }

    @PostMapping
    public ResponseEntity<Long> saveVehicleParking(@RequestBody VehicleDto vehicleDto) {
        return ResponseEntity.ok(service.saveVehicleParking(vehicleDto));
    }
}
