
package org.tnsif.singleinheritance;
//base class
public class Citizen {
	
	private String city;
	private int pinCode;
	private long adharNo;
	private long contactNo;
	//getters and setters
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	//parameterized constructor
	public Citizen(String city, int pinCode, long adharNo, long contactNo) {
		super();
		this.city = city;
		this.pinCode = pinCode;
		this.adharNo = adharNo;
		this.contactNo = contactNo;
		System.out.print("Parameterized contructor");
	}
	//to string
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pinCode=" + pinCode + ", adharNo=" + adharNo + ", contactNo=" + contactNo
				+ "]";
	}
	//
	public Citizen() {
		super();
		System.out.print("sakshi");
		// TODO Auto-generated constructor stub
	}

}
