package AllFromTheBeginning;
class Teacher11
{
	static void selenium()
	{
		
	}
	static void java()
	{
		
	}
}
public class IamSixtyOneProgramUpcasting extends Teacher11 {
	void kt()
	{
		
	}
	void kt_sessions()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting
		Teacher11 t1 = new IamSixtyOneProgramUpcasting();
		t1.selenium();
		t1.java();
		IamSixtyOneProgramUpcasting s1=(IamSixtyOneProgramUpcasting)t1;//downcasting explicit way
		s1.selenium();
		s1.java();
		s1.kt();
		s1.kt_sessions();
		

	}

}
