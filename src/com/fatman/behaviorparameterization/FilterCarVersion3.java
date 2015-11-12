package com.fatman.behaviorparameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterCarVersion3 {
	public static void main(final String... args) {
		List<Car> inventory = Arrays.asList(
				new Car.CarBuilder("sedan", "black").setMake("Toyota").build(),
				new Car.CarBuilder("suv", "red").setMake("Honda").build(),
				new Car.CarBuilder("sedan", "blue").setMake("Chevy").build(),
				new Car.CarBuilder("convertable", "black").setMake("Toyota").build());
		List<Car> qualifiedCars = filterCarByColorAndMake(inventory, "black",
				"Toyota");
		
		System.out.println(qualifiedCars);
	}

	public static List<Car> filterCarByColorAndMake(final List<Car> inventory,
			final String color, final String make) {
		List<Car> quelifiedCars = new ArrayList<>();
		for (Car car : inventory) {
			if (car.getColor().equals(color) && car.getMake().equals(make)) {
				quelifiedCars.add(car);
			}
		}
		return quelifiedCars;
	}
}
