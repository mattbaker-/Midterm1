package MainPackage;

public class Staff extends Employee {
	
	private String Title;
	
	public Staff() {
		//
	}
	
	public Staff(String Title) {
		this.Title = Title;
	}
	
	@Override
	public String toString() {
		return new String("Staff" + getName());
	}
}
