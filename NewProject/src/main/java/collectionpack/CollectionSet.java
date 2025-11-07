package collectionpack;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s = new HashSet<String> ();
		s.add("Tokyo");
		s.add("Delhi");
		s.add("Newyork");
		s.add("London");
		System.out.println(s);

		//addAll() , contains() , containsAll() , remove() , size() , isempty() , clear()
		
		Set<String> a = new HashSet<String> ();
		a.add("Red");
		a.add("Green");
		a.add("Orange");
		a.add("Violet");
		System.out.println(a);
		System.out.println(s.addAll(a));
		System.out.println(s);
		
		a.clear();
		System.out.println(a);
		System.out.println(a.isEmpty());
		
		s.add("Delhi");
		System.out.println(s);
		
		
	}

}
