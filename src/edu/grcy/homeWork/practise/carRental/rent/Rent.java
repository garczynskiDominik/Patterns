package edu.grcy.homeWork.practise.carRental.rent;

import edu.grcy.homeWork.practise.carRental.car.Car;
import edu.grcy.homeWork.practise.carRental.client.Client;

import java.math.BigDecimal;

public class Rent {
    private Client client;
    private Car car;
    private RentStatus rentStatus;
    private BigDecimal rentPrice;
    private BigDecimal amountPaid;
    private PaidStatus paidStatus;

    public Rent(Client client, Car car, RentStatus rentStatus, BigDecimal rentPrice, BigDecimal amountPaid) {
        this.client = client;
        this.car = car;
        this.rentStatus = rentStatus;
        this.rentPrice = rentPrice;
        this.amountPaid = amountPaid;
        paidStatus = setByAmountPaid();
    }

    public Rent(Client client, Car car, RentStatus rentStatus, BigDecimal rentPrice) {
        this(client, car, rentStatus, rentPrice, BigDecimal.ZERO);
    }

    private PaidStatus setByAmountPaid() {
        if (BigDecimal.ZERO.equals(amountPaid)) {
            return PaidStatus.NOT_PAIED;
        } else if (amountPaid.compareTo(rentPrice) == 0) {
            return PaidStatus.FULLY_PAIED;
        }
        return PaidStatus.PARTIALLY_PAIED;
    }

    public void payForRent(BigDecimal ammount) {
        amountPaid = amountPaid.add(ammount);
        paidStatus = setByAmountPaid();
    }

    public void updateRentStatus(RentStatus rentStatus) {
        this.rentStatus = rentStatus;
    }

    public RentStatus getRentStatus() {
        return rentStatus;
    }

    public Car getCar() {
        return car;
    }


    public String getInfo() {
        return new StringBuilder(car.getCarInfo())
                .append(" rent for: ")
                .append(client.getFullName())
                .append(", status: ")
                .append(rentStatus)
                .append(", payment status: ")
                .append(paidStatus)
                .toString();

    }


}
