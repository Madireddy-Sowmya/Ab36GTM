package AllFromTheBeginning;
class Z3
{
	void one()
	{
		
	}
	
}
class Z2 extends Z3
{
	void two()
	{
		
	}
	
}
class Z1 extends Z2
{ 
	void three()
	{
		
	}
	
}
public class IamSixtyFourProgramUpcastingContinuation extends Z1 {
	void four()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z2 t3 = new Z1();
		t3.one();
		t3.two();
		Z1 s1=(Z1)t3;
		s1.one();
		s1.two();
		s1.three();
		

	}

}
