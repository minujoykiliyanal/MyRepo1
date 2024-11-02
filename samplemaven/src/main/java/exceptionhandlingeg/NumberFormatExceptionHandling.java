package exceptionhandlingeg;

public class NumberFormatExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String invalidNumber = "123ABC";
int number = Integer.parseInt(invalidNumber);
System.out.println("Parsed number: " + number);
	}

}
