package exceptionhandlingeg;

public class Exceptioneg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=0;
try {
	int c= a/b;

}
/*catch(ArithmeticException varname) {
	b=2;
	int d= a/b;
	System.out.println(d);
}*/
finally {
	System.out.println("End of the programme");
}
	}

}
