package day5;

public class recresivebinarysearch 
{

	public static void main(String[] args) 
	{
	    int a[]= {1,2,3,4,5,6,7,8,9};
		rec r=new rec();
		int s=10;
		int v=r.recu(a, a[0],a.length-1,s);
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
class rec
{
	public int recu(int a[],int low,int high,int s)
	{
		if(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]<s)
			{
				return recu(a,mid+1, high, s);
			}
			else if(a[mid]>s)
			{
				return recu(a, low,mid-1, s);
			}
			else
				return 1;
			
		}
		else
		return-1;
		
	}
}
