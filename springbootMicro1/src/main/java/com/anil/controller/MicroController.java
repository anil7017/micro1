package com.anil.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
public class MicroController {
	
	@GetMapping("/test")
	public String welcome() {

		return "index";
	}
	
	
	@GetMapping("/test/data")
	public @ResponseBody String getDetails() {

		
		return "index";
	}

}
