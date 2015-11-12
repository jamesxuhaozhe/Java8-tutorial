package com.fatman.behaviorparameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterCarVersion4 {

	public static void main(final String... args) {
		List<Car> inventory = Arrays.asList(
				new Car.CarBuilder("sedan", "black").setMake("Toyota").build(),
				new Car.CarBuilder("suv", "red").setMake("Honda").build(),
				new Car.CarBuilder("sedan", "blue").setMake("Chevy").build(),
				new Car.CarBuilder("convertable", "black").setMake("Toyota").build());

		CarBlackAndToyotaPredicateLogic predicateLogic = new CarBlackAndToyotaPredicateLogic();
		List<Car> qualifiedCars = filterCarByPredicate(inventory, predicateLogic);

		System.out.println(qualifiedCars);
	}

	public static List<Car> filterCarByPredicate(final List<Car> inventory,
			final CarPredicateLogic predicate) {
		List<Car> qualifiedCars = new ArrayList<>();
		for (Car car : inventory) {
			if (predicate.test(car)) {
				qualifiedCars.add(car);
			}
		}
		return qualifiedCars;
	}
}
