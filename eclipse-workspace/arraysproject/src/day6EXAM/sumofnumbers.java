package day6EXAM;

public class sumofnumbers 
{

	public static void main(String[] args) 
	{
		sum s=new sum();
		int result=s.sum(100);
		System.out.println(result);
		

	}

}
class sum
{
	public int sum(int x)
	{ 
		if(x==0)
			return 0;
		else
			return x+sum(x-1);
	}
}
