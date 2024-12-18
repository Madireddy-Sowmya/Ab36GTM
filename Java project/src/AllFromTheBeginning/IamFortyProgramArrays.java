package AllFromTheBeginning;

public class IamFortyProgramArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = new String[3];
		//String name[] = new String[2];
		name[0] = "Manish";
		name[1] = "sowmya";
		name[2] = "Paint";//jana.lang.ArrayIndexOutOfBoundsException
		/*System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);*///jana.lang.ArrayIndexOutOfBoundsException
		for(int i=0;i<=2;i++)
		{
			System.out.println(name[i]);
		}
		char gender[] = new char[3];
		gender[0]='M';
		gender[1]='F';
		gender[2]='M';
		for(int k=0;k<=2;k++)
		{
			System.out.println(gender[k]);
		}
		
		
		

	}

}
