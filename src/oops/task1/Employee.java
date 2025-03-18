package oops.task1;

public class Employee 
{
	 private int empId; 
	 private String empName;
	 private double salary;
	 private String department;

	 public Employee(int empId ,String empName , double salary , String department) 
	 {
		 this.empId = empId;
		 this.empName = empName;
		 this.salary = salary;
		 this.department = department;
	 }
	 
	 //setters(Mutators)
	 public void setEmpId(int empId) 
	 {
		 this.empId=empId;
	 }
	 public void setEmpName(String empName) 
	 {
		 this.empName=empName;
	 }
	 public void setEmpSalary(double salary) 
	 {
		 this.salary=salary;
	 } 
	 public void setDepartment(String department) 
	 {
		 this.department=department;
	 }
	 
	 // getters(Accessors)
	 public int getEmpId() 
	 {
		 return empId;
	 }
	 public String getEmpName() 
	 {
		 return empName;
	 }
	 public double getSalary() 
	 {
		 return salary;
	 }
	 public String getDepartment() 
	 {
		 return department;
	 }
	 public void displayDetails() 
	 {
		 System.out.println(empId +" " + empName+" " + salary+" " + department);
	 }
}
