package SDetlevel2Assignment;

import java.util.Scanner;

public class SumofDigitsum
{
	public static int digitsum(int num)
	{
		int sum =0;
		while (num>0)
		{
			int last;
			last = num%10;
			num= num/10; 
			sum= sum + last;
		}
		return sum;
		
		/*
		 * public static int digitsumlogic() 
		 * { 
		 * int n=987; 
		 * while(n>9) 
		 * 	{   int sum=0;
		 * 			while(n>0)
		 * 				 { 
		 * 					int digit = n%10; 
		 * 					sum=sum+digit; 
		 * 					n=n/10;
		 *  			 } 
		 * 		n=sum;
		 *  }
		 * System.out.println(n);
		 * 
		 * }
		 */
	}
	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc = new Scanner(System.in);
		int number;
		number = sc.nextInt();
		int number1 = number;
		
		while (number1>9)
		{
			number1 = digitsum(number1);
			
		}
		
		System.out.println(number1);
		

	}

}
