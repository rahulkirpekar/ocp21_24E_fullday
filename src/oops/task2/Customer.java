package oops.task2;

public class Customer 
{
	private String name;
	private String customerId;
	
	public Customer(String name, String customerId) 
	{
		this.name = name;
		this.customerId = customerId;
	}

	public void rentVehicle(Vehicle vehicle , int days) 
	{
		if (vehicle.isAvailable()) 
		{
			vehicle.rentVehicle();
			System.out.println(name+" rented ," + vehicle.getClass().getSimpleName()+" for "+ days +" days and Total Cost : " + vehicle.calculateRentalCost(days));
		} else 
		{
			System.out.println("Vehicle not available.");
		}
	}
	public void returnVehicle(Vehicle vehicle) 
	{
		vehicle.returnVehicle();
		System.out.println(name+" returned the vehicle");
	}

}
