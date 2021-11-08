package com.program.printname;

public class Reversestring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Manish";
		char [] ch = s1.toCharArray();
		
		String out="";
		for(int i= ch.length-1 ; i>=0; i--)
		{
			out= out+ch[i];
		}
		System.out.println(out);
	}

}
