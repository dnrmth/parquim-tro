package com.parquimetro.inspector.service;

import ch.qos.logback.core.util.StringUtil;
import com.parquimetro.inspector.controller.dto.VehicleDto;
import com.parquimetro.inspector.data.ParkingEntity;
import com.parquimetro.inspector.exception.ParkingException;
import com.parquimetro.inspector.repository.ParkingRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ParkingService {

    private final ParkingRepository parkingRepository;

    @Autowired
    public ParkingService(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    @Transactional
    public Long saveVehicleParking(VehicleDto vehicleDto) {
        if (StringUtil.isNullOrEmpty(vehicleDto.plate())) {
            throw new ParkingException("Placa inválida");
        }

        if (vehicleDto.initialDateTime().isAfter(vehicleDto.finalDateTime())) {
            throw new ParkingException("Data inicial inválida");
        }

        ParkingEntity parkingEntity = new ParkingEntity(vehicleDto);
        return parkingRepository.save(parkingEntity).getId();
    }
}
