package com.parquimetro.veiculo.service;

import com.parquimetro.veiculo.dto.ParquimeterRegisterDTO;
import com.parquimetro.veiculo.model.Parquimeter;
import com.parquimetro.veiculo.repository.ParquimeterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParquimeterService {

    @Autowired
    ParquimeterRepository parquimeterRepository;

    public void registerParquimeter(ParquimeterRegisterDTO parquimeterRegisterDTO) {
        Parquimeter parquimeter = new Parquimeter();
        parquimeter.set_id("1");
        parquimeter.setMotorcycleQuantityParkingSpace(parquimeterRegisterDTO.motorcycleQuantityParkingSpace());
        parquimeter.setCarQuantityParkingSpace(parquimeterRegisterDTO.carQuantityParkingSpace());
        parquimeter.setMotorcyclePriceHour(parquimeterRegisterDTO.motorcyclePriceHour());
        parquimeter.setCarPriceHour(parquimeterRegisterDTO.carPriceHour());

        parquimeterRepository.save(parquimeter);

    }
}
