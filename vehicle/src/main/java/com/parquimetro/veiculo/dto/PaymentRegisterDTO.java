package com.parquimetro.veiculo.dto;

import com.parquimetro.veiculo.enums.PaymentType;

public record PaymentRegisterDTO(String numberCard, String cvv, String date, PaymentType paymentType) {}
