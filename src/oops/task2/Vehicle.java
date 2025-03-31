package oops.task2;

//

/*
 * 
 * 
 */

/**
 *  Problem Statement: Vehicle Rental System (Using OOPs in Java)
	Objective:
		Develop a Vehicle Rental System using Object-Oriented Programming concepts (Encapsulation, Inheritance, and Polymorphism) in Java.
	
	Problem Description:
	
	A vehicle rental company needs a system to manage its fleet of vehicles and customer bookings. The system should allow:
	
	1) Adding Vehicles – Store details like vehicle type, model, registration number, rental price, and availability status.
	
	2) Registering Customers – Store customer details like name, ID, and rental history.
	
	3) Renting & Returning Vehicles – Customers can rent available vehicles and return them after use.
	
	4) Displaying Details – Show available vehicles, customer details, and rental transactions.
	
 */

public class Vehicle 
{
	private String model;
	private String registrationNumber;
	private double rentalPrice;
	private boolean isAvailable;
	
	public Vehicle(String model, String registrationNumber, double rentalPrice) 
	{
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.rentalPrice = rentalPrice;
		this.isAvailable = true;
	}
	public boolean isAvailable() 
	{
		return isAvailable;
	}
	
	public void rentVehicle() 
	{
		if (isAvailable) 
		{
			isAvailable = false;
			System.out.println(model+" rented successfully.");
			
		}else 
		{
			System.out.println(model+" is not available.");
		}
	}
	
	// return vehicle
	public void returnVehicle() 
	{
		isAvailable = true;
		System.out.println(model+" returned successfully.");
	}

	// to get cost of rental vehicle
	public double calculateRentalCost(int days) 
	{
		return (rentalPrice * days);
	}
	
	public void displayDetails() 
	{
		System.out.println("Model : " + model+", Registration : "+registrationNumber+", Price : " + rentalPrice+",Available : "+isAvailable);
	}
}
