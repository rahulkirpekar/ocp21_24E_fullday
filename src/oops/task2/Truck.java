package oops.task2;

public class Truck extends Vehicle
{

	public Truck(String model, String registrationNumber, double rentalPrice) 
	{
		super(model, registrationNumber, rentalPrice);
	}
	@Override
	public double calculateRentalCost(int days) 
	{
		return super.calculateRentalCost(days) * 1.5;
	}
}
