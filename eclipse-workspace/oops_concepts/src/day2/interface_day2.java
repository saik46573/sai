package day2;

import java.util.Scanner;
public class interface_day2 
{
	public static void main(String[] args) 
	{
		fulltime f=new fulltime();
		f.name();
		f.name();
		f.role();
		f.price();
		parttime p=new parttime();
		p.name();
		p.name();
		p.role();
		p.price();
	}

}
interface b
{
	public void name();
	public void role();
	public void id();
	public void price();
}
class fulltime implements b
{
	Scanner sc =new Scanner(System.in);
	String role,name;
	int id,days;
	double prices,cost;
	fulltime()
	{
		System.out.println("enter the name");	
		 name =sc.next();
		System.out.println("enter the id");	
	     id =sc.nextInt();
		System.out.println("enter the role");	
		 role =sc.next();	
		System.out.println("enter number of working  days");	
		days =sc.nextInt();
		System.out.println("price");	
		 prices =sc.nextDouble();
	}
	public void name()
	{
	System.out.println(name);
	}
	public void role()
	{
		System.out.println(role);
	}
	public void id()
	{
		System.out.println(id);
	}
	public void price()
	{
		cost=days*prices;
		System.out.println(cost);
	}
	
}
class parttime implements b
{
	Scanner sc =new Scanner(System.in);
	String role,name;
	int id,hours;
	double prices,cost;
	parttime()
	{
		System.out.println("enter the name");	
		 name =sc.next();
		System.out.println("enter the id");	
		 id =sc.nextInt();
		System.out.println("enter the role");	
		 role =sc.next();	
		System.out.println("enter number working hello hours");	
		 hours =sc.nextInt();
		System.out.println("price");	
		 prices =sc.nextDouble();
	}
	public void name()
	{
	System.out.println(name);
	}
	public void role()
	{
		System.out.println(role);
	}
	public void id()
	{
		System.out.println(id);
	}
	public void price()
	{
		cost=hours*prices;
		System.out.println(cost);
	}
	
}
