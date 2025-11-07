package collectionpack;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li = new ArrayList<String>();

		//Add method -> to add an element into object

		li.add("blue");
		li.add("yellow");
		li.add("red");
		li.add("green");
		System.out.println(li);

		//Set method -> to insert new element based on index by replacing an element

		System.out.println(li.set(1, "orange"));
		System.out.println(li);

		//indexOf method -> to return the index of the element/object

		System.out.println(li.indexOf("red"));
		li.add("red");
		System.out.println(li);
		System.out.println(li.indexOf("red"));//if same element duplicate then show first occurance

		//lastIndexOf()
		System.out.println(li.lastIndexOf("red")); //if same element duplicate then show last occurance

		//remove -> used to remove an element in particular index
		li.remove(4);
		System.out.println(li);

		//get -> used to get an element in particular index
		System.out.println(li.get(3));

		//contains -> to check if an element is present or no . Return true if contains else return false

		System.out.println(li.contains("orange"));
		System.out.println(li.contains("purple"));
		
		//isempty -> to check whether collection is empty or not, if empty returns true else false.
		
		System.out.println(li.isEmpty());
		
		//size() -> to find length
		System.out.println(li.size());
		
		for(int i=0; i<4; i++)
		{
			System.out.println(li.get(i));
		}
			
		for(String cl : li)  //for each loop
		{
			System.out.println(cl);
		}
		



	}

}
