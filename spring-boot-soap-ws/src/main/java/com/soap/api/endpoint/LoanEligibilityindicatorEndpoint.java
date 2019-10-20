package com.soap.api.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.api.loaneligibility.Acknowledgement;
import com.soap.api.loaneligibility.CustomerRequest;
import com.soap.api.service.LoanEligibilityService;

@Endpoint
public class LoanEligibilityindicatorEndpoint {

	private static final String NAMESPACE = "http://www.soap.com/soap/api/loanEligibility";
	
	@Autowired
	LoanEligibilityService service;
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
	@ResponsePayload
	public Acknowledgement getLoanStatus(CustomerRequest request) {
		return service.checkEligibility(request);
	}
}
