package AllFromTheBeginning;

public class IamSixtyProgramTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double wt=85.65;
		int converted_wt =(int)wt;//explicit narrowing syntax 
		System.out.println(converted_wt);
		int salary=100000;
		double con_salary= salary;//implicit widening syntax
		System.out.println(con_salary);
		double con_salary1= (double)salary;//explicit widening syntax
		System.out.println(con_salary1);
		double at=86.5473;
		long con_at = (long)at;
		System.out.println(con_at);
		
		

	}

}
