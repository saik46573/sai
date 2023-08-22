package Day3;

public class concata 
{

public static void main(String[] args)
	{
		
			add c=new add();
			String s="hello";
			String s1="java";
			String d=c.con(s, s1);
			System.out.println(d);
	}

}
class add
	{
		public String con(String s,String s1)
		{
			String s3=s.concat(s1);
			return s3;
		}

		
	}




