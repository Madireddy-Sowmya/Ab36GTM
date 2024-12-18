package AllFromTheBeginning;
class Sthree
{
	void one()
	{
		
	}
	
}
class Stwo extends Sthree
{
	void two()
	{
		
	}
	
}
public class IamSixtyTwoProgramUpcastingContinuation extends Stwo {
	void three()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sthree s1= new IamSixtyTwoProgramUpcastingContinuation();
		s1.one();
		IamSixtyTwoProgramUpcastingContinuation t1 = (IamSixtyTwoProgramUpcastingContinuation)s1;
		t1.one();
		t1.two();
		t1.three();

	}

}
