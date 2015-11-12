package com.fatman.behaviorparameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterCarVersion2 {
	public static void main(final String... args) {
		List<Car> inventory = Arrays.asList(
				new Car.CarBuilder("sedan", "black").build(),
				new Car.CarBuilder("suv", "red").build(), 
				new Car.CarBuilder("sedan", "blue").build(),
				new Car.CarBuilder("convertable", "black").build());
		List<Car> qualifiedCars = filterCarByColor(inventory, "red");
		
		System.out.println(qualifiedCars);
	}

	public static List<Car> filterCarByColor(final List<Car> inventory,
			final String color) {
		List<Car> quelifiedCars = new ArrayList<>();
		for (Car car : inventory) {
			if (car.getColor().equals(color)) {
				quelifiedCars.add(car);
			}
		}
		return quelifiedCars;
	}
}
