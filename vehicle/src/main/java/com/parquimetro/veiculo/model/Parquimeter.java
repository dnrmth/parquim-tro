package com.parquimetro.veiculo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("parquimeter")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Parquimeter {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parquimeter_seq")
    @SequenceGenerator(name = "parquimeter_seq", sequenceName = "parquimeter_seq", initialValue = 1, allocationSize = 1)
    private String _id;

    private Integer motorcycleQuantityParkingSpace;

    private Integer carQuantityParkingSpace;

    private Double carPriceHour;

    private Double motorcyclePriceHour;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getMotorcycleQuantityParkingSpace() {
        return motorcycleQuantityParkingSpace;
    }

    public void setMotorcycleQuantityParkingSpace(Integer motorcycleQuantityParkingSpace) {
        this.motorcycleQuantityParkingSpace = motorcycleQuantityParkingSpace;
    }

    public Integer getCarQuantityParkingSpace() {
        return carQuantityParkingSpace;
    }

    public void setCarQuantityParkingSpace(Integer carQuantityParkingSpace) {
        this.carQuantityParkingSpace = carQuantityParkingSpace;
    }

    public Double getCarPriceHour() {
        return carPriceHour;
    }

    public void setCarPriceHour(Double carPriceHour) {
        this.carPriceHour = carPriceHour;
    }

    public Double getMotorcyclePriceHour() {
        return motorcyclePriceHour;
    }

    public void setMotorcyclePriceHour(Double motorcyclePriceHour) {
        this.motorcyclePriceHour = motorcyclePriceHour;
    }

}
