package SDetlevel2;

public class String5_swap_the_First_and_lastWord {

	public static void main(String[] args) 
	{
		String s= "Faisal welcome Goa";
		String[] str = s.split(" ");
		String temp = str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		for (int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}

}
