package javasample;

import java.util.Scanner;

public class oneAoneAoneA 
{
	private static final char A = 0;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number");
			int num=sc.nextInt();
			printsequence(num);
		
	}
	static void printsequence(int num)
	{
		char a=A;
		if(num>=1)
	{	
		if(num==1)
		{
			System.out.print("1"+"A");
		}
		else
		{
			System.out.print("1"+"A");
			printsequence(num-1);
		}
  }
		else
			System.out.println("Invalid number");
	}
}
