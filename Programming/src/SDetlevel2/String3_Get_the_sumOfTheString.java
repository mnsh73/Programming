package SDetlevel2;

public class String3_Get_the_sumOfTheString {

	public static void main(String[] args) {
		String s= "Aa1b2e4fk35r7";
		int sum=0,n=0;
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				n = s.charAt(i)-48;
				sum = sum+ n;				
			}			
		}
		
		System.out.println("sum of the numbers in the String  "+sum);

	}

}
