package day3;

public class leftrotation
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,20,30,40,50,60};
		int x,temp=a[0];
		for(x=0;x<a.length-1;x++)
			a[x]=a[x+1];
		a[a.length-1]=temp;
		for(int r:a)
		System.out.println(r);	
			
	}

}
