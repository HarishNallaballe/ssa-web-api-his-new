package com.insurance.service;

import com.insurance.dto.SSARequest;
import com.insurance.dto.SSAResponse;

public interface SSAService {
	
	public SSAResponse getStateName(SSARequest request);

}
