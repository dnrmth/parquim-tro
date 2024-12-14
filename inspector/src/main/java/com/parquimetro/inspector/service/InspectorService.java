package com.parquimetro.inspector.service;

import com.parquimetro.inspector.controller.dto.VehicleDto;
import com.parquimetro.inspector.data.ParkingEntity;
import com.parquimetro.inspector.repository.ParkingRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InspectorService {

    private ParkingRepository parkingRepository;

    @Autowired
    public InspectorService(ParkingRepository parkingRepository){
        this.parkingRepository = parkingRepository;
    }

    @Transactional
    public Long saveVehicleParking(VehicleDto vehicleDto) {
        ParkingEntity parkingEntity = new ParkingEntity(vehicleDto);
        return parkingRepository.save(parkingEntity).getId();
    }

}
