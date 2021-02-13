package edu.grcy.patterns.creational.singleton;




//Lazy czyli "inicjowanie przy pierwszym uzyciu"
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Lazy Singleton initialization");
    }

    public static LazySingleton getInstance() {
    	//przy pierwszym wywolaniu getInstance() nastapi utworzenie obiektu
		//przez konstruktor
        if (instance == null) {
			/**
			 * Lazy Singleton nie powinien byc uzywany w aplikacjach
			 * wielowatkowych bo kilka watkow moze utworzyc odrebne instancje klsy
			 */
			instance = new LazySingleton();
        }
        return instance;
    }

}
