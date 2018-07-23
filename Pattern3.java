package jpatterns;

import java.util.Scanner;

public class Pattern3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number");
			int num=sc.nextInt();
			for(int i=1;i<=num;i++)
			{
				char A='A';
 
				for(int j=1;j<=i;j++)
					
				{
					System.out.print(A+" ");
					A++;
					
				}
				System.out.println();
			}

	}

}
