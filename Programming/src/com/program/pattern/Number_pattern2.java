package com.program.pattern;

public class Number_pattern2
{
	public static void main(String[] args)
	{
		int count=1;
		int row , col, n=4 ;
		
		for(row=1;row<=n;row++)
		{
			for( col=1; col<=n; col++)
			{
			 if(row+col>=n+1)
			 {
				 System.out.print(count++ +" ");
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
