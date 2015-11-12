package com.fatman.behaviorparameterization;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FilterCarVersion1 {

	public static void main(final String... args) {
		List<Car> inventory = Arrays.asList(
				new Car.CarBuilder("sedan", "black").build(),
				new Car.CarBuilder("suv", "red").build(),
				new Car.CarBuilder("sedan", "blue").build(),
				new Car.CarBuilder("convertable", "black").build());
		
		List<Car> blackCars = filterCarByBlackColor(inventory);
		
		System.out.println(blackCars);
	}

	public static List<Car> filterCarByBlackColor(final List<Car> inventory) {
		List<Car> blackCars = new ArrayList<>();
		for (Car car : inventory) {
			if (car.getColor().equals("black")) {
				blackCars.add(car);
			}
		}
		return blackCars;
	}
}
