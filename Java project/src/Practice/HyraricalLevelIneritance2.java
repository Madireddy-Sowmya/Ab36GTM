package Practice;

public class HyraricalLevelIneritance2 extends SingleSuperClass {
	static void mul()
	{
		int a,b,c;
		a=10;
		b=19;
		c=b*a;
		System.out.println(c);
	}
	void div()
	{
		int a,b,c;
		a=10;
		b=19;
		c=b/a;
		System.out.println(c);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		HyraricalLevelIneritance2 x=new HyraricalLevelIneritance2();
		x.sub();
		mul();
		x.div();
		

	}

}
