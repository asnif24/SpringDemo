package com.asnif.springdemo.mvc.validation;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		if(theId!=null) {
			Matcher matcher = pattern.matcher(theId);
			if(matcher.matches()) {
			return isAvailable(theId);
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	@Value("#{idprefix}")
	private Map<String, String> idPrefix;
	private Pattern pattern = Pattern.compile("^[A-Z][12][0-9]{8}");
	
	
	private boolean isAvailable(String idInput) {
		int prefixCode = Integer.parseInt(String.valueOf(idPrefix.get(String.valueOf(idInput.charAt(0)))));
		int[] weight = {8,7,6,5,4,3,2,1,1};
		int validation = prefixCode;
		for(int i=0; i<9; i++) {
			validation+=Integer.parseInt(String.valueOf(idInput.charAt(i+1)))*weight[i];
		}
		return (validation%10 == 0);
	}
	
}
