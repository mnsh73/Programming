package SDetlevel2Assignment;

import java.util.Scanner;

public class SumogDigit {

	public static int sumof(int num)
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
		
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc = new Scanner(System.in);
		int number;
		number = sc.nextInt();
		
		int total = sumof(number);

		System.out.println(total);
		

	}

}
