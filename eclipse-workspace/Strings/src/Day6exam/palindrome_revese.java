package Day6exam;

public class palindrome_revese
{

	public static void main(String[] args) 
	{
		String s="madam arora hello teacher malayalam";
		String s1[]=s.split(" ");
		String s3="";
		int count=0;
		for(int x=0;x<s1.length;x++)
		{ 
			s3="";
			String s2=s1[x];
			for(int y=s2.length()-1;y>=0;y--)
			{
				s3=s3+s2.charAt(y);
			}
			if(s3.equals(s2))
			{
				count++;
			}
			else
			{
				System.out.println("not  palindromes== >"+s3);
				
			}
			
		}
		System.out.println("number of palindromes== >"+count);
		

	}

}