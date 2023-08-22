package javaexam;

public class patternparametersmethod 
{

	public static void main(String[] args) 
	{
		Pattern12 p=new Pattern12();
		p.pattern1(1);

	}

}
class Pattern12
{
	public int pattern1(int x)
	{
		for(;x<6;x++)
		{
			
				for(int y=x;y>=1;y--)
				System.out.print(y); 
				System.out.println();
		}
		return 0;
	}
}
