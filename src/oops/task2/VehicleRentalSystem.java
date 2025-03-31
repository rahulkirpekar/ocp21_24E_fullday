package oops.task2;

public class VehicleRentalSystem 
{
	public static void main(String[] args) 
	{
		Vehicle bike = new Bike("Honda SP125", "1234", 20);
				
		Vehicle car = new Car("Swift VXI", "4567", 50);
						
		Vehicle truck = new Truck("TATA", "789", 100);
				
		Customer customer1 = new Customer("Birju", "Birju123");
		Customer customer2 = new Customer("Sagar", "Sagar123");
		Customer customer3 = new Customer("Krishna", "Krishna123");
		
		
		customer1.rentVehicle(car, 3);
		customer1.returnVehicle(car);
		
		customer2.rentVehicle(truck, 5);
		customer2.returnVehicle(truck);

		
		customer3.rentVehicle(bike, 10);
		customer3.returnVehicle(bike);
		
	}
}
