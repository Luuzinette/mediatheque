package com.plb.mediatheque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
public class MediathequeApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(MediathequeApplication.class);
        ConfigurableEnvironment environment = new StandardEnvironment();
        environment.setDefaultProfiles("info");
        application.setEnvironment(environment);
        application.run(args);
	}

}
