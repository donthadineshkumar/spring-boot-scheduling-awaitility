package com.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/*
@EnableScheduling annotation ensures that a background
task executor is created. Without it nothing gets scheduled.
 */
@SpringBootApplication
@EnableScheduling
public class SpringBootScheduleTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootScheduleTaskApplication.class, args);
	}

}
