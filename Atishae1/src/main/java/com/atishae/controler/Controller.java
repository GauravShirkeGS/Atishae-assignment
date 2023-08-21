package com.atishae.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atishae.service.ServiceImpl;

@RestController
public class Controller {
	
	@Autowired
	private ServiceImpl ser;

	@PostMapping("/atishae/{source}/{destination}")
	public void joinNodeHandller( @PathVariable("source") Integer src,@PathVariable("destination") Integer des){
		ser.joinNode(src, des);
	}
	
	
	@GetMapping("/atishae/{source}/{destination}")
	public ResponseEntity<Boolean> checkConnectionHandller( @PathVariable("source") Integer src,@PathVariable("destination") Integer des){
		Boolean flag = false;
		
		flag = ser.isConnected(src, des);

		return new ResponseEntity<>(flag,HttpStatus.OK);
	}
	
}
