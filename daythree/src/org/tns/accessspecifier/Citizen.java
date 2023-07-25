//program to Demonstarte on Default and parameterized constructor
package org.tns.accessspecifier;

public class Citizen {
	//data members
	String citizenType;
	long aadharNumber;
	String gender;
	String city;
    
	//Default constructor
	Citizen(){
		System.out.println("Default constructor Demostration");
	}
	public Citizen(String citizenType, long aadharNumber, String gender, String city) {
		super();
		this.citizenType = citizenType;
		this.aadharNumber = aadharNumber;
		this.gender = gender;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Citizen [citizenType=" + citizenType + ", aadharNumber=" + aadharNumber + ", gender=" + gender
				+ ", city=" + city + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
		
	}
	