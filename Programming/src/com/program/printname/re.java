package com.program.printname;

public class re {

	static void repeatname (int a )
	{
		if (a<=6)
		{
			System.out.println("Manish");
			a++;
			repeatname(a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		repeatname(1);

	}


}
