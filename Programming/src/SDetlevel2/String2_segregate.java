package SDetlevel2;

public class String2_segregate
{

	public static void main(String[] args)
	{
		String s = "Fa!$@L!s@go0D%65&8HFg53%";
		String alpha="",num="",schar="";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>+'a' && s.charAt(i)<='z'))
			{
				alpha=alpha+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else
			{
				schar =schar+s.charAt(i);				
			}
			
		}

		System.out.println(alpha);
		System.out.println(num);
		System.out.println(schar);
	}
	

}
