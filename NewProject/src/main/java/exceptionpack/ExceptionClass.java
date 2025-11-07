package exceptionpack;

public class ExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int a = 10;
		int b = 0;
		int c = a/b;
		System.out.println(c); 
		}
		
		catch(ArithmeticException a)
		{
			System.out.println("Exception is handled");
		}
		
		finally
		{
			System.out.println("Exit code");
		}
		
		
		
		/*
		int a[]= {1,2,3,4};
		for(int i =0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		*/
		
		/*
		String n = null;
		System.out.println(n.length());
		*/
	}

}
