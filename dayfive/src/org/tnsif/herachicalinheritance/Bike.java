package org.tnsif.herachicalinheritance;
//derived class
public class Bike extends Vehicle {
	
	private String bikeName;
	private int bikeNo;
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public int getBikeNo() {
		return bikeNo;
	}
	public void setBikeNo(int bikeNo) {
		this.bikeNo = bikeNo;
	}
	@Override
	public String toString() {
		return "Bike [bikeName=" + bikeName + ", bikeNo=" + bikeNo + ", toString()=" + super.toString() + "]";
	}
	public Bike(String ownerName, String type) {
		super(ownerName, type);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
