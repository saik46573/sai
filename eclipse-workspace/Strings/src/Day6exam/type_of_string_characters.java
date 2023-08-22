package Day6exam;

public class type_of_string_characters 
{

	public static void main(String[] args) 
	{
		String s1 ="Hello Good Morning @ Thursday - 8/5/2023";
		s1.trim();
		String s[]=s1.split(" ");
		char c[]=s1.toCharArray();
		int small=0,vowels=0,consonents=0,capital=0,number=0,space=0,symbol=0,words=0,character=0;
		for(int x=0;x<s1.length();x++)
		{
			if(c[x]>='a'&&c[x]<='z')
			{
				 if(s1.charAt(x)=='a'||s1.charAt(x)=='e'||s1.charAt(x)=='i'||s1.charAt(x)=='o'||s1.charAt(x)=='u')
				 {
					vowels++;
				 }
				 else
				 {
					 consonents++;
				 }
				 small++;
				
			}
			else if(c[x]>='A'&&c[x]<='Z')
			{
				 if(s1.charAt(x)=='A'||s1.charAt(x)=='E'||s1.charAt(x)=='I'||s1.charAt(x)=='O'||s1.charAt(x)=='U')
				 {
					vowels++;
				 }
				 else
				 {
					 consonents++;
				 }
				capital++;
				
			}
			else if(c[x]>='0'&&c[x]<='9')
			{
				number++;
				
			}
			
			else if(c[x]==' ')
			{
				space++;
				
			}
			else
			{
				symbol++;
			}
			character ++;
		}
		for(int x=0;x<s.length;x++)
		{
			words++;
		}
		System.out.println("number of capitals==>"+capital);
		System.out.println("number of small==>"+small);
		System.out.println("number of vowels==>"+vowels);
		System.out.println("number of consonents==>"+consonents);
		System.out.println("number of number==>"+number);
		System.out.println("number of space==>"+space);
		System.out.println("number of symbol==>"+symbol);
		System.out.println("number of characters==>"+character);
		System.out.println("number of words==>"+words);

	}

}
