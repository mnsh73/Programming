package com.program.printname;

public class Reversestring {
	public static void main(String[] args)
	{
		String s1 = "Manish";
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
		
	}

}
