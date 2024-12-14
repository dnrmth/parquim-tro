package com.parquimetro.veiculo.service;

import com.parquimetro.veiculo.dto.PaymentRegisterDTO;
import com.parquimetro.veiculo.model.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void registerPayment(PaymentRegisterDTO paymentRegisterDTO) {
        Payment payment = new Payment();
        payment.setNumberCard(paymentRegisterDTO.numberCard());
        payment.setCvv(paymentRegisterDTO.cvv());
        payment.setDate(paymentRegisterDTO.date());
        payment.setPaymentType(paymentRegisterDTO.paymentType());

    }
}
