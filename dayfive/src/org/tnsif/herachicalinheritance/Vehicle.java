package org.tnsif.herachicalinheritance;
//base class
public class Vehicle {
	
	private String ownerName;
	private String type;
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Vehicle [ownerName=" + ownerName + ", type=" + type + "]";
	}
	
	
	public Vehicle(String ownerName, String type) {
		super();
		this.ownerName = ownerName;
		this.type = type;
	}
	
	
	

}
