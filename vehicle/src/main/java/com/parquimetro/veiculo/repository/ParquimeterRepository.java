package com.parquimetro.veiculo.repository;

import com.parquimetro.veiculo.model.Parquimeter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParquimeterRepository extends MongoRepository<Parquimeter, String> {
}
