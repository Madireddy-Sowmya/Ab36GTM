package pack_col;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionFirst {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add(700);
		a1.add(900);
		a1.add(65);
		a1.add(432);
		a1.add(43);
		//a1.add("Ram");
		//a1.add(85.65);
		a1.add(121);
		// a1.add(null);
		// a1.add(null);
		Collections.sort(a1);
		System.out.println(a1);
		

	}

}
