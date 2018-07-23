package jpatterns;

import java.util.Scanner;

public class Pattern7
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			char a='A';
			int temp=1;
			
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
				System.out.print(temp+++" ");
				}
				else
				{
					System.out.print(a+++" ");
				}
			}
			
			
			System.out.println();
		}
	}

}
