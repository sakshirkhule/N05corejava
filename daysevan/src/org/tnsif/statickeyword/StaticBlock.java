package org.tnsif.statickeyword;

public class StaticBlock {
	static float salary;
	String companyName;
	/*static block is use to initailize static variable we canot assign value for any 
	non static variable inside static block*/
	static {
		//companyName="Accenture";
		salary=456.9f;
		System.out.print(salary);
	}
	
	//static method
	static void print() {
		System.out.print(salary);
	}

	public static void main(String[] args) {
		print();

	}

}
