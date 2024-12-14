package com.parquimetro.veiculo.controller;

import com.parquimetro.veiculo.dto.AdditionalHoursRegisterDTO;
import com.parquimetro.veiculo.dto.AdditionalPaymentDTO;
import com.parquimetro.veiculo.dto.VehicleRegisterDTO;
import com.parquimetro.veiculo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/register")
    public ResponseEntity<String> registerVehicle(@RequestBody VehicleRegisterDTO vehicleRegisterDTO) {
        vehicleService.registerVehicle(vehicleRegisterDTO);
        return ok("Veículo registrado e pagamento realizado com sucesso!");
    }

    @PostMapping("/pay-additional-hours")
    public ResponseEntity<String> payAdditionalHours(@RequestBody AdditionalHoursRegisterDTO additionalHoursRegisterDTO) {
        AdditionalPaymentDTO additionalPaymentDTO = vehicleService.payAdditionalHours(additionalHoursRegisterDTO);
        return ok(String.format("Você ultrapassou %.0f hora(s) e foi realizado o pagamento de: R$ %.2f", additionalPaymentDTO.additionalHours(),
                additionalPaymentDTO.paymentAmount()));
    }
}