package edu.grcy.patterns.behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new AllegroMediator();
        Customer customer1 = new AllegroCustomer(mediator, "Janek");
        Customer customer2 = new AllegroCustomer(mediator, "Tomek");
        Customer customer3 = new AllegroCustomer(mediator, "Marek");
        Customer customer4 = new AllegroCustomer(mediator, "Krzysiek");


        mediator.addBuyer(customer1);
        mediator.addBuyer(customer2);
        mediator.addBuyer(customer3);
        mediator.addBuyer(customer4);
        customer2.bid(20);
        customer1.bid(30);
        customer3.bid(35);
        //customer4.bid(50);

        System.out.println("---------------------------");
        mediator.findHighestBidder();
    }
}
