package AllFromTheBeginning;
//Super keyword has to be used only in the case of method overriding concept to call the parent class method implementation
//together with the child class method implementation

class Hey
{
	void hen()
	{
		System.out.println("writting");
	}
}

public class IamTwentyFirstProgramSuperKeyword extends Hey{

		
			void hen()
			{
				super.hen();
				System.out.println(" not writting");
				
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				IamTwentyFirstProgramSuperKeyword y = new IamTwentyFirstProgramSuperKeyword();
				y.hen();

	}

}
