package day9;

import java.util.LinkedHashSet;

public class hashing_union 
{

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,7};
		int b[]= {5,6,7,8,9,0};
		LinkedHashSet h=new LinkedHashSet();
		LinkedHashSet h1=new LinkedHashSet();
		for(int x=0;x<a.length;x++) 
		{
			h.add(a[x]);
		}
		for(int x=0;x<b.length;x++) 
		{
			h1.add(b[x]);
		}
		h.addAll(h1);
		System.out.println(h);

	}

}
