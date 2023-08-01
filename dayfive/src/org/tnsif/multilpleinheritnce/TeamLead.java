package org.tnsif.multilpleinheritnce;
//childclass2
//parent class
public class TeamLead extends Manager{
	
	private String leadName;
	private int empID;
	private String projectName;
	
	//getters setters
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpId(int empID) {
		this.empID = empID;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	//tostring
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", empID=" + empID + ", projectName=" + projectName + ", toString()="
				+ super.toString() + "]";
	}
	
	//parameterized constructoer
	public TeamLead(String deptName, String name, int empId,
			String leadName,int empID,String projectName) {
		super(deptName, name, empId);
		this.leadName=leadName;
		this.empID=empID;
		this.projectName=projectName;
		// TODO Auto-generated constructor stub
	}
	
	

}
