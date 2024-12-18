package Practice;

public class CallingNonStaticMethod {
	void sum()
	{
		int a,b;
		a=2;
		b=6;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//classname referenceveriable=new classname();
		//referenceveriable.methodname();
		CallingNonStaticMethod r = new CallingNonStaticMethod();
		r.sum(); 

	}

}
