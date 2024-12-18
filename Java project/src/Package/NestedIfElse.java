package Package;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=75;
		char g='O';
		if(age>=18)
		{
			if(age>=65)
			{
				if(g=='f')
				{
					System.out.println("free travel");
				}
				else
				{
					System.out.println("pay travel fee");
				}
				System.out.println("Senior Citison you can travel for free");
			}
			else
			{
				System.out.println("You are adult you must pay full fee");
			}
		}
		else
		{ 
			System.out.println("You are very young you can pay half fee");
		}

	}

}
