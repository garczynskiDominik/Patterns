package edu.grcy.homeWork.practise.carRental;

import edu.grcy.homeWork.practise.carRental.car.Car;
import edu.grcy.homeWork.practise.carRental.car.CarKind;
import edu.grcy.homeWork.practise.carRental.client.Client;

import java.math.BigDecimal;

public class CarRentalDemo {
    public static void main(String[] args) {
        Client client = new Client("Dominik" ,"Garczynski",  28, true);

        Car car = new Car("VW", "Touran", 2020, CarKind.CAR);

        CarRental carRental = new CarRental();
        carRental.addCar(car);
        carRental.addClient(client);
        car.setDayRentPrice(BigDecimal.TEN);

        boolean isRent = carRental.rentCar(car,client,10);
        System.out.println(isRent);
        System.out.println(carRental.rentCar(car,client,20));

    }

}
