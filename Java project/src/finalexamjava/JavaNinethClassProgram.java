package finalexamjava;

public class JavaNinethClassProgram {
	
	void add()
	{
		int a;
		a=6;
		int sum=a+100;
		System.out.println(sum);
	}
	void add(int a)
	{
		int sum=a+100;
		System.out.println(sum);
	}
	void add(int a, int b)
	{
		int sum=a+100;
		System.out.println(sum);
	}
	static void add(double a,int b)
	{
		int sum=b+100;
		System.out.println(sum);
	}
	JavaNinethClassProgram()
	{
		System.out.println("you");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaNinethClassProgram k=new JavaNinethClassProgram();
		k.add();
		k.add(8);
		k.add(7,8);
		add(6.9,8);
	}
  
}
