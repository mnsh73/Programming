package SDetlevel2Assignment;

import java.util.Scanner;

public class Prime_Display_out_upto_given_no {

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
		System.out.println("Enter the no upto you want to display");
		Scanner sc = new Scanner(System.in);
		int number  = sc.nextInt();
		System.out.println("entered no===> "+number);
		System.out.println("The Prime numbers upto "+number+" are ");
		int count=0;
		for(int num = 2; num<=number;num++)
		{
		boolean prime = checkNo(num);
			if(prime)
			{
				System.out.print(num+", ");
				count++;
			}
			
		}	
		System.out.println();
		System.out.println("Total Prime numbers ===> "+count);
	}

}
