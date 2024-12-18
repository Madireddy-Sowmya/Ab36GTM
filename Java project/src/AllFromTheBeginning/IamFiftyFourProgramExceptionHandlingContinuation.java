package AllFromTheBeginning;

public class IamFiftyFourProgramExceptionHandlingContinuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = new int[4];
		    number[0] =11;
		    number[1] =22;
		    number[2] =33;
			number[3] =44;
			
			try {
				number[4] =55;
			}
			catch(ArrayIndexOutOfBoundsException a1)
			{
				System.out.println("Since size was of 4 and added number was 5");
			}
			finally
			{
				System.out.println("Always I am");
			}
		
		

	}

}
