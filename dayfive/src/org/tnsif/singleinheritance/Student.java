package org.tnsif.singleinheritance;
//derived class
public class Student extends Citizen {
	
	private String collegeName;
	private int rollNo;
	
	public Student() {
		//super()-calls the parent class in 
		  super();
		  System.out.println("Child Class Dfault constructor");
	}
	
	public Student(String city, int pinCode, long adharNo, long contactNo,String collegeName,
			int rollNo) {
		super(city, pinCode, adharNo, contactNo);
		this.rollNo=rollNo;
		this.collegeName=collegeName;
		
	}
     //getters and setters 
	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
     
	//tostring
	@Override
	public String toString() {
		return "Student [collegeName=" + collegeName + ", rollNo=" + rollNo + ", toString()=" + super.toString() + "]";
	}
	

}
