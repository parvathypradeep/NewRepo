package abstractprogram;

public class Childabst extends Parentabst{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentabst pa = new Childabst();
		pa.display();
		Childabst ca = new Childabst();
		ca.displayNormal();

	}

	@Override
	public void display() {
		
		System.out.println("Parent abst method");
		
		
	}
	
	public void displayNormal()
	{
		System.out.println("Normal child method");
	}

}
