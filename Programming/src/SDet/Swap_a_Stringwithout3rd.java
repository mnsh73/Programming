package SDet;
/**
 * swaping a string without using third variable
 * @author MANISH
 *
 */
public class Swap_a_Stringwithout3rd 
{
	public static void main(String[] args) {
		
		String s1 = "JAVA";
		System.out.println("First String = "+s1);
		
		String s2 = "Python";
		System.out.println("Second String = "+s2);
		s1 = s1+s2;
		s2 = s1.substring(0,s1.length()-s2.length());
		s1= s1.substring(s2.length());
		System.out.println("First String =  "+s1 +"  second String= "+s2);
	}

}
