package AllFromTheBeginning;

public class IamSixtyFiveProgramAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Vishnu";
		//assert name.length()>7;//syntax1
		assert name.length()>7:"your name has less charecters";//syntax2
		System.out.println(name.concat("Tiwari"));

	}

}
