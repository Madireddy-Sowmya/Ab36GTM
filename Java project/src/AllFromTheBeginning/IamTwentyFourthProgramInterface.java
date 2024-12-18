package AllFromTheBeginning;
//Interface can only have abstract methods
interface Pain
{
	void tablets();
	void medication();
}
interface Doctor extends Pain
{
	void surgery();
	void hospital();
}

public class IamTwentyFourthProgramInterface implements Doctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IamTwentyFourthProgramInterface o = new IamTwentyFourthProgramInterface();
		o.tablets();
		o.medication();
		o.surgery();
		o.hospital();

	}

	@Override
	public void tablets() {
		// TODO Auto-generated method stub
		System.out.println("T");
	}

	@Override
	public void medication() {
		// TODO Auto-generated method stub
		System.out.println("M");
	}

	@Override
	public void surgery() {
		// TODO Auto-generated method stub
		System.out.println("S");
	}

	@Override
	public void hospital() {
		// TODO Auto-generated method stub
		System.out.println("H");
	}

}
