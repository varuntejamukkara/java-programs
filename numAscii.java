package javasample;

import java.util.Scanner;

public class numAscii
{

	static char c='A';
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number");
			int num=sc.nextInt();
			int i=1;
			printsequence(i,num);
		
	}
	static void printsequence(int i,int num)
	{
		//char d=c;
		if(i<=num)
	    {	
			System.out.print(i+""+c);
			c++;
			printsequence(i+1,num);
	    }
		else if(num==0)
		{
			System.out.println("Invalid number");
		}
		/*else if(i<=num)
		{
			System.out.print(i+""+(char)c);
			c++;
			printsequence(i++,num);
		}*/
  
		
	
	}
}

