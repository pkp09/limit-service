/**
 * 
 */
package com.prashant.microservices.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.microservices.limitservice.bean.Configuration;
import com.prashant.microservices.limitservice.bean.LimitConfiguration;

/**
 * @author PKP09O
 *
 */
@RestController
public class LimitsConfigurationController {
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")  
	public LimitConfiguration retriveLimitsFromConfigurations()  
	{  
	return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());  
	}  

}
