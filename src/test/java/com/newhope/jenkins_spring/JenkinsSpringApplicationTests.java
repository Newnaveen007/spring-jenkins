package com.newhope.jenkins_spring;

import jakarta.annotation.security.RunAs;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JenkinsSpringApplicationTests {

	public static Logger logger= LoggerFactory.getLogger(JenkinsSpringApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing..");
		assertEquals(true, true);
	}

}
