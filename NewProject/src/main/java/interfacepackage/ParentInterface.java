package interfacepackage;

public interface ParentInterface {

	public static final int a = 10;
	//int b=20;
	//b=30;
	
	public abstract void display();
	
	public static void dispOne()
	{
		System.out.println("Tis is static method from parent");
	}
	
	default void dispTwo()
	{
		System.out.println("Tis is default method from parent");
	}
}
