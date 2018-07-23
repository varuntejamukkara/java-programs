package javasample;

import java.util.Scanner;

class Factorial {
	public static void main(String[]args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		
		int fact=1;
		while(num>1)
		{
			fact=fact*num;
			num--;
		}
		System.out.println(fact);
		
	}
}
