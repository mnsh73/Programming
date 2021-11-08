package SDet;
/**
 * Reversing the string With using third variable
 * @author MANISH
 *
 */
public class Reverse_the_string2 {

	public static void main(String[] args) {
		String s = "India";
		//Declare an empty string
		String rev= "";
		System.out.print("Original string = ");
		for(int i = 0; i<s.length(); i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.print("Reversed string = ");
		//add the chareters from the last inside the empty string
		for(int i=s.length()-1;i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
