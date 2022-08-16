package com.bridgelabz.review2;

public class Patient {

	private String name;
	private String age;
	private String phoneNumber;
	private String city;
	private String state;
	private Enum<?> Department;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String name, String age, String phoneNumber, String city, String state, Enum<?> department) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.state = state;
		Department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Enum<?> getDepartment() {
		return Department;
	}

	public void setDepartment(Enum<?> department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", city=" + city + ", state="
				+ state + ", Department=" + Department + "]";
	}

	

}
