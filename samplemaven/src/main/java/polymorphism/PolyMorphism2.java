package polymorphism;

public class PolyMorphism2 extends PolyMorphism1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyMorphism2 obj = new PolyMorphism2();
		obj.display(10,20);

	}
public void display(int a, int b) {
	int c=a-b;
	System.out.println(c);
	super.display(10, 11);
}
}
