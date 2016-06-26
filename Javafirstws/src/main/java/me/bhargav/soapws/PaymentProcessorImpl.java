package me.bhargav.soapws;

import me.bhargav.soapws.dto.PaymentProcessorRequest;
import me.bhargav.soapws.dto.PaymentProcessorResponse;


public class PaymentProcessorImpl implements PaymentProcessor {

	public PaymentProcessorResponse processPayment(
			PaymentProcessorRequest paymentProcessorRequest) {
		PaymentProcessorResponse paymentProcessorResponse = new PaymentProcessorResponse();
		//Business Logic or a call  to a Business Logic Class Goes Here.
		paymentProcessorResponse.setResult(true);
		return paymentProcessorResponse;
	}

}
