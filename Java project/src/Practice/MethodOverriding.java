package Practice;


class UpperClass
{
	void add()
	{
		System.out.println("Upperclass");
	}
}
public class MethodOverriding extends UpperClass {
	void add()
	{   super.add();
		System.out.println("MethodOverriding");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MethodOverriding y=new MethodOverriding();
		y.add();
		//UpperClass j=new UpperClass();
		//j.add();
		
		
		
		

	}

}
