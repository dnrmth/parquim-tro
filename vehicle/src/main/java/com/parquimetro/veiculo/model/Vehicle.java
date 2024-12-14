package com.parquimetro.veiculo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.parquimetro.veiculo.enums.VehicleType;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Getter
@Setter
@Document("vehicle")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Vehicle {

    @Id
    private String plate;

    private VehicleType vehicleType;

    private Parquimeter parquimeter;

    private Double parkingPrice;

    private LocalDateTime entryTime;

    private LocalDateTime departureTime;

    private Integer estimatedHours;

    private List<Payment> payments = new ArrayList<>();

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Parquimeter getParquimeter() {
        return parquimeter;
    }

    public void setParquimeter(Parquimeter parquimeter) {
        this.parquimeter = parquimeter;
    }

    public Double getParkingPrice() {
        return parkingPrice;
    }

    public void setParkingPrice(Double parkingPrice) {
        this.parkingPrice = parkingPrice;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public Integer getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(Integer estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
