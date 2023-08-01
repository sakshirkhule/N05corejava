package org.tnsif.multilpleinheritnce;
//child class1

public class TeamMember extends TeamLead{
	
	
	
	public TeamMember(String deptName, String name, int empId, String leadName, int empID2, String projectName,int size,int duration) {
		super(deptName, name, empId, leadName, empID2, projectName);
		this.size=size;
		this.duration=duration;
		// TODO Auto-generated constructor stub
	}
	
	
	private int size;
	private int duration;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	

}
