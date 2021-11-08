package palindrome;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check whether palindrom or not");
		String input, reverse ="";
		input= sc.next();
		int lnth = input.length();
		for(int i =lnth-1 ;i>=0;i--)
		{
			reverse= reverse+input.charAt(i);
		}
		if(input.equals(reverse))
		{
			System.out.println("The string is  a palindrom");
			
		}
		else
		{
			System.out.println("The string is not a palindrom");
			
		}
		
		
	}

}
