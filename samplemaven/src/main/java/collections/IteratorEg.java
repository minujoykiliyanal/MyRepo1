package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> v = new ArrayList<String>();
		v.add("black");
		v.add("brown");
		v.add("white");
		v.add("red");
		v.add("blue");
		System.out.println(v);
		Iterator itr=v.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(v);
		
	}

}
