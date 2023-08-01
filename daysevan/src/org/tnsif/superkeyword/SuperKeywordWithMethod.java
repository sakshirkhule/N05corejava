package org.tnsif.superkeyword;
class Sports{
	String sportsName="Cricket";
	void display() {
		System.out.println("SportName is"+sportsName);
	}
}
class Cricket extends Sports{
	int noOfPlayer=11;
	void display() {
		/* if parent and class class method are same and if we want to 
		 * call parent call inside child calss then use 
		 * super*/
		super.display();
		System.out.println("no of player are "+noOfPlayer);
	}
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
	Cricket c=new Cricket();
	c.display();
	}

}
