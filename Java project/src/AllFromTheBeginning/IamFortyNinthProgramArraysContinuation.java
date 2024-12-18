package AllFromTheBeginning;

public class IamFortyNinthProgramArraysContinuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculating average of array
		int s1[]= {65,77,23,86,11};
		int sum=0;
		for(int i=0;i<=s1.length-1;i++)
		{
			sum=sum+s1[i];
		}
		System.out.println(sum);
		System.out.println(sum/s1.length);
		System.out.println(sum%s1.length);
		
	}

}
