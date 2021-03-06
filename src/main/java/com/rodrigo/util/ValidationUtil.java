package com.rodrigo.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

import com.rodrigo.exception.ExceptionHandlingController;

/**
 * Utility class used in {@link ExceptionHandlingController} to build errors.
 * 
 * @author Rodrigo Cezar (rodrigo.cezar@gmail.com)
 *
 */
public class ValidationUtil {
  
	/**
	 * Builds a list of validation errors.
	 * 
	 * @param errors
	 * @return the list of validations errors
	 */
	public List<String> fromBindingErrors(Errors errors) {
		List<String> validationErrors = new ArrayList<String>();
		for (ObjectError objectError : errors.getAllErrors()) {
			validationErrors.add(objectError.getDefaultMessage());
		}
		return validationErrors;
	}
}
