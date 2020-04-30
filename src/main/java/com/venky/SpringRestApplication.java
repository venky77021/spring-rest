package com.venky;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringRestApplication.class);

	public void init() {
		logger.info("Inside Init method");
	}

	public static void main(String[] args) {
		logger.info("Inside Main Method.....");
		SpringApplication.run(SpringRestApplication.class, args);
	}

}
