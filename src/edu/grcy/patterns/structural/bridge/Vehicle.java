package edu.grcy.patterns.structural.bridge;
// Java code to demonstrate
// bridge design pattern

import java.util.Arrays;
import java.util.List;

// abstraction in bridge pattern
abstract class Vehicle {

	protected List<Workshop> workShop1;


	protected Vehicle(List<Workshop> workShop1)
	{
		this.workShop1 = workShop1;

	}

	abstract public void manufacture();
}

// Refine abstraction 1 in bridge pattern
class Car extends Vehicle {
	public Car(List<Workshop> workShop1)
	{
		super(workShop1);
	}

	@Override
	public void manufacture()
	{
		System.out.print("Car ");
		workShop1.forEach(Workshop::work);
	}
}

// Refine abstraction 2 in bridge pattern
class Bike extends Vehicle {
	public Bike(List<Workshop> workShop1)
	{
		super(workShop1);
	}

	@Override
	public void manufacture()
	{
		System.out.print("Bike ");
		workShop1.forEach(Workshop::work);
	}
}

// Implementor for bridge pattern
interface Workshop
{
	 void work();
}

// Concrete implementation 1 for bridge pattern
class Produce implements Workshop {
	@Override
	public void work()
	{
		System.out.print("Produced");
	}
}

// Concrete implementation 2 for bridge pattern
class Assemble implements Workshop {
	@Override
	public void work()
	{
		System.out.print(" And");
		System.out.println(" Assembled");
	}
}

class Paint implements Workshop{

	@Override
	public void work() {
		System.out.print(" And");
		System.out.println("  Paint");
	}
}

// Demonstration of bridge design pattern
class BridgePattern {
	public static void main(String[] args)
	{

		List<Workshop> carWS = Arrays.asList(new Produce(), new Assemble(), new Paint());
		Vehicle vehicle = new Car(carWS);
		vehicle.manufacture();

		List<Workshop> bikeWS = Arrays.asList(new Produce(), new Assemble());
		Vehicle vehicle1 = new Bike(bikeWS);
		vehicle1.manufacture();


	}
}