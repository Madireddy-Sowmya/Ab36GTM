package AllFromTheBeginning;

import java.util.Scanner;

public class IamSixteenthProgramScannerClass {
	//Predefined class
	//Takes the human input at runtime
	//Scanner class also helps to write generic code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		byte a= s.nextByte();
		int b = s.nextInt();
		short c = s.nextShort();
		long d = s.nextLong();
		float e = s.nextFloat();
		double f = s.nextDouble();
		boolean g = s.nextBoolean();
		String h = s.next();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
	}

}
