package com.ecom.states.service;

import java.util.List;

import com.ecom.states.request.CreateStateRequest;
import com.ecom.states.response.StatesResponse;

public interface StateAdminService {
	
	/**
	 * 
	 * @param createStateRequest
	 */
	public void createState(final CreateStateRequest createStateRequest);
	
	/**
	 * 
	 * @return
	 */
	public List<StatesResponse> getAllStates();
}
