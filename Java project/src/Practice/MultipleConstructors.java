package Practice;

public class MultipleConstructors {
	MultipleConstructors()
	{
		System.out.println("no parameters");
	}
	MultipleConstructors(int a)
	{
		System.out.println("one parameters");
	}
	MultipleConstructors(String name , int b)
	{
		System.out.println("two parameters");
	}
	MultipleConstructors(int b , String name)
	{
		System.out.println("two parameters in different order");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleConstructors r =new MultipleConstructors();
		MultipleConstructors t =new MultipleConstructors(10);
		MultipleConstructors q =new MultipleConstructors("Sowmya",20);
		MultipleConstructors s =new MultipleConstructors(20,"Sowmya");
		

	}

}
