package Practice;
interface Art
{
	void end();
	void and();
	
}
interface Cart extends Art
{
	void lend();
	void bend();
	
}


public class I_Class implements Cart {
	void dead()
	{
		System.out.println("dead");
	}
	void head()
	{
		System.out.println("Head");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I_Class r= new I_Class();
		r.and();
		r.bend();
		r.dead();
		r.end();
		r.head();
		r.lend();

	}
	@Override
	public void end() {
		// TODO Auto-generated method stub
		System.out.println("end");
	}
	@Override
	public void and() {
		// TODO Auto-generated method stub
		System.out.println("and");
	}
	@Override
	public void lend() {
		// TODO Auto-generated method stub
		System.out.println("lend");
	}
	@Override
	public void bend() {
		// TODO Auto-generated method stub
		System.out.println("bend");
	}

}
