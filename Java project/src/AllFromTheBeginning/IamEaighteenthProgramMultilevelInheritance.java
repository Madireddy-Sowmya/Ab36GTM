package AllFromTheBeginning;
//In Multilevel Inheritance one sub class will Inherit the properties of one super class witch Intern will try to inherit the properties from one super most class
//MLI can be done with minimum three classes & maximum any number of classes
		class Super
		{
			int x=9;
			static void car1()
			{
				System.out.println("Hai i am a car1");
			}
			void bus1()
			{
				System.out.println("Hai i am a bus1");
			}

			
		}

		class Lower  extends Super {
			
			static void car()
			{
				System.out.println("Hai i am a car");
			}
			void bus()
			{
				System.out.println("Hai i am a bus");
			}
		}
		public class IamEaighteenthProgramMultilevelInheritance extends Lower
		{
			static void car2()
			{
				System.out.println("Hai i am a car2");
			}
			void bus2()
			{
				System.out.println("Hai i am a bus2");
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				car();
				car1(); 
				car2();
				IamEaighteenthProgramMultilevelInheritance p = new IamEaighteenthProgramMultilevelInheritance();
				p.bus();
				p.bus1();
				p.bus2();
				System.out.println(p.x);


	}

}
