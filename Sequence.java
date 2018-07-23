package javasample;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number");
			int num=sc.nextInt();
			printsequence(1,num);
			
	}
	static void printsequence(int i,int num)
	{
		if(i<num)
	   {
		System.out.print(i+" ");
		printsequence(i+1,num);
	   }
	System.out.print(i+" ");
	}

}
