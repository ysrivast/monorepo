package com.social.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.social.tech.service.AuditorAwareImpl;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")	
public class App 
{
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Bean("auditorAware")
    public AuditorAware<String> auditorAware() {
        return new AuditorAwareImpl();
    }			
}
