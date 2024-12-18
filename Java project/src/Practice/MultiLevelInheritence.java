package Practice;
class TopLevel
{
	 int z=9;
		static void add()
		{
			int a,b,c;
			a=10;
			b=19;
			c=a+b;
			System.out.println(c);
			
		}
		void sub()
		{
			int a,b,c;
			a=10;
			b=19;
			c=b-a;
			System.out.println(c);
		
	
}
}
class MiddileLevel extends TopLevel
{
	 int z=9;
		static void modules()
		{
			int a,b,c;
			a=10;
			b=19;
			c=a+b;
			System.out.println(c);
			
		}
		void repeat()
		{
			int a,b,c;
			a=10;
			b=19;
			c=b-a;
			System.out.println(c);
		
}
	
}

public class MultiLevelInheritence extends MiddileLevel {
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
		modules();
		mul();
		MultiLevelInheritence v =new MultiLevelInheritence();
		v.sub();
		v.repeat();
		v.div();
		System.out.println(v.z);
		

	}


}
