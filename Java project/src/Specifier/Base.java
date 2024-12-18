package Specifier;

public class Base {

	public static void main(String[] args) {
		// Reverse a string
		String input="Software";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			//System.out.print(input.charAt(i));
			output=output+input.charAt(i);
		}
		System.out.print(output);

	}

}
