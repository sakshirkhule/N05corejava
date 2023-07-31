//it can be used to refer instance variable of current class
package org.tnsif.thiskey;

public class ThisKeywordDemoOne {
	
	//default variabel
	int x,y;
	
	void setData(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	void display() {
		System.out.print(x+"  "+y);
		
	}

	public static void main(String[] args) {
		ThisKeywordDemoOne d=new ThisKeywordDemoOne();
		d.setData(2, 3);
		d.display();
		

	}

}
