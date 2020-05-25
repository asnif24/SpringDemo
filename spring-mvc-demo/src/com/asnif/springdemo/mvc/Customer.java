package com.asnif.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.asnif.springdemo.mvc.validation.CourseCode;

public class Customer {
	private String firstName;
	
	@NotNull(message="is required !!")
	@Size(min=1, message="is required = =")
	private String lastName;
	
	@Min(value=0, message="must >=0")
	@Max(value=10, message="must<=10")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
	@CourseCode
	private String courseCode;
	
	@Pattern(regexp="^[A-Z][12][0-9]{8}", message="Non-available form")
	private String idCode;
	
	public String getIdCode() {
		return idCode;
	}
	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
}












