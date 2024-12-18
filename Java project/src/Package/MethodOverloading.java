package Package;

public class MethodOverloading {

	void add()
	{
		int a;
		a=9;
		int num=a+100;
		System.out.println(num);
	}
	void add(int a)
	{
		int num=a+100;
		System.out.println(num);
	}
	void add(int a, int b)
	{
		int num=a+100;
		System.out.println(num);
	}
	static void add(double a, int b)
	{
		int num=b+100;
		System.out.println(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading m1 = new MethodOverloading();
		m1.add();
		m1.add(100);
		m1.add(100,200);
		add(98.78,100);
		

	}

}
