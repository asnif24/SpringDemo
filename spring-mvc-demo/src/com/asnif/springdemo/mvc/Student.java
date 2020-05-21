package com.asnif.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favoriteLanguage;
	private String gender;
	private String favoriteSport;
	private LinkedHashMap<String, String> sportOptions;
	private String[] operationSystems;
	
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

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public String getFavoriteSport() {
		return favoriteSport;
	}

	public void setFavoriteSport(String favoriteSport) {
		this.favoriteSport = favoriteSport;
	}

	public LinkedHashMap<String, String> getSportOptions() {
		return sportOptions;
	}

	public String[] getOperationSystems() {
		return operationSystems;
	}

	public void setOperationSystems(String[] operationSystems) {
		this.operationSystems = operationSystems;
	}

	
}
