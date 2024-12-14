package com.parquimetro.inspector.controller;

import com.parquimetro.inspector.controller.dto.ConsultVehicleDto;
import com.parquimetro.inspector.controller.dto.TrafficTicketVehicleDto;
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
@RequestMapping("/vehicle")
public class VehicleController {

    private final ParkingService parkingService;

    @Autowired
    public VehicleController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @Operation(
            summary = "Consultar legalidade do veículo",
            description = """
                    A chamada deste endpoint é feita pelo agente de trânsito responsável pelo monitoramento da área.
                    No caso de ilegalidade uma multa é aplicada automaticamente ao dono do veículo.
                    """)
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Consulta realizada com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro nas informações inseridas")
    })
    @PostMapping
    public ResponseEntity<TrafficTicketVehicleDto> consultVehicle(@RequestBody ConsultVehicleDto consultVehicleDto) {
        return ResponseEntity.ok(parkingService.consultVehicle(consultVehicleDto));
    }
}
