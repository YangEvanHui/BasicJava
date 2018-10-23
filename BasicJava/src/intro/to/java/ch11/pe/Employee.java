package intro.to.java.ch11.pe;

import intro.to.java.ch10.pe.MyDate;

public class Employee extends Person {
	private String office;
	private double salary;
	private MyDate dateHired;
	
	public Employee() {
	}
	
	public Employee(String name, String address, String office,
			double salary, MyDate dateHired) {
		setName(name);
		setAddress(address);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	public String getOffice() {
		return office;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public MyDate getDateHired() {
		return dateHired;
	}
	
	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}
	
	@Override
	public String toString() {
		return "Employee Name: " + getName() + "\nOffice: " + office
				+ "\nSalary: " + salary + "\nDate Hired: " + dateHired;
	}
}
