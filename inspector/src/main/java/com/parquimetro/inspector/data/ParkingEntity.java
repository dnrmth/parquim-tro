package com.parquimetro.inspector.data;

import com.parquimetro.inspector.controller.dto.VehicleDto;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "parking")
public class ParkingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String plate;

    @Column(name = "initial_date_time")
    private LocalDateTime initialDateTime;

    @Column(name = "final_date_time")
    private LocalDateTime finalDateTime;

    public ParkingEntity(VehicleDto vehicleDto) {
        this.plate = vehicleDto.plate();
        this.initialDateTime = vehicleDto.initialDateTime();
        this.finalDateTime = vehicleDto.finalDateTime();
    }

    public ParkingEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public LocalDateTime getInitialDateTime() {
        return initialDateTime;
    }

    public void setInitialDateTime(LocalDateTime initialDateTime) {
        this.initialDateTime = initialDateTime;
    }

    public LocalDateTime getFinalDateTime() {
        return finalDateTime;
    }

    public void setFinalDateTime(LocalDateTime finalDateTime) {
        this.finalDateTime = finalDateTime;
    }
}
