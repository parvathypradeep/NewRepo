package abstractprogram;

public class ChildAbstract extends ParentAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildAbstract ca = new ChildAbstract();
		ca.display();
		System.out.println(ca.paraDisplay(10));
		ca.displayNormal();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method");
		
	}

	@Override
	public int paraDisplay(int a) {
		// TODO Auto-generated method stub
		return a;
	}

}
