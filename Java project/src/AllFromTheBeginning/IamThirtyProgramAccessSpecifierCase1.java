package AllFromTheBeginning;

public class IamThirtyProgramAccessSpecifierCase1 {     
	public void tell()
	{
		System.out.println("public");
	}
	private void spell()
	{
		System.out.println("private");
	}
	protected void sell()
	{
		System.out.println("protected");
	}
	void pill()
	{
		System.out.println("default");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IamThirtyProgramAccessSpecifierCase1 h = new IamThirtyProgramAccessSpecifierCase1();
		h.tell();
		h.spell();
		h.sell();
		h.pill();

	}

}
