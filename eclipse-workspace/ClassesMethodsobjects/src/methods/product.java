package methods;
import java.util.*;
class product1
{
	//Scanner sc=new Scanner(System.in);
	//System.out.println("enter the product name");
	String name;
	//System.out.println("enter the quantity");
	int q;
	//System.out.println("enter the price");
	double p,d,t,ft;
	public void total()
	{
		t=p*q;
		System.out.println("total "+t);
	}
	public void discount()
	{
		if(t>=5000)
		{
			d=(15/100.0)*t;
			System.out.println("discount "+d);
		}
		else 
		{
			d=(5/100.0)*t;
			System.out.println("discount  "+d);
		}
	}
	public void finaltotal()
	{
		ft=t-d;
		System.out.println("finaltotal "+ft);
	}
}

public class product
{

	public static void main(String[] args) 
	{
		
		product1 p1=new product1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the product name");
		p1.name=sc.next();
		System.out.println("enter the quantity");
		p1.q=sc.nextInt();
		System.out.println("enter the price");
		p1.p=sc.nextInt();
		p1.total();
		p1.discount();
		p1.finaltotal();
		
		
	}

}
