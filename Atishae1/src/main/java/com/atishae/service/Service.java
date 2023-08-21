package com.atishae.service;

import com.atishae.exception.atishaeException;

public interface Service {

	public void joinNode(Integer a, Integer b) throws atishaeException;
	
	public Boolean isConnected(Integer a, Integer b)throws atishaeException;
}
