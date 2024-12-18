package Package;

public class InstanceInitializingBlock {
	
	{
		System.out.println("I am IIB 1");
	}
	{
		System.out.println("I am IIB 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am main method");
		new InstanceInitializingBlock();

	}

}
