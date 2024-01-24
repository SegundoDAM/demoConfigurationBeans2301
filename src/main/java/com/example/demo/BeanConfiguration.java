package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {

	@Bean
	//Esto es cuando queremos que se creen varios objetos
	@Scope("prototype")
	public BeanMio getBeanMio() {
		return new BeanMio();
	}

}
