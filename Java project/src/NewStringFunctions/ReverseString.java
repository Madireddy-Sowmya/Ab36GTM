package NewStringFunctions;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input=world
		//output=dlrow
		String input = "world";
		for(int i=input.length()-1;i>=0;i--)
		{
			System.out.print(input.charAt(i));
		}
			

	}

}