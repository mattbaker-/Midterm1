package MainPackage;

public class Faculty extends Employee {
	
	private String officeHours;
	private int rank;
	
	public Faculty() {
		//
	}
	
	public Faculty(String officeHours, int rank) {
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return new String("Faculty" + getName());
	}
}
