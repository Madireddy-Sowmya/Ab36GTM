package pack_col;


import java.util.Collections;
import java.util.LinkedList;

public class CollectionsSecound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		l1.add(700);
		l1.add(900);
		l1.add(65);
		l1.add(432);
		l1.add(432); 
		l1.add(43);
		//l1.add("Ram");
		 // l1.add(85.65);
		l1.add(121);
		// l1.add(null);
		 //l1.add(null);
		Collections.sort(l1);
		System.out.println(l1);

	}

}
