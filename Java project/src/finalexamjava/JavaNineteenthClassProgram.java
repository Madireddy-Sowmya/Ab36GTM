package finalexamjava;
abstract class Upper
{
	abstract void username();
	abstract void password();
}

public class JavaNineteenthClassProgram extends Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaNineteenthClassProgram k = new JavaNineteenthClassProgram();
		k.username();
		k.password();

	}

	@Override
	void username() {
		// TODO Auto-generated method stub
		System.out.println("username");
	}

	@Override
	void password() {
		// TODO Auto-generated method stub
		System.out.println("password");
	}

}
