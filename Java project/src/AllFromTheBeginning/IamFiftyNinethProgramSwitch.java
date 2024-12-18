package AllFromTheBeginning;

import java.util.Scanner;

public class IamFiftyNinethProgramSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c,d,e,f;
		switch(a)
		{
		case 1:c=a+b;
		       System.out.println("addition:" +c);
		       break;
		case 2:d=a-b;
			   System.out.println("substraction:"+d);
	           break;
		case 3:e=a*b;
			   System.out.println("multiplication:"+e);
	           break;
		case 4:f=a/b;
			   System.out.println("division:"+f);
	           break;   
	    default:System.out.println("No case is selected");       
		}

	}

}
