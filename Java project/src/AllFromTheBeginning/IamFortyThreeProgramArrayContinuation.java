package AllFromTheBeginning;

import java.util.Scanner;

public class IamFortyThreeProgramArrayContinuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,k;
		int sum=0;
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the size of element");
		int n=s1.nextInt();
		int c[]=new int[n];
		for(i=0;i<=n-1;i++)
		{
			c[i]=s1.nextInt();
		}
		//int d[]= new int[n];
		for(k=0;k<=n-1;k++)
		{
			sum=sum+c[k];
		}
		System.out.println(sum);
		/* int no[] = {87,987,30};
		 * int sum =0;
		 * for(int i=0;i<=no.length-1;i++)
		 * {
		 * sum = sum +no[i];
		 * }
		 * System.out.println(sum);       
		 */
		
	}

}
