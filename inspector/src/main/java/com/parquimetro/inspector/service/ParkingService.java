package com.parquimetro.inspector.service;

import ch.qos.logback.core.util.StringUtil;
import com.parquimetro.inspector.controller.dto.ConsultVehicleDto;
import com.parquimetro.inspector.controller.dto.TrafficTicketVehicleDto;
import com.parquimetro.inspector.controller.dto.VehicleDto;
import com.parquimetro.inspector.data.ParkingEntity;
import com.parquimetro.inspector.exception.ParkingException;
import com.parquimetro.inspector.repository.ParkingRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ParkingService {

    private final ParkingRepository parkingRepository;
    private final MockDetranService mockDetranService;

    @Autowired
    public ParkingService(ParkingRepository parkingRepository,
                          MockDetranService mockDetranService) {
        this.parkingRepository = parkingRepository;
        this.mockDetranService = mockDetranService;
    }

    @Transactional
    public TrafficTicketVehicleDto consultVehicle(ConsultVehicleDto consultVehicleDto) {
        Optional<ParkingEntity> parkingEntity = parkingRepository.findByPlate(consultVehicleDto.plate());
        if (parkingEntity.isEmpty()) {
            throw new ParkingException("Veículo não encontrado");
        }

        ParkingEntity parking = parkingEntity.get();
        if (parking.getFinalDateTime().isBefore(LocalDateTime.now())) {
            double finePrice = mockDetranService.applyTrafficTicket(parking.getPlate());
            return new TrafficTicketVehicleDto(parking.getPlate(), finePrice, parking.getFinalDateTime());
        }
        return new TrafficTicketVehicleDto(parking.getPlate(), 0, parking.getFinalDateTime());
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
