package Practice;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=45;
		if(a<=b)
		{
			if(a!=b)
			{
				if(a<b)
				{
					System.out.println("a is less than b");
				}
				else
				{
					System.out.println("a is not less than b");
				}
			}
			else
			{
				System.out.println("a is greater than or equal to b");
			}
		}
		else
		{
			System.out.println("a is not equal to b");
		}

	}

}
