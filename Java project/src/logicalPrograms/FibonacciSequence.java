package logicalPrograms;

public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int n=10;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<=n;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
