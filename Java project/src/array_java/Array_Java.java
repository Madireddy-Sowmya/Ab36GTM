package array_java;

import java.util.Arrays;

public class Array_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]=new String[3];
		name[0]="Manish";
		name[1]="Sowmya";
		name[2]="hello";
		for(int i=0;i<3;i++)
		{
		System.out.println(name[i]);
		}
		char gender[]=new char[3];
		gender[0]='M';
		gender[1]='F';
		gender[2]='M';
		for(int i=0;i<3;i++)
		{
		System.out.println(gender[i]);
		}
		int t[]=new int[3];
		t[0]=200;
		t[1]=400;
		t[2]=600;
		for(int i=0;i<3;i++)
		{
		System.out.println(t[i]);
		}
		byte s[]=new byte[3];
		s[0]=1;
		s[1]=2;
		s[2]=3;
		for(int i=0;i<3;i++)
		{
		System.out.println(s[i]);
		}
		short r[]=new short[3];
		r[0]=2;
		r[1]=4;
		r[2]=6;
		for(int i=0;i<3;i++)
		{
		System.out.println(r[i]);
		}
		double q[]=new double[3];
		q[0]=2.8;
		q[1]=4.9;
		q[2]=6.7;
		for(int i=0;i<3;i++)
		{
		System.out.println(q[i]);
		}
		float p[]=new float[3];
		p[0]=2.8f;
		p[1]=4.8f;
		p[2]=6.9f;
		for(int i=0;i<3;i++)
		{
		System.out.println(p[i]);
		}
		long o[]=new long[3];
		o[0]=20987;
		o[1]=48655;
		o[2]=67656;
		for(int i=0;i<3;i++)
		{
		System.out.println(o[i]);
		}
		boolean l[]=new boolean[3];
		l[0]=true;
		l[1]=false;
		l[2]=true;
		for(int i=0;i<3;i++)
		{
		System.out.println(l[i]);
		}
		/*int m[]=new int[3];
		m[0]=2;
		m[1]=49876549899;
		m[2]="yguuugu";
		for(int i=0;i<3;i++)
		{
		System.out.println(m[i]);
		}
		*/
		int j[]=new int[4];
		j[0]=20;
		j[1]=40;
		j[2]=60;
		j[3]=80;
		int k=0;
		for(int i=0;i<3;i++)
		{
			
		if(j[i]==45)
		{
			
			k++;
		}
		}
		if(k>0)
		{
			System.out.println("number present");
		}
		else
		{
			System.out.println("number not present");
		}
		//give me the sum of all the elements we have in array
		int f[]= {2,4,6,8};  
		int sum=0;
		for(int i=0;i<=f.length-1;i++)
		{
			sum=sum+f[i];
		}
		System.out.println("result:"+sum);
		int z[]= {2,-4,6,8,-9};  
		int sum1=0;
		for(int i=0;i<=z.length-1;i++)
		{
			sum1=sum1+z[i];
		}
		System.out.println("result1:"+sum1);
		//copy one array value inside another array by iterating
		int array1[]= {45,85,74,69};
		int newarray[]=new int[array1.length];
		for (int i=0;i<=array1.length-1;i++)
		{
			//a=10 that means in java every thing will transfer from right to left
			newarray[i]=array1[i];
		}
		System.out.println("the newarray is="+Arrays.toString(newarray));

		//reverse the elements in the array
		int myarray[]= {45,85,74,69};
		int reverse[]=new int[myarray.length];
		for (int i=myarray.length-1,x=0;i>=0;i--)
		{
			reverse[x]=myarray[i];
			x++;
		}
		System.out.println("the newarray is="+Arrays.toString(reverse));
		
		}
		

	}


