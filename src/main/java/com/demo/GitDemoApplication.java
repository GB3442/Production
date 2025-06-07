package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {
	private static final Logger log = LoggerFactory.getLogger(GitDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
		log.info("Application Started!!!!");
	}
}