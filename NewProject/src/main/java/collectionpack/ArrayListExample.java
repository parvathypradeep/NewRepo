package collectionpack;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> li = new ArrayList<String> ();
		li.add("green");
		li.add("blue");
		li.add("yellow");
		System.out.println(li);

		
		ArrayList<String> fi = new ArrayList<String> ();
		fi.add("apple");
		fi.add("orange");
		fi.add("mango");
		System.out.println(fi);
		
		//addAll -> to add 2 list or combine 2 list
		System.out.println(li.addAll(fi));
		System.out.println(li);
		
		//containsAll -> to check whether a list present in another list
		System.out.println(li.containsAll(fi));
		System.out.println(fi.containsAll(li));
		
		
		Iterator<String> it = li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(li);
		
		
		
	}

}
