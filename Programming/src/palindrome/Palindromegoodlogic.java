package palindrome;

public class Palindromegoodlogic {
	public static void main(String[] args)
	{
		String s1 = "mam";
		System.out.println("input string= " +s1);
		
		char [] ch= s1.toCharArray();
		
		for(int start=0,end=ch.length-1;start<end;start++,end--)
		{
			char temp = ch[start];
			ch[start]= ch[end];
			ch[end]= temp;
		}
		String s2 = new String(ch);
		System.out.println("Output String is= " +s2);
		if(s1.equals(s2))
		{
			System.out.println("The String is a palindrome");
		}
		else
		{
			System.out.println("The String is not a palindrome");
		}
		
	}


}
