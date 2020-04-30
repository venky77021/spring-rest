package com.venky;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringRestApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SpringRestApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Inside context Loads method......");
	}

}
