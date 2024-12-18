package AllFromTheBeginning;
interface Lunch
{
	void milk();
	void brunch();
}
interface Dinner
{
	void snacks();
	void dite();
}
public class IamTwentyThiedProgramInterfaceMultipleLevelInheritance implements Lunch,Dinner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IamTwentyThiedProgramInterfaceMultipleLevelInheritance k = new IamTwentyThiedProgramInterfaceMultipleLevelInheritance();
		k.milk();
		k.brunch();
		k.snacks();
		k.dite();
	}

	@Override
	public void snacks() {
		// TODO Auto-generated method stub
		System.out.println("A");
	}

	@Override
	public void dite() {
		// TODO Auto-generated method stub
		System.out.println("B");
	}

	@Override
	public void milk() {
		// TODO Auto-generated method stub
		System.out.println("C");
	}

	@Override
	public void brunch() {
		// TODO Auto-generated method stub
		System.out.println("D");
	}

}
