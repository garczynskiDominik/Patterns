package edu.grcy.patterns.structural.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        /**
         * Composite pozwala na traktowanie zarowno duzych skomplikowanych obiektow
         * jak i malych rprostych w ten sam sposob:
         * rysunek sklada sie z trojkatow, kol i mniejszych rysunkow,
         * jak rysujemy duzy to z automatu musimy narysowac wszystkie jego skladowe
         * czyli  niejsze rysunki i ich jeszcze mniejsze kola, trojkaty, rysunki
         * jak i kola i trojkaty mieszczace sie bezposrednio na tym duzym
         *
         *
         * ==========================
         * jak pakujemy zakupy do samochodu to obciazenie samochodu wzrasta
         * zarowno jak pakujemy pojedyncze towary jak i opakowania, torby z zakupami
         * (tora odpowiada mniejszemu rysunkowi wyzej), tez mamy obiekty bezposrednio
         * w aucie jak i w tobie( i w tej torbie moga tez byc mniejsze torebki) a finalnie
         * obciazenie auta to waga tego wszystkiego
         *
         */
        Shape triangle1 = new Triangle();
        Shape triangle2 = new Triangle();
        Shape triangle3 = new Triangle();
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();


        Shape drawing1 = new Drawing("Rysunek1");
        Shape drawing2 = new Drawing("Duzy Rysunek2");


        ((Drawing) drawing1).add(triangle1);
        ((Drawing) drawing1).add(triangle2);
        ((Drawing) drawing1).add(circle1);


        ((Drawing) drawing2).add(circle2);
        ((Drawing) drawing2).add(circle3);
        ((Drawing) drawing2).add(drawing1);
        ((Drawing) drawing2).add(triangle3);
        System.out.println("-----------------------------------");
        drawing2.draw("zielony");


    }
}
