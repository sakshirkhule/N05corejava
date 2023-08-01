package org.tnsif.multilpleinheritnce;

public class Manager {
	
	private String deptName;
	private String name;
	private int empId;
	
	//default constructor
	public Manager() {
		System.out.print("Defalt constructor Manager");
	}
    
	//parameterized constructor
	public Manager(String deptName, String name, int empId) {
		super();
		this.deptName = deptName;
		this.name = name;
		this.empId = empId;
	}
    
	//to string
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	//to string
	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", name=" + name + ", empId=" + empId + "]";
	}

}
