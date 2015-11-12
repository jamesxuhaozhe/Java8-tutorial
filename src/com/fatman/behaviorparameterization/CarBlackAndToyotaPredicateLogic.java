package com.fatman.behaviorparameterization;

public class CarBlackAndToyotaPredicateLogic implements CarPredicateLogic {

	private static final String BLACK = "black";

	private static final String TOYOTA = "Toyota";

	@Override
	public boolean test(Car car) {
		return car.getColor().equals(BLACK) && car.getMake().equals(TOYOTA);
	}

}
