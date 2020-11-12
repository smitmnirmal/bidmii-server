package com.bidmii.demo.controller;

import com.bidmii.demo.model.Data;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DataController {
    
    @CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/employees")
	public Data employees() {
        final String uri = "http://dummy.restapiexample.com/api/v1/employees";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, Data.class);
    }
}