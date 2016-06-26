package me.bhargav.soapws;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import me.bhargav.soapws.dto.PaymentProcessorRequest;
import me.bhargav.soapws.dto.PaymentProcessorResponse;

@WebService(name = "PaymentProcessor")
public interface PaymentProcessor {

	public @WebResult(name = "response") PaymentProcessorResponse processPayment(
			@WebParam(name = "paymentProcessorRequest") PaymentProcessorRequest paymentProcessorRequest);
}
