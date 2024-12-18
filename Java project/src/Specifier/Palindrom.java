package Specifier;

public class Palindrom {

	public static void main(String[] args) {
			// Reverse a string
			String input="radar";
			String output="radar";
			if(input.equals(output))
			{
				System.out.println("palindrom");
			}
			else
			{
				System.out.println("not a palindrom");
			}
			for(int i=input.length()-1;i>=0;i--)
			{
				System.out.print(input.charAt(i));
			}
			


	}

}
