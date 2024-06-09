package com.ecom.states.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.ecom.states.documents.City;
import com.ecom.states.documents.StatesDocument;
import com.ecom.states.request.CreateStateRequest;
import com.ecom.states.response.StatesResponse;

@Component
public class StateAdminMapper {
	
	public StatesDocument mapCreateRequestToDocument(final CreateStateRequest createStateRequest) {
		StatesDocument stateDocument = new StatesDocument();
		stateDocument.setState(createStateRequest.getState());
		stateDocument.setCities(createStateRequest.getCity().stream().map(this::mapToCity).collect(Collectors.toList()));
		return stateDocument;
	}

	public City mapToCity(final String city) {
		City cityDocument = new City();
		cityDocument.setCityName(city);
		return cityDocument;
	}

	public List<StatesResponse> getStateList(final List<StatesDocument> stateDocumentList) {
		return stateDocumentList.stream().map(this::getState).collect(Collectors.toList());
	}
	
	public StatesResponse getState(final StatesDocument statesDocument) {
		StatesResponse stateResponse = new StatesResponse();
		stateResponse.setState(statesDocument.getState());
		return stateResponse;
	}
}
