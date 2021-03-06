package com.asnif.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a student object
		Student theStudent = new Student();
		
		// add the student object to the model
		theModel.addAttribute("student", theStudent);
		
		theModel.addAttribute("theCountryOptions", countryOptions);
		
		theModel.addAttribute("theSportOptions", sportOptions);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		// log the input data
		System.out.println(
				"theStudent: " + theStudent.getFirstName() 
				+ " " + theStudent.getLastName());
		
		return "student-confirmation";
	}
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@Value("#{sportOptions}")
	private Map<String, String> sportOptions;
	
}








