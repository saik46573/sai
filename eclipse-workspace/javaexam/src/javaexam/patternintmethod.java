package javaexam;

public class patternintmethod 
{

	public static void main(String[] args) 
	{
		Pattern123 p=new Pattern123();
		p.pattern1();

	}

}
class Pattern123
{
	public int pattern1()
	{
		for(int x=1;x<6;x++)
		{
			
				for(int y=x;y>=1;y--)
				System.out.print(y); 
				System.out.println();
		}
		return 0;
	}
}