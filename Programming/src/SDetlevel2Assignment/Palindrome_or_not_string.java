package SDetlevel2Assignment;

public class Palindrome_or_not_string
{

	

	public static void main(String[] args)
	{
		//int [] ar = {1,2,3,4,3,2,1,};
		String s = "HANNAH";
		char [] ar = s.toCharArray();
		
		int count = 0;
		
		for(int start =0,end=ar.length-1; start<ar.length/2 ; start++,end--)
		{
			if (ar[start]==ar[end])
			{
				count=1;
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println(" The entered String is Palindrom");
		}
		else
		{
			System.out.println("The String is not a palindrome");
		}

	}
}
