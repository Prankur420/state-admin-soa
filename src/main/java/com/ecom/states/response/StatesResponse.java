package com.ecom.states.response;

import java.io.Serializable;

public class StatesResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(final String state) {
		this.state = state;
	}

}
