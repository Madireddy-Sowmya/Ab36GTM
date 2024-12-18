package Spackage;

import java.util.regex.Matcher;

public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Manish";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		//trim function only removes the space between beginning of the string and end of the string
		String s1="    My name      is Sowmya    ";
		System.out.println(s1);
		System.out.println(s1.trim());
		//charAt(index) it is going to give the character under given index
		//s1.indexof(char) it will give the index number
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf('n'));//doubt try to print the charter which is not in the string
		System.out.println(name.substring(2));
		System.out.println(name.substring(2,4));
		//my name is Sowmya calculate the length of the string 2)separate the words from the give string
		String name1="Sowmya is not going to office tomorrow";
		System.out.println(name1.length());
		System.out.println(name1.toCharArray().length);
		System.out.println(name1.lastIndexOf(""));
		System.out.println(name1.substring(0,6));
		System.out.println(name1.substring(7,9));
		System.out.println(name1.substring(10,13));
		System.out.println(name1.substring(20,22));
		System.out.println(name1.substring(23,29));
		System.out.println(name1.substring(30,38));
		/* equals is a function which checks if two of the strings are same
		 String a="Manish"
		 String b="Abishek";
		 a.equals()
		 */
		boolean a=name.equals("Manish");
		String name2="India";
		boolean b=name.equals(name2);
		System.out.println(b);
		System.out.println(a);
		String name3="india";
		String name4="INDIA";
		boolean d=name3.equals(name4);
		System.out.println(d);//string functions are case sensitive
		//endwith
		 String e = "Manish";
		boolean f= e.endsWith("sh");//it should be a string with ""double qouts
		//contains
		boolean g= e.contains("i");
		//concat-> concatenation
		String h="Sowmya";
		String t="Madireddy";
		String j =h.concat(t);
		System.out.println(j);
		System.out.println(f);
		System.out.println(g);
		// System.out.print() and System.out.println()
		String name5 ="Sowmya";
		int i;
		for(i=0;i<6;i++)
		{
			System.out.println(name5.charAt(i));
		}
		for(i=0;i<6;i++)
		{
			System.out.print(name5.charAt(i));
		}
		String l =" ".concat(h).concat(" ").concat(t).concat(" ").concat(name5);
		System.out.println(l);
		 

		
		
		
		
		

	}

}
