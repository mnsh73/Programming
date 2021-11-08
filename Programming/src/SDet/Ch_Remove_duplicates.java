package SDet;

import java.util.LinkedHashSet;

public class Ch_Remove_duplicates 
{
	public static void main(String[] args) {
		// declare a String and initialise
				String s = "india";
				//create set of collection and ad add all the given string into set
				// mention the object return type as Character
				
					//HashSet <Character> set = new HashSet<Character>();
				//To remove duplicates we need to use Linked hashSet
				LinkedHashSet <Character>set = new LinkedHashSet<Character>();
					
				//add the string charaters inside the set
					
				for(int i =0; i<=s.length()-1; i++)
				{
					set.add(s.charAt(i));
					
				}
				//compare each charecter inside the set with the string and if it is matching 
				// increament the valu of count
				
				
				//to fetch the element of set 
				//return type of set is object , so create a wrapper class return of that object
				for (Character ch :set)
				{
					
					/*no need to for any logic cause set by default remove the duplicates
					 * int count = 0; // to compare set elements with the string for (int i=0;
					 * i<s.length();i++) { if (ch==s.charAt(i)) { count++; } } if (count==1)
					 */
					
						System.out.print(ch );
					
				//System.out.println(ch +"  occurence   "+count);
				}
	}

}
