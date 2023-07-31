/*when you calll any parameterized method inside non parameterized
method we get an errror
to overcome that we have to give this keyword as argument in method call11*/
package org.tnsif.thiskey;

public class ThisKeywordDemoThree {
	
	void print(ThisKeywordDemoThree t) {
		System.out.print("hey there,i am using" +"keyword");
	}
	
	void display() {
		print(this);
	}

	public static void main(String[] args) {
		ThisKeywordDemoThree s=new ThisKeywordDemoThree();
		s.display();

	}

}
