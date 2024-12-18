package Practice;

public class TypesOfVeriables {
	static int a=5,m;
	double o=9.7;
	final float d=3.14f;
	static void add()
	{
		int a=8;
		System.out.println(a);
		float d=3.15f;
		System.out.println(d);
	}
	void sub()
	{
		final char gender='f';
		double o=8.9;
		System.out.println(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		System.out.println(a);
		System.out.println(m);
		TypesOfVeriables j=new TypesOfVeriables();
		System.out.println(j.o);
		System.out.println(j.d);
		j.sub();
		
		

	}

}
