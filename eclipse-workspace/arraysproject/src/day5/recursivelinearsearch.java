package day5;

public class recursivelinearsearch 
{

	public static void main(String[] args) 
	{	int a[]= {1,2,3,4,5,6,7,8,9};
	int s=8;
	int i=0;
		linear l=new linear();
		int v=l.lin(a, s, i);
		if(v==1)
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("element not found");
		}
	}

}
class linear
{
	public int lin(int a[],int s,int i)
	{
		if(i<a.length)
			
		{
			if(a[i]==s)
				return 1;
			else
				return lin(a, s, i+1);
		}
		else 
			return -1;
	}
}
