package com.parquimetro.inspector.controller.dto;

import java.time.LocalDateTime;

public record VehicleDto(String plate, LocalDateTime initialDateTime, LocalDateTime finalDateTime) {
}
