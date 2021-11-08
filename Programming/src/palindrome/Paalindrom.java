package palindrome;

public class Paalindrom {

	public static void main(String[] args) {
		
		int n = 5436345;
		int sum=0;
		int r,temp;
		temp= n;
		while(n>0)
		{
			r= n%10;
			sum= sum*10 +r;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("The num ber is Palindrome");
		}
		else
		{
			System.out.println("The number is not Palindrome");
		}
	}

}
