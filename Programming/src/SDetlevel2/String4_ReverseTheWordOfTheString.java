package SDetlevel2;

public class String4_ReverseTheWordOfTheString {

	public static void main(String[] args) {
		String s= "Welcome to Goa Singham";
		String [] str = s.split(" ");
		for (int i =str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+"\t");
		}
	}

}
