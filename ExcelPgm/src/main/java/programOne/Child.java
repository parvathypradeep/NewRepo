package programOne;

import java.io.IOException;

public class Child {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println(Parent.getStringData(1, 0));
		System.out.println(Parent.getIntegerData(3, 1));
		System.out.println(Parent.getFloatData(2,1));

	}

}
