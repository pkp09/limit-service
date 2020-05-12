/**
 * 
 */
package com.prashant.microservices.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.microservices.limitservice.bean.Configuration;
import com.prashant.microservices.limitservice.bean.LimitConfiguration;

/**
 * @author PKP09
 *
 */
@RefreshScope
@RestController
public class LimitsConfigurationController {
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")  
	public LimitConfiguration retriveLimitsFromConfigurations()  
	{  
	return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());  
	}  
	
	 @Value("${msg:Config Server is not working. Please check...}")
    private String msg;
	 
    @GetMapping("/msg")
    public String getMsg() {
        return this.msg;
    }

}
