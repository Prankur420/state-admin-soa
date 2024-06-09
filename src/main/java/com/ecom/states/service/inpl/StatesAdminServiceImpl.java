package com.ecom.states.service.inpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecom.states.mapper.StateAdminMapper;
import com.ecom.states.repository.StateAdminRepository;
import com.ecom.states.request.CreateStateRequest;
import com.ecom.states.response.StatesResponse;
import com.ecom.states.service.StateAdminService;

@Service
public class StatesAdminServiceImpl implements StateAdminService {

	private final StateAdminRepository stateAdminRepository;
	private final StateAdminMapper stateAdminMapper;
	
	public StatesAdminServiceImpl(final StateAdminRepository stateAdminRepository,
			final StateAdminMapper stateAdminMapper) {
		this.stateAdminRepository = stateAdminRepository;
		this.stateAdminMapper = stateAdminMapper;
	}
	
	@Override
	public void createState(final CreateStateRequest createStateRequest) {
		stateAdminRepository.insert(stateAdminMapper.mapCreateRequestToDocument(createStateRequest));
	}

	@Override
	public List<StatesResponse> getAllStates() {
		return stateAdminMapper.getStateList(stateAdminRepository.findAll());
	}

}
