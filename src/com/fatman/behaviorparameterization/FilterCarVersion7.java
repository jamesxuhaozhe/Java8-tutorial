package com.fatman.behaviorparameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterCarVersion7 {
	public static void main(final String... args) {
		List<Car> inventory = Arrays.asList(
				new Car.CarBuilder("sedan", "black").setMake("Toyota").setYear(2013).build(),
				new Car.CarBuilder("suv", "red").setMake("Honda").setYear(2013).build(),
				new Car.CarBuilder("sedan", "blue").setMake("Chevy").build(),
				new Car.CarBuilder("convertable", "black").setMake("Toyota").setYear(2013).build());

		List<Car> qualifiedCars = filter(inventory, car -> car.getMake().equals("Toyota"));

		System.out.println(qualifiedCars);
	}

	public static <T> List<T> filter(final List<T> inventory, final PredicateLogic<T> p) {
		List<T> results = new ArrayList<>();
		for (T t : inventory) {
			if (p.test(t)) {
				results.add(t);
			}
		}
		return results;
	}
}
