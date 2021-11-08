package SDetlevel2;

public class SortArray_in_Assending_Order {

	public static void main(String[] args) 
	{
		int [] ar = {30,20,10,60,25,5};
		System.out.println("input array is ");
		for(int i= 0 ; i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}
		
		//sort
		//first for loop for picking the no from array
		for(int i= 0 ; i<ar.length;i++)
		{
			//second for loop is for comparing with the rest
			for(int j=i+1;j<ar.length;j++)
			{
				// if condition to check 
				if(ar[i]>ar[j])
				{
					int temp = ar[i];
					ar[i]= ar[j];
					ar[j]= temp;
				}
				
			}
		}
		System.out.println();
		System.out.println("output array is ");
		for(int i= 0 ; i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}
		//minimum no
		System.out.println();
		System.out.println("minimum no " + ar[0]);
		System.out.println("maximum no " + ar[ar.length-1]);
		

	}

}
