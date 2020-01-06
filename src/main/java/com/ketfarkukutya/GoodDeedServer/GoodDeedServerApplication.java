package com.ketfarkukutya.GoodDeedServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class GoodDeedServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodDeedServerApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedMethods("HEAD", "GET", "POST", "PUT", "DELETE")
						.allowedOrigins("http://localhost:8080", "https://joterkep.mkkp.party");
			}
		};
	}

}
