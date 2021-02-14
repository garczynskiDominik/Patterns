package edu.grcy.patterns.creational.abstractFactory;

public class FordFocusFactory implements FordAbstractFactory {
	private String name;
	private String engine;
	private String addsons;

	public FordFocusFactory(String name, String engine, String addsons) {
		this.name = name;
		this.engine = engine;
		this.addsons = addsons;
	}

	@Override
	public Ford createFord() {
		return new FordFocus(name, engine, addsons);
	}

}
