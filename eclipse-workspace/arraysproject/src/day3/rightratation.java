package day3;

public class rightratation 
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,20,30,40,50,60};
		int x,temp=a[a.length-1];
		for(x=a.length-1;x>0;x--)
			a[x]=a[x-1];
		a[0]=temp;
		for(int r:a)
		System.out.println(r);	
	}

}
