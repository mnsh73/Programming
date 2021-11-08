package SDet;


import java.util.LinkedHashSet;

public class Check_occurence_of_word_in_a_string_And_remove_duplicates {

	public static void main(String[] args) {
		String s = "Welcome to Banglore and Welcome to Testyantra";
		String [] str = s.split(" ");
		
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		for (int i =0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		for(String word :set)
		{
			System.out.print(word +"\t");
			
		}

	}

}
