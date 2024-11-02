package abstractioneg;

public class AbstarctionEg2Child extends AbstractionEg1Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstarctionEg2Child obj1= new AbstarctionEg2Child();
		obj1.add();
		obj1.display();
		obj1.abs();
	}
	public void abs() {
		System.out.println("Abstract child");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int c=10+15;
		System.out.println(c);
	}



}
