package com.asnif.springdemo.mvc.validation;

import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Value;

public class IdCodeConstraintValidator 
	implements ConstraintValidator<IdCode, String> {
	
//	private Map<char, int> alphabetMap = new Map<>();
	
	@Override
	public void initialize(IdCode theIdCode) {}

	@Override
	public boolean isValid(String theId, 
			ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result;
		
		
		
		return false;
	}
	
	@Value("#{idprefix}")
	private Map<String, String> idPrefix;
	
	private boolean isAvailable(String idInput) {
		int prefixCode = Integer.valueOf(idPrefix[idInput[0]]);
		
	}
	
}
