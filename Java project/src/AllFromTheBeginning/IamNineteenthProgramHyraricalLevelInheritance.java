package AllFromTheBeginning;
class Three
{
	static void rain()
	{
		System.out.println("raining");
	}
	void sun()
	{
		System.out.println("sunny");
	}
}
class Two extends Three
{
	static void earth()
	{
		System.out.println("land");
	}
	void water()
	{
		System.out.println("waterfall");
	}
}

public class IamNineteenthProgramHyraricalLevelInheritance extends Two {
	static void health()
	{
		System.out.println("healthy");
	}
	void fire()
	{
		System.out.println("heat");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rain();
		earth();
		health();
		IamNineteenthProgramHyraricalLevelInheritance k = new IamNineteenthProgramHyraricalLevelInheritance();
		k.sun();
		k.water();
		k.fire();

	}

}
