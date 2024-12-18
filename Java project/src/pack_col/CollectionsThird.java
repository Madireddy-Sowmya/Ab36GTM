package pack_col;

import java.util.Collections;
import java.util.Vector;

public class CollectionsThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 =new Vector();
		v1.add(700);
		v1.add(900);
		v1.add(65);
		v1.add(432);
		v1.add(432); 
		v1.add(43);
	    //v1.add("Ram");
		// v1.add(85.65);
		v1.add(121);
		//v1.add(null);
		// v1.add(null);
		Collections.sort(v1);
		System.out.println(v1);


	}

}
