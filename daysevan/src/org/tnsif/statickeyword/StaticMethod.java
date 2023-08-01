/*if any method outside main function and we have to access that method
 * we have to make that method static*/
package org.tnsif.statickeyword;

public class StaticMethod {
	
	int n=2;
	static String name="MET";
	
	public static void print() {
		System.out.print(name);
		//we cant used non static variable inside any static method
		//System.out.print(n);
	}

	public static void main(String[] args) {
		print();
	  

	}

}
