package com.example.pattern.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.pattern.factory.CarFactory;
import com.example.pattern.factory.impl.BenzCarFactory;
import com.example.pattern.factory.impl.FordCarFactory;

@Configuration
public class BeanConfiguration {

	@Configuration	
	public class BenzCarFactoryConfiguration {
		@Bean
		@ConditionalOnProperty(value = "car.brand", havingValue = "Benz")
		public CarFactory carFactory() {
			System.out.println("register benz Bean!");
			return new BenzCarFactory();
		}

	}

	@Configuration
	public class FordCarFactoryConfiguration {
		@Bean
		@ConditionalOnProperty(value = "car.brand", havingValue = "Ford")
		public CarFactory carFactory() {
			System.out.println("register ford Bean!");
			return new FordCarFactory();
		}

	}

}
