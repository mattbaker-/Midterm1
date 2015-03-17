package MainPackage;

public abstract class Person {
	
	private String name;
	private String address;
	private String phone_number;
	private String email_address;
	
	public Person() {
		//
	}
	
	public Person(String name, String address, String phone_number, String email_address) {
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
		this.email_address = email_address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public String getAddress() {
		return address;
	}
	
	public void setPhone(String newPhone_number) {
		phone_number = newPhone_number;
	}
	
	public String getPhone() {
		return phone_number;
	}
	
	public void setEmail(String newEmail) {
		email_address = newEmail;
	}
	
	public String getEmail() {
		return email_address;
	}
	
	@Override
	public String toString() {
		return new String("Person" + getName());
	}
}
