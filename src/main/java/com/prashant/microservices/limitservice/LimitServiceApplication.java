package com.prashant.microservices.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class LimitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitServiceApplication.class, args);
	}

	@Autowired
    public void setEnv(Environment e)
    {
        System.out.println("Message is : **********" + e.getProperty("msg"));
    }
}
