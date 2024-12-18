package Access;

public class AccessSpecifier {
	
	private static void add()
	{
		System.out.println("adding");
	}
	public void sub()
	{
		System.out.println("subtracting");
	}
	protected void div()
	{
		System.out.println("dividing");
	}
	void mul()
	{
		System.out.println("multiplication");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		AccessSpecifier a1=new AccessSpecifier();
		a1.sub();
		a1.div();
		a1.mul();
		

	}

}
