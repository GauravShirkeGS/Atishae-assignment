package com.atishae.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ExceptionDetails {


	private LocalDateTime timestamp;
	
	private String message;
	
	private String description;
}
