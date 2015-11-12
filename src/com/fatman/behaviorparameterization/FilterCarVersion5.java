package com.fatman.behaviorparameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterCarVersion5 {

	public static void main(final String... args) {
		List<Car> inventory = Arrays.asList(
				new Car.CarBuilder("sedan", "black").setMake("Toyota").setYear(2013).build(),
				new Car.CarBuilder("suv", "red").setMake("Honda").setYear(2013).build(),
				new Car.CarBuilder("sedan", "blue").setMake("Chevy").build(),
				new Car.CarBuilder("convertable", "black").setMake("Toyota").setYear(2013).build());

		List<Car> qualifiedCars = filterCarByPredicate(inventory,
				new CarPredicateLogic() {

					@Override
					public boolean test(Car car) {
						return car.getYear() == 2013 && car.getMake().equals("Toyota");
					}
				});

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
