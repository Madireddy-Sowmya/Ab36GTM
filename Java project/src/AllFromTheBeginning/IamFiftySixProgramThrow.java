package AllFromTheBeginning;

public class IamFiftySixProgramThrow {

	public static void main(String[] args) throws InterruptedException,NullPointerException, ArithmeticException{
		// TODO Auto-generated method stub
		int age =25;
		if(age>=18)
		{
			System.out.println("let us google");
		}
		else
		{
			
			throw new ArithmeticException();
		}
		Thread.sleep(2000);//Millisecond 1 sec=1000ms,1ms=10 to the power of 3 secound
		throw new NullPointerException("The cell from where you are trying to feach is empty");
		//here we should handle firs0t exception and then only you can go to next exception
		

	}

}
