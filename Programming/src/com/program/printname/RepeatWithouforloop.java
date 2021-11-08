package com.program.printname;

public class RepeatWithouforloop {

	 static void repeatname (int a )
		{
			if (a<=6)
			{
				System.out.println("Manish");
				a++;
				repeatname(a);
			}
		}
			
	public static void main(String[] args)
		{
		
		repeatname(1);
		
		}

	

}
