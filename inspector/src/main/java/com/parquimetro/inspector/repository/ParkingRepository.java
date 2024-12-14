package com.parquimetro.inspector.repository;

import com.parquimetro.inspector.data.ParkingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParkingRepository extends JpaRepository<ParkingEntity, Long> {

    Optional<ParkingEntity> findByPlate(String plate);
}
