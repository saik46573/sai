package Day1;

public class count_vowels
{

	public static void main(String[] args)
	{
		int c=0,d=0;
		 String s="Hello  all  good  afternoon";
		 for(int x=0;x<s.length();x++)
		 {
			 if(s.charAt(x)=='a'||s.charAt(x)=='A'||s.charAt(x)=='e'||s.charAt(x)=='E'||s.charAt(x)=='i'||s.charAt(x)=='I'||s.charAt(x)=='o'||s.charAt(x)=='O'||s.charAt(x)=='u'||s.charAt(x)=='U')
			 {
				 c++;
			 }
			 else if(s.charAt(x)==' ')
			 continue;
			 else
				 d++;
		 }
		 System.out.println("vowels ="+c);
		 System.out.println("constants ="+d);

	}

}
