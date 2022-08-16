package com.bridgelabz.review2;

public class Hospital {

	private String hospitals;

	public Hospital(String hospitals) {
		super();
		this.hospitals = hospitals;
	}

	public String getHospitals() {
		return hospitals;
	}

	public void setHospitals(String hospitals) {
		this.hospitals = hospitals;
	}

	@Override
	public String toString() {
		return "hospital=" + hospitals + "";
	}

}
