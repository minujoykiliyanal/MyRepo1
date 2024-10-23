package superkeywordex;

public class SuperConstructorChild extends SuperConstructorParent  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj = new SuperConstructorChild();
		
	}
	public SuperConstructorChild() {
		super(10,20);
		System.out.println(" I am a child class");
	}

}
