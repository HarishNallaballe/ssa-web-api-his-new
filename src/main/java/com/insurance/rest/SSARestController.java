package com.insurance.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.dto.SSARequest;
import com.insurance.dto.SSAResponse;
import com.insurance.service.SSAService;

@RestController
public class SSARestController {
	
	@Autowired
	private SSAService service;
	
	private Logger logger=LoggerFactory.getLogger(SSARestController.class);
	
	@PostMapping("/state")
	public ResponseEntity<SSAResponse> getStateName(@RequestHeader("his-correlation-id") String correlationId,
			@RequestBody SSARequest request){
		
		SSAResponse stateName = service.getStateName(request);
		logger.info(stateName+" his correlation id : "+correlationId);
		return new ResponseEntity<SSAResponse>(stateName,HttpStatus.OK);
	}

}
