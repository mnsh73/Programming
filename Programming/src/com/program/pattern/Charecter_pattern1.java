package com.program.pattern;

public class Charecter_pattern1 
{
	
		public static void main(String[] args)
		{
			char charr='A',charr2='a';
			
			int row , col, n=4 ;
			
			for(row=1;row<=n;row++)
			{
				for( col=1; col<=n; col++)
				{
				 if(row>=col)
				 {
					 System.out.print(charr++);
					 System.out.print(charr2++ +" ");
				 }
				 else
				 {
					 System.out.print("  ");
				 }
				}
				System.out.println();
				
				
			}
			
		}

	

}
