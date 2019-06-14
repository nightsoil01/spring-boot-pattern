package com.example.pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.pattern.factory.CarFactory;

@SpringBootApplication
public class PatternApplication {


	public static void main(String[] args) {
		SpringApplication.run(PatternApplication.class, args);
	}

}
