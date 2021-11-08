package SDetlevel2Assignment;

public class REversingNo {

	public static void main(String[] args) 
	{
		int no = 12321;
		int orgnum =no;
		int rev =0 ;
		while(no>0)
		{
			int last =no%10;
			rev = 10*rev + last;
			no=no/10;
		}
		if(orgnum==rev)
		{
			System.out.println("The number is a palindrome");
		}
		else
		System.out.println("the number is not palindome");

	}

}
