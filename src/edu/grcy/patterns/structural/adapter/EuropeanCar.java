package edu.grcy.patterns.structural.adapter;

public abstract class EuropeanCar implements EuropeanMovable {
	double speed;
//analogicznie
	public double getSpeedMPH() {
		return speed * SpeedConverter.KILOMETERS_TO_MILES.getConverter();
	}
}
