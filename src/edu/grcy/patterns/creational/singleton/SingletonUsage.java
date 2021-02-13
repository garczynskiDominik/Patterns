package edu.grcy.patterns.creational.singleton;

public class SingletonUsage {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        //EagerSingleton eagerSingleton1 = new EagerSingleton(); konstruktor prywatny nie da sie utworzyc


        eagerSingleton.getOtherField();
        EagerSingleton anotherSingleton = EagerSingleton.getInstance();

        LazySingleton lazySingleton = LazySingleton.getInstance();
        /**
         * Double loock singleton -LAZY ale z podwojnym sprawdzaniem
         * nadaje sie do watkow
         * Enum- obecnie najczesciej spotykany typ sinletona
         */

    }
}
