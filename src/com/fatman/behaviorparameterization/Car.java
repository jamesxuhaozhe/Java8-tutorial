package com.fatman.behaviorparameterization;

public class Car {

	private final String type;
	private final String color;

	private final String transmission;
	private final String make;
	private final String model;
	private final String state;
	private final String licenseNo;
	private final int year;

	private Car(final CarBuilder carBuilder) {
		this.type = carBuilder.type;
		this.color = carBuilder.color;
		this.transmission = carBuilder.transmission;
		this.make = carBuilder.make;
		this.model = carBuilder.model;
		this.state = carBuilder.state;
		this.licenseNo = carBuilder.licenseNo;
		this.year = carBuilder.year;
	}

	private String getDescriptionOfCar() {
		return type + " " + color + " " + transmission + " " + make + " "
				+ model + " " + state + " " + licenseNo + " "
				+ String.valueOf(year) + " \n";
	}

	public String toString() {
		return getDescriptionOfCar();
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public String getTransmission() {
		return transmission;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getState() {
		return state;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public int getYear() {
		return year;
	}

	public static class CarBuilder {
		private String type = "sedan";
		private String color = "black";
		private String transmission = "automatic";
		private String make = "Honda";
		private String model = "Accord";
		private String state = "California";
		private String licenseNo = "7EJM221";
		private int year = 2014;

		public CarBuilder(final String type, final String color) {
			this.type = type;
			this.color = color;
		}

		public CarBuilder setTransmission(final String transmission) {
			this.transmission = transmission;
			return this;
		}

		public CarBuilder setMake(final String make) {
			this.make = make;
			return this;
		}

		public CarBuilder setModel(final String model) {
			this.model = model;
			return this;
		}

		public CarBuilder setState(final String state) {
			this.state = state;
			return this;
		}

		public CarBuilder setLicenseNo(final String licenseNo) {
			this.licenseNo = licenseNo;
			return this;
		}

		public CarBuilder setYear(final int year) {
			this.year = year;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
	}
}
