package ijPatterns;

import java.util.Scanner;

public class Pattern3 
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
		int num=sc.nextInt();
		int temp=1;
		char a='A';
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
				System.out.print(a+++" ");
				}
				else
				{
					System.out.print(temp+++" ");
				}
			}	
			System.out.println();
		}
	}

}
