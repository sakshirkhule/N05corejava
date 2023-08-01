package org.tnsif.superkeyword;
class State{
	String stateName="Panjab";
}
class Capital extends State{
	String stateName="hariyana";
	String capital="chandigarh";
	
	public void display() {
		
		/*superkey word with variable is used to call parent class
		 * */
		System.out.println(super.stateName);//panjab
		System.out.println(stateName);//hariyana
	}
}
public class SuperVariable {

	public static void main(String[] args) {
	Capital c=new Capital();
	c.display();
	

	}

}
