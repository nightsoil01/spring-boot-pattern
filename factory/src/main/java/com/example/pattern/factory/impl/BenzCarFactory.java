package com.example.pattern.factory.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.pattern.factory.CarFactory;


public class BenzCarFactory implements CarFactory {

	@Override
	public void produce() {
		System.out.println("Produce Benz success!");
	}

}
