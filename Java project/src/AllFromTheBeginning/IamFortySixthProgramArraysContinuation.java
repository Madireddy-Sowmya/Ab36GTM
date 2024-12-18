package AllFromTheBeginning;

import java.util.Arrays;
import java.util.Scanner;

public class IamFortySixthProgramArraysContinuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//comparing the string
		/*String s1[] = {"Ram","Sita","laxman"};
		String s2[] = {"Ram","Sita","Vishnu"};
		boolean answer = Arrays.equals(s1, s2);
		System.out.println(answer);*/
		int i,k;
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the size of element");
		int n=s1.nextInt();
		String c[]=new String[n];
		
		for(i=0;i<=n-1;i++)
		{
			c[i]=s1.next();
		}
		String d[]=new String[n];
		for(i=0;i<=n-1;i++)
		{
			d[i]=s1.next();
		}
		boolean answer = Arrays.equals(c, d);
		System.out.println(answer);
		

	}

}
