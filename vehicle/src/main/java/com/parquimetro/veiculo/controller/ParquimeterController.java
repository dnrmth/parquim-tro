package com.parquimetro.veiculo.controller;

import com.parquimetro.veiculo.dto.ParquimeterRegisterDTO;
import com.parquimetro.veiculo.service.ParquimeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(value = "/parquimeter")
public class ParquimeterController {

    @Autowired
    private ParquimeterService parquimeterService;

    @PostMapping("/register")
    public ResponseEntity<String> registerParquimeter(@RequestBody ParquimeterRegisterDTO parquimeterRegisterDTO) {
        parquimeterService.registerParquimeter(parquimeterRegisterDTO);
        return ok("Parquímetro registrado");
    }
}