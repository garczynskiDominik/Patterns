package edu.grcy.patterns.structural.adapter;

public abstract class AmericanCar implements AmericanMovable {
	double speed;
//metoda adaptujaca z mph n kmh
	public double getSpeedKMH() {

		return speed *
				SpeedConverter.MILES_TO_KILOMETERS.getConverter();
	}
}
