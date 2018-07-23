package javasample;

import java.util.Scanner;

public class ArmstrngNumber {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int count=0;
		int temp=num;
		int sum=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		num=temp;
		while(num>0)
		{
			int rem=num%10;
			int res=1;
			for(int i=1;i<=count;i++)
			{
				res*=rem;
			}
				sum+=res;
				num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(sum+" is a armstrong number");
		}
		else
		{
			System.out.println(num+" is not a armstrong number");
		}
	}

}
