package com.parquimetro.inspector.controller;

import com.parquimetro.inspector.controller.dto.VehicleDto;
import com.parquimetro.inspector.service.ParkingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    private final ParkingService parkingService;

    @Autowired
    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @Operation(
            summary = "Salvar estacionamento",
            description = """
                    A chamada deste endpoint é feita diretamente pelo serviço de veículos após o pagamento da
                    taxa do estacionamento rotativo
                    """)
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Anotações do estacionamento salva com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro nas informações inseridas")
    })
    @PostMapping
    public ResponseEntity<Long> saveVehicleParking(@RequestBody VehicleDto vehicleDto) {
        return ResponseEntity.ok(parkingService.saveVehicleParking(vehicleDto));
    }
}
