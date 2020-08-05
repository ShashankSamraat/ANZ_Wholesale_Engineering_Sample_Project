package com.wholesale.engineering.samraat.sample.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoRecordsAvailableException extends RuntimeException {
	
	public NoRecordsAvailableException(String arg0) {
		super(arg0);
	}
 
}
