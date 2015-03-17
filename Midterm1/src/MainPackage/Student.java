package MainPackage;

public class Student extends Person {
	
	private eClassRank class_status;
	
	public Student() {
		//
	}
	
	public Student(eClassRank class_status) {
		this.class_status = class_status;
	}
	
	@Override
	public String toString() {
		return new String("Student" + getName());
	}
}
