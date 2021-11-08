package SDet;
/**
 * reverse two numbers without using a third variable
 * @author MANISH
 *
 */

public class Swap_Two_numbers_without_third_variable 
{

	public static void main(String[] args)
	{
		
		System.out.println("reverse two numbers without using a third variable");
		int a = 10;
		int b = 30;
		System.out.println("a= "+a+"  b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after change");
		System.out.println("a= "+a+"  b= "+b);
	}
}
