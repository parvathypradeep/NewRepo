package interfacepackage;

public class InterfaceClass implements ParentInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass obj = new InterfaceClass();
		obj.display();
		obj.dispTwo();
		ParentInterface.dispOne();
		System.out.println(obj.a);
		ParentInterface obj1 = new InterfaceClass();
		obj1.display();
		obj1.dispTwo();
		obj.dispThree();
		//obj1.dispThree();  cannot be called

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is interface method from parent");
		
	}

	public void dispThree()
	{
		System.out.println("This is third method from class");
	}
}
