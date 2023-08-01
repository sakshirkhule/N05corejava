package org.tnsif.herachicalinheritance;
//derived class
public class Car extends Vehicle {
     private String carName;
     private int carNo;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carNo=" + carNo + ", toString()=" + super.toString() + "]";
	}
	public Car(String ownerName, String type,String carName,int carNo) {
		super(ownerName, type);
		this.carName=carName;
		this.carNo=carNo;
		// TODO Auto-generated constructor stub
	}
	
     
}
