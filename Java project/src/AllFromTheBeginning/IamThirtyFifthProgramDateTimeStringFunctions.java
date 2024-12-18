package AllFromTheBeginning;

import java.util.Date;

public class IamThirtyFifthProgramDateTimeStringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();//java util
		//Data class can be inherited
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		Date d3 = new Date(d1.getTime()+(1000*60*60*24+1));//here 1 stands for 1 day
		System.out.println(d3);
		Date d4 = new Date(d1.getTime()+(1000*60*60*24+2));//here 1 stands for 1 day
		System.out.println(d4);//here d4 is not a string
		//16-Sep-2024--(1)
		//Sep-16-2024
		//16/Sep/2024
		String timeformat1 = d4.toString();
		System.out.println(timeformat1);
		
		String day = timeformat1.substring(0, 3);
		System.out.println(day);
		String month = timeformat1.substring(4,7);
		System.out.println(month);
		String dateofmonth = timeformat1.substring(8, 10);
		System.out.println(dateofmonth);
		System.out.println(timeformat1.length());
		String year = timeformat1.substring(24, 28);
		System.out.println(dateofmonth.concat(month).concat(year));
		System.out.println(dateofmonth.concat("-").concat(month).concat("-").concat(year));
		System.out.println(dateofmonth.concat("/").concat(month).concat("/").concat(year));
		
		
		
		
	}

}
