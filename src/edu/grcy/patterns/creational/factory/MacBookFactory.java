package edu.grcy.patterns.creational.factory;

public class MacBookFactory {

	public static MacBook getMacBook(String type, String memory,String disk, int screenSize){

		//fabryka jest fajna jesli mamy stala liczbe klas
		//dla ktorych bedziemy tworzyc obiekty

		if("type1".equalsIgnoreCase(type))
			return new MacBookAir(memory, disk, screenSize);
		else if("type2".equalsIgnoreCase(type))
			return new MacBookPro(memory, disk, screenSize);

		return null;
	}
}

