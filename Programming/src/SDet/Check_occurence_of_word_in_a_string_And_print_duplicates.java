package SDet;

import java.util.HashSet;

public class Check_occurence_of_word_in_a_string_And_print_duplicates {

	public static void main(String[] args) {
		String s = "Welcome to Banglore and Welcome to Testyantra";
		String [] str = s.split(" ");
		
		HashSet<String> set= new HashSet<String>();
		for (int i =0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		for(String word :set)
		{
			int count =0;
			for(int i =0; i<str.length; i++)
			{
				if (word.equals(str[i]))
				{
					count++;
					
				}
				
			}
			if(count>1)
			{
			System.out.print(word +" repeated  "+count+" times ");
			System.out.println();
			}
		}
	}

}
