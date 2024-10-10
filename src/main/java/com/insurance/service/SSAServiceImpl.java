package com.insurance.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.insurance.dto.SSARequest;
import com.insurance.dto.SSAResponse;

@Service
public class SSAServiceImpl implements SSAService{

	@Override
	public SSAResponse getStateName(SSARequest request) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "New Jersey");
		map.put(2, "Texas");
		map.put(3, "Ohio");
		map.put(4, "Rhode Island");
		map.put(5, "Kentucky");
		map.put(6, "Albama");
        String s = request.getSsn().toString().substring(0,1);
        Integer ssn = Integer.valueOf(s);
        String stateName=map.get(ssn);
        SSAResponse response = new SSAResponse();
        response.setStateName(stateName);
        response.setSsn(request.getSsn());
		return response;
	}

}
