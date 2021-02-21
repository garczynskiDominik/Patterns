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

10. Jesli chcemy uporzadkowac komunikacje miedzy wielona obiekami
to wzorzec MEDIATOR

11. Relacja jeden do wielu to OBSERVER

13. Jaki obiekt powolujemy w templateMetoth, abstract class

14. Do rpzechodzenia po kolekcjach iterator
15.Kiedy celowe moze byc porownanie obiektow przez == Singleton
16. Czym rozni się == od equals?
    -== sprawdza czy to ten sam obiekt miejsce w pamieci
    dzieki temu zyskujemy na czasie, == jest szybsze niz equals

17. Jak bedzie wygladac pod spodem HasjMap jesli wszyskie
obiekty beda mialy ten sam hashcode? pod spodem bedzie w takim wypadku linkedlist


18. Co mowi SRP - pojedyncza odpwoiedzialnosc, czyli miec jeden powod do miaznu
19. Co mowi OCP - łatwe rozszerzanie, brak koniecznosci zmiany istniejacych struktur
20. Co mowi LSP - niewazne ktara impelentacje intefejsu podstawimy
przebieg programu pownien zakonczyc sie TYPEM rezultatu
( za kazdym razem wynik operacji, za kazdym razem EXceptionn)
21. Co mowi zasada ISP - obiekt nie powinien miec koniecznosci implementacji metod ktorych nie potrzebuje
jak inteffejs ma czasem metody ktore nie sa potrzebne to sensowne jest rozbic na mniejsze interfejsy dzidziczae po sobie
22. Co mówi zasada DIP - obiekt nie powinien tworzyc obiektow zaleznych tylko powinien je dostac
je w konstruktorze, setrze. Czyli unikamy w obiekcie unikamy konstrukcji new Inny obiekt



