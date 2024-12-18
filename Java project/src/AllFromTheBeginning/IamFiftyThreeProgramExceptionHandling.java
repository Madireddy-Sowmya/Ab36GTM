package AllFromTheBeginning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IamFiftyThreeProgramExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=1/0;
			System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println(" Hi lets try another case");
		}
		catch(NullPointerException a2)
		{
			System.out.println(" Hi lets try another case 2 ");
		}
		Scanner s1 = new Scanner(System.in);
		try
		{
		int b = s1.nextInt();
		System.out.println(b);
		}
		catch(InputMismatchException b1)
		{
			System.out.println("it got handled");
		}

	}

}
