package AllFromTheBeginning;

import java.util.Scanner;

public class IamFortyEightProgramArraysContinuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,k ;
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the size of element");
		int n=s1.nextInt();
		int c[]=new int[n];
		
		for(i=0;i<=n-1;i++)
		{
			c[i]=s1.nextInt();
		}
		int max=c[0];
		for(i=0;i<n-1;i++)
		{
			if(max<c[i])
			{
				 max=c[i];                                                             
			}
		}
		System.out.println(max);
		int min1=c[0];
		for(i=0;i<=n-1;i++)
		{
			
			if(min1>c[i])
			{
				min1=c[i];
			}
		}
		System.out.println(min1);

	}

}
