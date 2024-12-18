package AllFromTheBeginning;

public class IamFiftyFiveProgramExceptionHandleingContinuation {
	public static void main(String[] args) {
		//int number[] = new int[4];
		/*String a[]= {"Ram","Sita","Laksh"};
		int b[] = {1,2,3};
		double c[] = {34.90,76.89,98.76};*/
		String a[] = new String[3];
		a[0]="Ram";
		a[1]="Sita";
		a[2]="Laksh";
		try {
		a[3]="Hanu";
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("handled 1");
		}
		int b[] = new int[3];
		b[0]=1;
		b[1]=2;
		b[2]=3;
		try
		{
		b[3]=4;
		}
		catch(ArrayIndexOutOfBoundsException b1)
		{
			System.out.println("handled 2");
		}
		double c[] = new double[3];
		c[0]=34.90;
		c[1]=76.89;
		c[2]=98.76;
		try
		{
		c[3]=45.78;
		}
		catch(ArrayIndexOutOfBoundsException c1)
		{
			System.out.println("handled 3");
		}
		System.out.println("Name\tRollnumber\tSalary");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t"+b[i]+"\t"+"\t"+c[i]);
		}
	}

}
