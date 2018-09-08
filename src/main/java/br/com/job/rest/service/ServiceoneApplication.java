package br.com.job.rest.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.job.controller"})
public class ServiceoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceoneApplication.class, args);
	}
}
