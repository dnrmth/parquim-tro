package com.parquimetro.veiculo.controller;

import com.parquimetro.veiculo.dto.AdditionalHoursRegisterDTO;
import com.parquimetro.veiculo.dto.AdditionalPaymentDTO;
import com.parquimetro.veiculo.dto.VehicleRegisterDTO;
import com.parquimetro.veiculo.service.VehicleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @Operation(
            summary = "Registrar veículo",
            description = """
                    A chamada deste endpoint é feita diretamente pelo serviço para registro de veículos e realização
                    do pagamento """)
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Veículo registrado e pagamento realizado com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro nas informações inseridas")
    })
    @PostMapping("/register")
    public ResponseEntity<String> registerVehicle(@RequestBody VehicleRegisterDTO vehicleRegisterDTO) {
        vehicleService.registerVehicle(vehicleRegisterDTO);
        return ok("Veículo registrado e pagamento realizado com sucesso!");
    }

    @Operation(
            summary = "Pagar horas adicionais",
            description = """
                    A chamada deste endpoint é feita diretamente pelo serviço para pagamento de horas adicionais pelo
                    proprietário do veículo""")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Pagamento de horas adicionais realizado com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro nas informações inseridas")
    })
    @PostMapping("/pay-additional-hours")
    public ResponseEntity<String> payAdditionalHours(@RequestBody AdditionalHoursRegisterDTO additionalHoursRegisterDTO) {
        AdditionalPaymentDTO additionalPaymentDTO = vehicleService.payAdditionalHours(additionalHoursRegisterDTO);
        return ok(String.format("Você ultrapassou %.0f hora(s) e foi realizado o pagamento de: R$ %.2f", additionalPaymentDTO.additionalHours(),
                additionalPaymentDTO.paymentAmount()));
    }
}