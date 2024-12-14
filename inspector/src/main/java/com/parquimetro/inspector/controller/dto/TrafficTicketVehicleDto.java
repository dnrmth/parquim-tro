package com.parquimetro.inspector.controller.dto;

import java.time.LocalDateTime;

public record TrafficTicketVehicleDto(String plate, double finePrice, LocalDateTime finalDate) {
}
