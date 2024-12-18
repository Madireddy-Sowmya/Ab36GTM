package AllFromTheBeginning;

import java.util.Scanner;

public class IamFortyOneProgramArraysContinuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check if the given number is present in the Array
		int n;
		int b;
		int i,k;
		boolean s=false;
		System.out.println("required package has been imported");
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the number to be searched");
		n = s1.nextInt();
		System.out.println("enter the size of the array");
		b=s1.nextInt();
		int c[] = new int[b];
		System.out.println("enter the elements of the arry");
		for(i=0;i<b;i++)
		{
			c[i]=s1.nextInt();
		}
		for(i=0;i<b;i++)
		{
			if(c[i]==n)
			{
				 s=true;
				 break;
			}
		}
		if(s)
		{
			System.out.println("contains");
		}
		else
		{
			System.out.println("does'nt conatins");
		}
		
	}

}
