package jpatterns;

import java.util.Scanner;

public class Pattern5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number");
			int num=sc.nextInt();
			char A='A';
			int a=1;
			for(int i=1;i<=num;i++)
			{
				for(int j=1;j<=i;j++)
					
				{
					System.out.print(a+""+A+" ");
					A++;
					a++;
					
				}
				System.out.println();
			}

	}

}
