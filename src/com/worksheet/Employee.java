package com.worksheet;

public class Employee {
	private String firstName;
	private String lastName;
    private	double salary;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

 public static void main (String[] args) {
	 Employee e1 = new Employee();
	 e1.setFirstName("Elanchezhiyan");
	 e1.setLastName("Poosamani");
	 System.out.println( e1.getFirstName() + " " + e1.getLastName());
	 e1.setSalary(10000);
	 System.out.println("Before increment : Rs." + e1.getSalary());
	 Employee e2 = new Employee();
	 e2.setFirstName("Elansuriyan");
	 e2.setLastName("Poosamani");
   	 System.out.println(e2.getFirstName() + " " + e2.getLastName());
	 e2.setSalary(10000);
	 System.out.println("Before increment : Rs." + e2.getSalary());
	 double salary = e1.getSalary();
	 salary = salary*1.5;
     e1.setSalary(salary);
     double salary1 = e2.getSalary();
	 salary1 = salary1*2.0;
     e2.setSalary(salary1);
     System.out.println("After increment of " + e1.getFirstName() + " " + e1.getLastName() + ": Rs." + salary);
     System.out.println("After increment of " + e2.getFirstName() + " " + e2.getLastName() + ": Rs." + salary1);
     }
}