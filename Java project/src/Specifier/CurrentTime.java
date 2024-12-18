package Specifier;

import java.util.Date;

public class CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2= new Date(d1.getTime());
		System.out.println(d2);
		//2 days from now future
		Date d3=new Date(d1.getTime()+(1000*60*60*24*1));//here 1 stands for one day
		System.out.println(d3);
		//2 days from now future
		Date d4=new Date(d1.getTime()+(1000*60*60*24*2));//here 2 stands for two days
		System.out.println(d4);
		String timeFormate1=d4.toString();
		System.out.println(timeFormate1);
		String day=timeFormate1.substring(0,3);
		System.out.println(day);
		String month=timeFormate1.substring(4,7);
		System.out.println(month);
		String dateofmonth=timeFormate1.substring(8,10);
		System.out.println(dateofmonth);
		System.out.println(timeFormate1.length());
		String year=timeFormate1.substring(24,28);
		System.out.println(year);
		//string out of bound exception
		System.out.println(dateofmonth.concat("-").concat(month).concat("-").concat(year));
		System.out.println(dateofmonth.concat("/").concat(month).concat("/").concat(year));
		
		
	}
  
}
