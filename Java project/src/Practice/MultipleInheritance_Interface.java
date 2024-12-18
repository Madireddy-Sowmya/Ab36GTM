package Practice;
interface Mint
{
	void hint();
	void tint();
}
abstract class friend
{
	abstract void free();
	abstract void ghee();
	void let()
	{
		System.out.println("let");
	}
	void bit()
	{
		System.out.println("bit");
	}
}
public class MultipleInheritance_Interface extends friend implements Mint {
	void kit()
	{
		System.out.println("kit");
	}
	void lit()
	{
		System.out.println("lit");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance_Interface g=new MultipleInheritance_Interface();
		g.bit();
		g.free();
		g.hint();
		g.kit();
		g.let();
		g.ghee();
		g.lit();
		g.tint();

	}

	@Override
	public void hint() {
		// TODO Auto-generated method stub
		System.out.println("hint");
	}

	@Override
	public void tint() {
		// TODO Auto-generated method stub
		System.out.println("tint");
	}

	@Override
	void free() {
		// TODO Auto-generated method stub
		System.out.println("free");
	}

	@Override
	void ghee() {
		// TODO Auto-generated method stub
		System.out.println("ghee");
	}

}
