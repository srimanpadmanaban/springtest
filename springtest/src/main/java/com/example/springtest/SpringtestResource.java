package com.example.springtest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="api")
public class SpringtestResource {

	@GetMapping(value = "getproductdetails")
	public ResponseEntity  getProductDetails() {
		String productName = "xyz";
		String productDescription = "aaaa";
		Map<String, String> map = new HashMap<>();
		map.put("productName", productName);
		map.put("productDescription", productDescription);
		return new ResponseEntity<>(map,HttpStatus.OK);
	}

	@GetMapping(value = "getconfigdetails")
	public ResponseEntity  getConfigDetails() {
		String configName = "xyz";
		String configDescription = "aaaa";
		Map<String, String> map = new HashMap<>();
		map.put("configName", configName);
		map.put("productDescription", configDescription);
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
}
