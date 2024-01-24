package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DemoConfigurationBeans2301Application {

	private final BeanMio beanMio;
	@Autowired
	private BeanMio beanMio2;

	public DemoConfigurationBeans2301Application(BeanMio beanMio) {
		super();
		this.beanMio = beanMio;
	}

	@PostConstruct
	public void cosas() {
		System.out.println("usando postContruct");
		System.out.println("contador "+beanMio2.contador);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoConfigurationBeans2301Application.class, args);

	}

}
