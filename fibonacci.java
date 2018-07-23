package javasample;

import java.util.Scanner;

public class fibonacci {
	static int n1=0;
	static int n2=1;
	static int n3=0;
  public static void main(String[]args)
  {

	    
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
		int num=sc.nextInt();
		if(num==1)
		{
			System.out.print(0);
		}
		
		else if(num==2)
		{
			System.out.print(0+" "+1+" ");
		}
		else
		{
			System.out.print(0+" "+1+" ");
			fibo(num-2);
		}
  }

 static void fibo(int i)
  {
	
		if(i>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
			fibo(i-1);
			
		}
		
  }
}


