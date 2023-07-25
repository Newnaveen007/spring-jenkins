package com.newhope.jenkins_spring;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringApplication {

	public static Logger logger= LoggerFactory.getLogger(JenkinsSpringApplication.class);

	@PostConstruct
	public void intt(){
		logger.info("Application started!!");
	}

	public static void main(String[] args) {
		logger.info("Application Executed successfully!!");
		SpringApplication.run(JenkinsSpringApplication.class, args);
	}

}
