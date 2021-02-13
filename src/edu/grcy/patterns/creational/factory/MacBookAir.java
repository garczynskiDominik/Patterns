package edu.grcy.patterns.creational.factory;

public class MacBookAir extends MacBook {

	private String memory;
	private String disk;
	private int screenSize;

	public MacBookAir(String memory, String disk, int screenSize) {
		this.memory = memory;
		this.disk = disk;
		this.screenSize = screenSize;
	}

	@Override
	public String getMemory() {
		return memory;
	}

	@Override
	public String getDisk() {
		return disk;
	}

	@Override
	public int getScreenSize() {
		return screenSize;
	}
}
