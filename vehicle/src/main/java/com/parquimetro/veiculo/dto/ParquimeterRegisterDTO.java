package com.parquimetro.veiculo.dto;

public record ParquimeterRegisterDTO(Integer motorcycleQuantityParkingSpace, Integer carQuantityParkingSpace,
                                     Double carPriceHour, Double motorcyclePriceHour) {}
