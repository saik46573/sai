package Day1;

public class numberOfWords 
{

	public static void main(String[] args) 
	{
		int count=0;
	  String s="   hello  all  good      hjjhm    afternoon ";
	  String s1=s.trim();
	  for(int x=0;x<s1.length();x++)
	  {
		  if(s1.charAt(x)==' '&&s1.charAt(x+1)!=' ')
		  {
			  count++;
			 
		  }
		
		}
	  System.out.println("number of words "+(count+1));
	  

	}

}
