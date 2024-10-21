package inheritance_ex;

public class MultilevelChildC extends MultilevelParentB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultilevelChildC obj=new MultilevelChildC();
obj.display1();
obj.display2();
obj.display3();

	}
	public void display3() {
		
		System.out.println("Child of B");
	}

}
