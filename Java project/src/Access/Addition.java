package Access;

public class Addition {
	Addition(int a , int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	Addition(int a , double b)
	{
		double sum =a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Addition(87 , 90);
		new Addition(1 , 1.1);

	}

}
