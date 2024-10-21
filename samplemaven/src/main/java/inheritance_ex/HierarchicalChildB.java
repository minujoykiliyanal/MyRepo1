package inheritance_ex;

public class HierarchicalChildB extends HierarchicalParentA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChildB obj=new HierarchicalChildB ();
		obj.display();
		obj.display1();
	}

	public void display1() {
		System.out.println("I am child B");
	}
}
