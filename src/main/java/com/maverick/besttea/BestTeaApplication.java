package com.maverick.besttea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BestTeaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BestTeaApplication.class, args);
	}
}
