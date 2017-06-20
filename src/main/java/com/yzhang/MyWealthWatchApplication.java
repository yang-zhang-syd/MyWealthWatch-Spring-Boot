package com.yzhang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MyWealthWatchApplication {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(MyWealthWatchApplication.class, args);
	}

	@PostConstruct
	void started() {
		this.logger.info("Application started");
	}
}
