package com.ecom.states.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.states.request.CreateStateRequest;
import com.ecom.states.response.StatesResponse;
import com.ecom.states.service.StateAdminService;

@RestController
public class StateAdminController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(StateAdminController.class);
	
	private final StateAdminService stateAdminServive;
	
	public StateAdminController(final StateAdminService stateAdminServive) {
		this.stateAdminServive = stateAdminServive;
	}
	
	@PostMapping(value = "/add-state", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addStateToDocument(@RequestBody final CreateStateRequest request) {
		stateAdminServive.createState(request);
		return ResponseEntity.ok("State Created");
	}
	
	@GetMapping(value = "/get-all-states")
	public ResponseEntity<List<StatesResponse>> getAllStates() {
		return ResponseEntity.ok(stateAdminServive.getAllStates());
	}
}
