package AllFromTheBeginning;
//This keyword can only be used in non static method
//This key word is used to change the global variable values through local variable values
//so that output will be of local variable values


public class IamTwentySixthProgramThisKeyWord {
	int a=5;
	float b=5.9f;
	double c=89.78;
	char d = 'u';
	void nail(int a, float b, double c, char d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IamTwentySixthProgramThisKeyWord p = new IamTwentySixthProgramThisKeyWord();
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(p.c);
		System.out.println(p.d);

	}

}
