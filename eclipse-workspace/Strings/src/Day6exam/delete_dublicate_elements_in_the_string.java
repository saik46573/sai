package Day6exam;

public class delete_dublicate_elements_in_the_string 
{

	public static void main(String[] args) 
	{
		String s1 ="Hello Good Morning";
		StringBuffer sb=new StringBuffer("");
		sb=sb.append(s1);
		String s2="";
		String s3="";
		
		for(int x=0;x<s1.length();x++)
		{
			for(int y=x+1;y<s1.length();y++)
			{
				if(s1.charAt(x)==s1.charAt(y))
				{
					s3=s3+s1.charAt(x);
					sb.replace(y, y+1,"0");					
				}
			}
		}
		System.out.println("after replace==> "+sb);
		System.out.println("dublicate words are ==> "+s3);
		for(int x=0;x<sb.length();x++)
		{
			if(sb.charAt(x)!='0')
			{
				s2=s2+sb.charAt(x);
			}
		}
		System.out.println("after delecting duclicate elements ==> "+s2);

	}

}
