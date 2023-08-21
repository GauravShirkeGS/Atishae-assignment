package com.atishae.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(atishaeException.class)
	public ResponseEntity<ExceptionDetails> throwExceptions(atishaeException ae, WebRequest wr){
		
		ExceptionDetails ed = new ExceptionDetails();
		
		ed.setTimestamp(LocalDateTime.now());
		ed.setMessage(ae.getMessage());
		ed.setDescription(wr.getDescription(false));
		
		return new ResponseEntity<>(ed,HttpStatus.BAD_REQUEST);
		
	}
}
