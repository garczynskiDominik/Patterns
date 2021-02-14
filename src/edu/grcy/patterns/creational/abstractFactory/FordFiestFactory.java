package edu.grcy.patterns.creational.abstractFactory;

public class FordFiestFactory implements FordAbstractFactory {

	private String name;
	private String engine;
	private String addsons;

	public FordFiestFactory(String name, String engine, String addsons) {
		this.name = name;
		this.engine = engine;
		this.addsons = addsons;
	}

	@Override
	public Ford createFord() {
		return new FordFiesta(name, engine, addsons);
	}
}
