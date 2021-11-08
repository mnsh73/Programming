package SDet;
/**
 * Reverse a string without using third variable
 * @author MANISH
 *
 */
public class Reverse_the_string1 {

	public static void main(String[] args)
	{
		String s = "India";
		System.out.print("Original string = ");
		for(int i = 0; i<s.length(); i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.print("Reversed string = ");
		for(int i=s.length()-1;i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
	

	}

}
