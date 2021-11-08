package SDetlevel2;

import java.util.Scanner;

public class PrimeNOCheck {
	
	
	static boolean checkNo(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
			return false;
			}
			
		}
		return true;
		
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter the no you want to check");
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		
		System.out.println("entered no===> "+num);
		
		if(num!=0 && num!=1)
		{
			boolean prime = checkNo(num);
				
				if(prime)
				{
					System.out.println(num +" ==> is a prime number");
				}
				else
					System.out.println(num +" ==> is not a prime number");	
		}
		else
		{
			System.out.println(num +" ==> is not a allowed  number");
		}

	}

}
