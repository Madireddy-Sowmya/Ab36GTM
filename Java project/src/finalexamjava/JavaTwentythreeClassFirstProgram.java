package finalexamjava;

public class JavaTwentythreeClassFirstProgram {
	int age;
	String name;
	double salary;
	void add(int age,String name,double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
		System.out.println("Ram");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTwentythreeClassFirstProgram n = new JavaTwentythreeClassFirstProgram();
		n.add(21,"sita",7654.32);
		System.out.println(n.age);
		System.out.println(n.name);
		System.out.println(n.salary);

	}

}
