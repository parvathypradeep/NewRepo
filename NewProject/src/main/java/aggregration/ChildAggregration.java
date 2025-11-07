package aggregration;

public class ChildAggregration {

	String city;
	String state;
	ParentAggregration ref;
	public ChildAggregration(String city, String state, ParentAggregration ref)
	{
		this.city = city;
		this.state = state;
		this.ref = ref;
		
	}
	
	public void display()
	{
		System.out.println(city + " " + state);
		System.out.println(ref.age + " " + ref.name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentAggregration pa = new ParentAggregration(27, "Parvathy");
		ChildAggregration ca = new ChildAggregration("Adoor","Kerala", pa);
		ca.display();

	}

}
