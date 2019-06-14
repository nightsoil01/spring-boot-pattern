package com.example.pattern.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.pattern.factory.CarFactory;

@Configuration
public class FactoryStartRunner implements CommandLineRunner {
	
	@Autowired
	private CarFactory carFactory;

	@Override
	public void run(String... args) throws Exception {
		carFactory.produce();

	}

}
