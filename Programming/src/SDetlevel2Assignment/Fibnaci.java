package SDetlevel2Assignment;

import java.util.Scanner;

public class Fibnaci {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number upto which fibnc should display");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("The First "+number+" are");
		int num1 = 0, num2 = 1, num3=0;
		System.out.print(num1+", ");
		System.out.print(num2+", ");
		int count=2;
		for(int i = 2; i<number; i++)
		{
			num3 = num2+num1;
			System.out.print(num3+", ");
			count++;
			num1=num2;
			num2=num3;
			
		}
		
		System.out.println(" total ==>> "+count);

	}

}
