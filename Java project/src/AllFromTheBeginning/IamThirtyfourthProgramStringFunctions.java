package AllFromTheBeginning;

public class IamThirtyfourthProgramStringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Manish";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.length());
		String s1="   My name is Ram";
		System.out.println(s1);
		System.out.println(s1.trim());
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf('n'));
		System.out.println(name.substring(2));
		System.out.println(name.substring(2, 4));
		System.out.println(s1.substring(3, 5));
		System.out.println(s1.substring(6, 10));
		System.out.println(s1.substring(11, 13));
		System.out.println(s1.substring(14, 17));
		String name1="Sowmya";
		boolean a = name.equals(name1);
		boolean b = name.equals("Manish");
		System.out.println(a);
		System.out.println(b);
		String name2 = "sowmya";
		String name3 = "SOWMYA";
		boolean c = name2.equals(name3);
		System.out.println(c);
		System.out.println(name.concat(name2));
		boolean d =name1.endsWith("a");    
		System.out.println(d);
		boolean e = name2.contains("y");
		System.out.println(e);
		for(int i=0;i<6;i++)
		{
			System.out.println(name.charAt(i));
		}
		String f = "Sowmya";
		String g = "Manish";
		String h = "Pillarisitty";
		String output = f.concat(" ").concat(g).concat(" ").concat(h);
		System.out.println(output);
		
		
		
		
	}

}
