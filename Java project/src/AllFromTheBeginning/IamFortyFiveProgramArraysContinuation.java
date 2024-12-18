package AllFromTheBeginning;

import java.util.Arrays;
import java.util.Scanner;

public class IamFortyFiveProgramArraysContinuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reversing a string
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
		for(i=n-1,k=0;i>=0;i--)
		{
			d[k]=c[i];
			k++;
		}
		System.out.println(Arrays.toString(d));

	}

}
