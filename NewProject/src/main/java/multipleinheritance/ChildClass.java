package multipleinheritance;

public class ChildClass implements Interface1,Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass a = new ChildClass();
		a.display();
		a.display1();

	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Interface2 method");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Interface1 method");
		
	}

}
