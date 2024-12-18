package AllFromTheBeginning;

import java.util.Arrays;
import java.util.Collections;

public class IamFortySeventhProgramArraysContinuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//given array is sorted in acceding order and descending order
		String name[] = {"Ram","Sita","Laxman"};//This program is only works of String input
		Arrays.sort(name);//acceding order
		System.out.println(Arrays.toString(name));
		Arrays.sort(name,Collections.reverseOrder());//descending order
		System.out.println(Arrays.toString(name));

	}

}
