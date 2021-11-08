package SDet;
/**
 * Reverse a string without using length variable and length mehtod
 * @author MANISH
 *
 */
public class Reverse_the_string3_without_length {

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
		int count=0;
		char [] a = s.toCharArray();
		for (char ch :a)
		{
			count++;
		}
		System.out.print("Reversed string = ");
		//add the chareters from the last inside the empty string
		for(int i=count-1;i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
