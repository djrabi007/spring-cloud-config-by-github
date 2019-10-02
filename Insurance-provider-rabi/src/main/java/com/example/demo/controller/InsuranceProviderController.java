package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insurance-service")
public class InsuranceProviderController {
	
	@RequestMapping("/allPlan1")
		public List<String> getPaln(){
			return Stream.of("Platinum","Gold","Silver")
					.collect(Collectors.toList());
		}

}
