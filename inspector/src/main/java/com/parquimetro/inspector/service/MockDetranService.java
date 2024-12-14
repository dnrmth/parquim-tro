package com.parquimetro.inspector.service;

import org.springframework.stereotype.Service;

@Service
public class MockDetranService {

    public double applyTrafficTicket(String plate) {
        // Simulando chamada ao serviço do Detran
        return 195.23;
    }
}
