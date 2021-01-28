
public class Customer {
	int id;
	String name;
	private long homePhone,cellPhone,workPhone;
	private String street,city,state;
	private long zip;
//	Customer(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}
	public int getId() {
		return this.id;
	}
	public void setAddress(String street, String city, String state, long zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public void setPhoneNum (long home, long cell, long work) {
		this.cellPhone = cell;
		this.workPhone = work;
		this.homePhone = home;
	}
	public String getName() {
		return this.name;
	}
	public void printPhoneNum() {
		System.out.println("Home: "+this.homePhone);
		System.out.println("Work: "+this.workPhone);
		System.out.println("Cell: "+this.cellPhone);
	}
	public void printShippingAddress() {
		System.out.println("Shipping Address: ");
		System.out.println(this.street+", "+this.city+", "+this.state+", "+this.zip);
	}
	public void show() {
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
		this.printShippingAddress();
		this.printPhoneNum();
	}
	
}
