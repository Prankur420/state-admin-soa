package com.ecom.states.request;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author prank
 *
 */
public class CreateStateRequest implements Serializable {

	private static final long serialVersionUID = 827646114811497569L;

	private String state;
	private List<String> city;
	
	public List<String> getCity() {
		return city;
	}
	
	public void setCity(final List<String> city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(final String state) {
		this.state = state;
	}
	
}
