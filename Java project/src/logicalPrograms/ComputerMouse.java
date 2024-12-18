package logicalPrograms;

public class ComputerMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		for(int i=0;i<=n;i++)
		{
			if(i%3==0)
			{
				System.out.println("computer"+i);
			}
			if(i%5==0)
			{
				System.out.println("mouse"+i);
			}
			if(i%3==0&&i%5==0)
			{
				System.out.println("computermouse"+i);
			}
		}

	}

}
