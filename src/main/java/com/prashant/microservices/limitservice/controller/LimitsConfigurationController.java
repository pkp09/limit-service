/**
 * 
 */
package com.prashant.microservices.limitservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.microservices.limitservice.bean.LimitConfiguration;

/**
 * @author PKP09O
 *
 */
@RestController
public class LimitsConfigurationController {
	
	@GetMapping("/limits")  
	public LimitConfiguration retriveLimitsFromConfigurations()  
	{  
	return new LimitConfiguration(1000, 1);  
	}  

}
