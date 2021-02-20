package edu.grcy.patterns.behavioral.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Payment payment1 = new Payment("Woda");
        Payment payment2 = new Payment("Parowka");
        Payment payment3 = new Payment("Wino");
        Payment payment4 = new Payment("Chleb");
        Payment payment5 = new Payment("Mleko");
        Payment payment6 = new Payment("Kon");

        Payment[] payments = new Payment[]{payment1, payment2, payment3, payment4, payment5, payment6};
        PaymentList paymentList = new PaymentList(payments);
        PaymentIterator iterator = new PaymentIterator(payments);

        System.out.println("Current: " + iterator.current().getName());
        System.out.println("Czy ma nastepnego: " + (iterator.hasNext() ? "Tak" : "Nie"));
        System.out.println("Current: " + iterator.next().getName());
        System.out.println("Czy ma nastepnego: " + (iterator.hasNext() ? "Tak" : "Nie"));
        System.out.println("Current: " + iterator.next().getName());
        System.out.println("Czy ma nastepnego: " + (iterator.hasNext() ? "Tak" : "Nie"));
        System.out.println("Current: " + iterator.next().getName());
        System.out.println("Current: " + iterator.next().getName());
        System.out.println("Current: " + iterator.next().getName());
        System.out.println("Current: " + iterator.next().getName());
        System.out.println("Czy ma nastepnego: " + (iterator.hasNext() ? "Tak" : "Nie"));


    }
}
