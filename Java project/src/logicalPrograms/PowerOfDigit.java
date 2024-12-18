package logicalPrograms;

public class PowerOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int r;
		for(int i=0;i<=10;i++)
		{
			
			r=(int) Math.pow(2,n);//math came from lang package & here we are doing type casting with int
			System.out.println(r);
			n++;
			
		}

	}

}
