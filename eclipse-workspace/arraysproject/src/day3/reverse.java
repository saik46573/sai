package day3;


public class reverse {

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4};
		int n=a.length-1,x,temp;
		for(x=0;x<a.length/2;x++)
		{
			temp=a[x];
			a[x]=a[n-x];
			a[n-x]=temp;
		}
		for(x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
	}

}
