package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		s.add("blue");
		s.add("brown");
		s.add("white");
		s.add("red");
		s.add("blue");
		System.out.println(s);
		s.remove("brown");
		s.add("Lavender");
		System.out.println(s);
	}

}
