package AllFromTheBeginning;

import java.util.Scanner;

public class IamThirtyNinethProgramStringFuntionPart2Continuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Replace 'a' from the given String
		String a = "Happy";
		String output0 = a.replace("a", "");
		System.out.println(output0);
		//Replace 'a' with 'q'
		String output1 = a.replace("a", "q");
		System.out.println(output1);
		//Replace all the alphabets
		String b="ramtiwari1941";
		String output2 = b.replaceAll("[a-z]", "");
		System.out.println(output2);
		String c="RAMTIWARI1941";
		String output3 = c.replaceAll("[A-Z]", "");
		System.out.println(output3);

		String d="sowmya madireddy";
		String output4 = d.replaceAll("sowmya madireddy", "madireddy sowmya");
		System.out.println(output4);
		//Reverse a String
		String input = "Software";
		String output = "";
		for(int i=input.length()-1;i>=0;i--)
		{
			output=output+input.charAt(i);
			
		}
	   System.out.println(output);
		//pallindrome
	    Scanner s1 = new Scanner(System.in);
	    String input5 = s1.next();
	    String output5 = "";
	    for(int i=input5.length()-1;i>=0;i--)
	    {
		   output5=output5+input5.charAt(i);
		
	    }
         System.out.println(output5);
           if(input5.equals(output5))
            {
	           System.out.println("pallindrome");
            }
           else
            {
	           System.out.println("not a pallindrome");
            }
           //Repeat - this came with java11
           String name = "Vivek";
           String n1 = name.repeat(3);

/*Returns a string whose value is the concatenation of this string repeated count times. 

If this string is empty or count is zero then the empty string is returned*/

           System.out.println(n1);
           String name1 = "vivek";
           name.split(name1);//this topic will be covered in arrays topic   
           
		
		
		
		
		
		
		

	}

}
