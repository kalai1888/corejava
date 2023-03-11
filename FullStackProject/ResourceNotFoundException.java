package com.example.FullStackProject.exception;
/*The MissingResourceException is an unchecked exception in Java that occurs when a resource is missing.
 *  Since the MissingResourceException is thrown at runtime, 
 *  it does not need to be declared in the throws clause of a method or constructor....*/
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(value =HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

		private static final long serialVersionUID = 1L;
		
		public ResourceNotFoundException(String message) {
			super(message);
		}
	}



