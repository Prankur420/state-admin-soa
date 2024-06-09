package com.ecom.states.documents;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("States")
public class StatesDocument {

	@Id
	private String _id;
	private String state;
	private List<City> cities;

	public String getState() {
		return state;
	}

	public void setState(final String state) {
		this.state = state;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(final List<City> cities) {
		this.cities = cities;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}
}
