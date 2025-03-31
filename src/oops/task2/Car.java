package oops.task2;

public class Car extends Vehicle
{
	public Car(String model, String registrationNumber, double rentalPrice) 
	{
		super(model, registrationNumber, rentalPrice);
	}
	@Override
	public double calculateRentalCost(int days) 
	{
		return super.calculateRentalCost(days)*1.2;
	}
}
