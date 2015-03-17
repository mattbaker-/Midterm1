package MainPackage;

import java.util.Date;

public class Employee extends Person {
	
	private String office;
    private double salary;
    private Date hire;
    
    public Employee() {
    	//
    }
    
    public Employee(String office, double salary, Date hire) {
    	this.office = office;
    	this.salary = salary;
    	this.hire = hire;
    }
    
    @Override
	public String toString() {
		return new String("Employee" + getName());
	}
}
