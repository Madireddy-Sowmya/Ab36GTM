package AllFromTheBeginning;


class Amazon{
	private int otp=1234;
	private String password="qwerty123";
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void set_otp(int otp)//syntax of setter method
	{
		this.otp=otp;
		
	}
	public int get_otp()//syntax of getter method
	{
		return otp;
	}
	private double salary=10000;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private int age=34;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
	public class IamFiftySevenProgramEncapsulation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon a1 = new Amazon();
		a1.set_otp(5467);
		System.out.println(a1.get_otp());
		a1.setPassword("abcd1234");
		System.out.println(a1.getPassword());
		a1.setSalary(23456);
		System.out.println(a1.getSalary());
		a1.setAge(45);
		System.out.println(a1.getAge());

	}

}
