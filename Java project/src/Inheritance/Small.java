package Inheritance;
class Big
{
	void car()
	{
		System.out.println("Blue car");
	}
	void Bus()
	{
		System.out.println("Yellow bus");
	}
	static void train()
	{
		System.out.println("Brown train");
	}
	static void plane()
	{
		System.out.println("white aroplane");
	}
}

public class Small extends Big {
	static void bike()
	{
		System.out.println("Black bike");
	}
	static void bicycle()
	{
		System.out.println("gray bicycle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Small r = new Small();
		bike();
		bicycle();
		r.car();
		r.Bus();
		train();
		plane();
		
		

	}

}
