package org.tnsif.instanceofdemo;

class Flower{
	String name="Rose";
	
}
//child
class Rose extends Flower{
	String color="Red";
}

public class InstanceOfExcutor {

	public static void main(String[] args) {
		Rose r=new Rose();
		System.out.println(r instanceof Flower);
		if(r instanceof Flower) {
			System.out.print("true");
		}
		else {
			System.out.print("false");
		}

	}

}
