package collections;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> v = new ArrayList<String>();
		v.add("blue");
		v.add("brown");
		v.add("white");
		v.add("red");
		v.add("blue");
		System.out.println(v);
		ArrayList<String> d = new ArrayList<String>();
		d.add("Orange");
		d.add("Yello");
		System.out.println(d);
		System.out.println(v.addAll(d)); // combine
		System.out.println(v);
System.out.println(v.contains("blue"));
System.out.println(v.get(2));
System.out.println(v.isEmpty());
v.remove(1);
System.out.println(v);
System.out.println(v.size());
	}

}
