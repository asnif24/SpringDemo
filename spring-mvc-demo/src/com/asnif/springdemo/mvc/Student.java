package com.asnif.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		
		// populate country options: use ISO country code
//		countryOptions = new LinkedHashMap<>();
//		
//		countryOptions.put("BR", "Brazil");
//		countryOptions.put("FR", "France");
//		countryOptions.put("TW", "Taiwan");
//		countryOptions.put("DE", "Germany");
//		countryOptions.put("IN", "India");
//		countryOptions.put("JP", "Japan");
//		countryOptions.put("NZ", "New Zealand");
//		countryOptions.put("CA", "Canada");
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
}
