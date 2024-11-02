package collections;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> m= new ArrayList<String>();
m.add("blue");
m.add("brown");
m.add("white");
m.add("red");
m.add("blue");
System.out.println(m);
m.set(1, "Lavender");
System.out.println(m);
System.out.println(m.indexOf("red"));
System.out.println(m.lastIndexOf("blue"));
m.remove(1);
System.out.println(m);
System.out.println(m.get(1));
System.out.println(m.contains("offwhite"));

	}

}
