package NewStringFunctions;

public class StringFunctions6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Happy";
		String output=a.replace("a", "");
		System.out.println(output);
		String b="Happy";
		String output1=a.replace("a", "q");
		System.out.println(output1);
		//in a given string replace all the alphabets 
		String c="m@the6666flash167r1a0430";
		String output2=c.replaceAll("[a-z]","");
		System.out.println(output2);
		String d="M@THE6666FLASH167R1A0430";
		String output3=d.replaceAll("[A-Z]","");
		System.out.println(output3);
		String e="Ram Tiwari";
		String output4=e.replaceAll("Ram Tiwari","Tiwari Ram");
		System.out.println(output4);
		


	}

}
