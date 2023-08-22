package day1;

public class interface_ 
{

	public static void main(String[] args) 
	{
		B b=new B();
		System.out.println(b.add());
		System.out.println(b.sub());
		System.out.println(b.mul());

	}

}
interface a
{
	public int add();
	public int sub();
	public int mul();
}
class B implements a
{ 
	int a,b,c;
	B()
	{
	a=10;b=20;c=0;	
	}
	public int  add()
	{
	c=a+b;	
	return c;
	}
	public int  sub()
	{
		c=a-b;
		return c;
	}
	public int  mul()
	{
		c=a*b;
		return c;
	}
	
}
