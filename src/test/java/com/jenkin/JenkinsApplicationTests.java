package com.jenkin;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class JenkinsApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(JenkinsApplication.class);

	@Test
	void contextLoads() {
        logger.info("test case executed...");
		assertEquals(true, true);
	}

}
