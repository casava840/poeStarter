package com.casava.poeStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PoeStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoeStarterApplication.class, args);
	}

}
