package edu.grcy.patterns.creational.abstractFactory;

public class FordFiesta extends Ford {

	private String name;
	private String engine;
	private String addsons;

	public FordFiesta(String name, String engine, String addsons) {
		this.name = name;
		this.engine = engine;
		this.addsons = addsons;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getEngine() {
		return engine;
	}

	@Override
	public String getAddons() {
		return addsons;
	}
}
