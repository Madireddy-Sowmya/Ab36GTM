package AllFromTheBeginning;
class S3
{
	void one()
	{
		
	}
	
}
class S2 extends S3
{
	void two()
	{
		
	}
	
}

public class IamSixtyThreeProgramUpcastingContinuation extends S2 {
	void three()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S2 t2 = new IamSixtyThreeProgramUpcastingContinuation();
		t2.one();
		t2.two();
		IamSixtyThreeProgramUpcastingContinuation s1 = (IamSixtyThreeProgramUpcastingContinuation)t2;
		s1.one();
		s1.two();
		s1.three();

	}

}
