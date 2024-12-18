   package AllFromTheBeginning;

import java.util.Arrays;
import java.util.Scanner;

public class IamFortyFourProgramArraysContinuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,k;
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the size of element");
		int n=s1.nextInt();
		int c[]=new int[n];
		int d[]=new int[n];
		for(i=0;i<=n-1;i++)
		{
			c[i]=s1.nextInt();
		}
		for(i=0;i<=n-1;i++)
		{
			d[i]=c[i];
		}
		System.out.println(Arrays.toString(d));//there is a class in java called as Arrays

	}

}
