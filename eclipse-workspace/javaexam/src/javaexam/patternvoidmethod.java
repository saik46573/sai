package javaexam;

public class patternvoidmethod
{
	public static void main(String Args[])
	{
		Pattern1234 p=new Pattern1234();
		p.pattern1();
	}

}
class Pattern1234
{
	public void pattern1()
	{
		for(int x=1;x<6;x++)
		{
			
				for(int y=x;y>=1;y--)
				System.out.print(y); 
				System.out.println();
		}
	}
}
