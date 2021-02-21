1. Jakie sa wzorce do tworzenia obiektów?
    -singleton,factory(czasami zwana metoda fabryczna),(czasem osobno abstract factory), builder,prototyp


2. Fabryka abstrakcyjna a metoda fabryczna
    -fabryka abstrakcyjna dodaje kolejne klasy nie zmieniajac dotychczasowej struktury
    -metoda fabryczna to mniejsza struktura klas ale dodanie kolejnego typu powoduje
     koniecznosc rozszerzania istniejacej metody(lamie OCP)

3.Jakie    typt singletonu? Ktory nie moze byc zastosowany w aplikacji wielowatkowej
    -eager
    -lazy- nie moze stosowac w THREADS
    - double checked (lazy)
    -enum
    -Bill Pugh


4.Jaki zworzozec zastosowac jak mamy duzo pol w obiekcie
i nie wszystkich chcemy zawsze ustawic
Builder(budowniczy

5.Jesli mamy strukture jak ponizej to co to za wzorzec
     new classa(new ClassB(nes ClassC())))
     Decorator
6. Jesli mamy rozne algorytmy tej samej rodziny to jakis  wzorzerc
do nich jesli zakladamy wymiennosc
STRATEGY(ostatecznie template metoda) strategy to polityka


7. JAkiego wzorca mozna uzyc zamiast Enuma?
    zamiast Enum -> Strategia (bywa nazywana Enumem na resorach)

8.Jaki wzorzec moze byc uzyty jako warstwa bezpieczenst


