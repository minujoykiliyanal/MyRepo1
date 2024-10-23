package superkeywordex;

public class SuperMethodChild extends SuperMethodEg1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodChild obj= new SuperMethodChild();
		obj.display1();
		
		

	}
public void display1() {
	System.out.println("I am a child class method");
	super.display();
}
}
