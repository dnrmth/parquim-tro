package com.parquimetro.veiculo.dto;

import com.parquimetro.veiculo.enums.VehicleType;

public record VehicleRegisterDTO(String plate, VehicleType vehicleType, Integer estimatedHours, String parquimeterId,
                                 PaymentRegisterDTO paymentRegisterDTO) {}
