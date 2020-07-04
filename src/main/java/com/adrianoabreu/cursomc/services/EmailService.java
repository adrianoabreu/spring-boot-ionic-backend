package com.adrianoabreu.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.adrianoabreu.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}