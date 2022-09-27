package com.portfolio.vs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class VsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VsApplication.class, args);
                System.out.println("La app corre bien");
	}

}
