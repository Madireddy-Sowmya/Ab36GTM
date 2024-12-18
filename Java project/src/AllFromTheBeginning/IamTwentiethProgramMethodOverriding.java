package AllFromTheBeginning;
//Developing a method in the parent class with a same name and signature as in the child class but with different implementation
// is called as method overriding

class Hi
{
	void pen()
	{
		System.out.println("writting");
	}
}
public class IamTwentiethProgramMethodOverriding {
	
	void pen()
	{
		System.out.println(" not writting");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IamTwentiethProgramMethodOverriding y = new IamTwentiethProgramMethodOverriding();
		y.pen();

	}

}
