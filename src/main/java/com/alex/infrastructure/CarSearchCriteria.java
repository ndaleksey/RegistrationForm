package com.alex.infrastructure;

import java.util.UUID;

/**
 * Created by Shishkov A.V. on 20.04.18.
 */
public class CarSearchCriteria {
	private UUID vin;
	private String name;
	private int year;

	public UUID getVin() {
		return vin;
	}

	public void setVin(UUID vin) {
		this.vin = vin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
