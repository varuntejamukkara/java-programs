package javasample;

import java.util.Scanner;

public class AsciiToLetter {
	static char c='A';
	static char d='a';
	static char A='A';
	static char a='a';
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
		
			System.out.println(i+" - "+c+" - "+d);
			System.out.println("------------");
			System.out.println("    "+(int)A+"  "+(int)a);
			System.out.println();
			A++;
			a++;
			c++;
			printsequence(i+1,num);
	}
		/*else if(i<=num)
		{
			System.out.print(i+""+(char)c);
			c++;
			printsequence(i++,num);
		}*/
  
		
	
	}

}
