package exceptionhandlingeg;

public class IndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3}; // An array with 3 elements

        // Trying to access an index that doesn't exist
        System.out.println(numbers[5]); // Index 5 is out of bounds

	}

}
