package Practice;
class SingleSuperClass
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

public class HyraricalLevelIneritance extends SingleSuperClass  {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		HyraricalLevelIneritance y=new HyraricalLevelIneritance();
		y.sub();
		modules();
		y.repeat();   
	}

}


