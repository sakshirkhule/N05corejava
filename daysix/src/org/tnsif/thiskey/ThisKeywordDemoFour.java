package org.tnsif.thiskey;

public class ThisKeywordDemoFour {
	
	int x;
	//default
	ThisKeywordDemoFour(){
		
		//invoking current parameterized constructor
		this(34);
		System.out.println("Defsult constructor");
	}
	ThisKeywordDemoFour(int x){
		this.x=x;
		System.out.println("parameterized constructor");
	}
	

	public static void main(String[] args) {
		ThisKeywordDemoFour s=new ThisKeywordDemoFour();
		

	}

}
