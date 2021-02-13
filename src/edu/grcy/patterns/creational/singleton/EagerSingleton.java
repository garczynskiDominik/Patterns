package edu.grcy.patterns.creational.singleton;
//Eager oznacz utworzenie "od razu"
public class EagerSingleton {

    //prywatne pole klasy EagerSingleton - od razu inicjowane
    private static final EagerSingleton instance = new EagerSingleton();
    private String otherField;

    // prywatny konstruktor - czyli wewnatrz nie utworzymy nowego obiektu*
    //*no chyba ze refleksja
    private EagerSingleton() {
        System.out.println("Eager singleton initialisation");
        otherField="aa";
    }
    //publiczna metoda wystawiajaaca utworzone wczesniej pole
    public static EagerSingleton getInstance() {
        System.out.println("Get instance");
        return instance;
    }


    public String getOtherField(){
        return otherField;
    }
// .. kolejne pola i metody
}
